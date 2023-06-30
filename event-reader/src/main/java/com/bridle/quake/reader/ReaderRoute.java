package com.bridle.quake.reader;

import com.bridle.core.routebuilder.BaseRouteBuilder;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ReaderRoute extends BaseRouteBuilder {

    @Autowired
    EndpointConsumerBuilder scheduler;
    @Autowired
    EndpointProducerBuilder httpOut;
    @Autowired
    EndpointProducerBuilder kafkaOut;

    @Override
    public void configure() {
        from(scheduler)
                .routeId("quakeEventReader")
                .to(httpOut)
                .convertBodyTo(String.class)
                .to(kafkaOut);
    }
}
