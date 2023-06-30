package com.bridle.quake.reader;

import com.bridle.core.components.http.SimpleHttpOutEndpointProducerBuilderFactory;
import com.bridle.core.components.kafka.SimpleKafkaOutEndpointProducerBuilderFactory;
import com.bridle.core.components.sheduler.SimpleSchedulerEndpointConsumerBuilderFactory;
import com.bridle.core.configuration.SimpleBridleConfiguration;
import com.bridle.core.properties.PropertiesLoader;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SimpleBridleConfiguration.class})
public class AppConfiguration {

    @Bean
    EndpointConsumerBuilder scheduler(PropertiesLoader propertiesLoaderService) {
        return new SimpleSchedulerEndpointConsumerBuilderFactory(propertiesLoaderService).create();
    }

    @Bean
    EndpointProducerBuilder httpOut(PropertiesLoader propertiesLoaderService) {
        return new SimpleHttpOutEndpointProducerBuilderFactory(propertiesLoaderService).create();
    }

    @Bean
    EndpointProducerBuilder kafkaOut(PropertiesLoader propertiesLoaderService) {
        return new SimpleKafkaOutEndpointProducerBuilderFactory(propertiesLoaderService).create();
    }
}
