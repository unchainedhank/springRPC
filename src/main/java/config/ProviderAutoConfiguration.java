package config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Map;

@PostConstruct
@Slf4j
@Configuration
public class ProviderAutoConfiguration {
    public void init() {
        log.info("server started");

    }
}
