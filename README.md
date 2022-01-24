# earthquake

Simple service to monitor earthquakes
# To build locally
Change settings.xml like this and fill in your personal github tocken
```
<servers>
    <server>
        <id>github</id>
        <username>YOUR_USERNAME</username>
        <password>YOUR_AUTH_TOKEN</password>
    </server>
</servers>
```
Replace the YOUR_USERNAME with your GitHub login name.
Replace the YOUR_AUTH_TOKEN with a generated GitHub personal access token:
GitHub > Settings > Developer Settings > Personal access tokens > Generate new token:

**The token needs at least the read:packages scope. Otherwise you will get a Not authorized exception.**