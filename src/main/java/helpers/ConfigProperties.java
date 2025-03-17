package helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:src/main/resources/config.properties"})

public interface ConfigProperties extends Config {
    @Config.Key("base.url")
    String baseUrl(String url);
}