package com.tav.timeofdayservice.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("time-of-day-service")
@Configuration
public class TimeOfDayConfig {
    @Getter
    @Value("${evening-threshold}")
    private int eveningThreshold;

    @Getter
    @Value("${afternoon-threshold}")
    private int afternoonThreshold;
}

