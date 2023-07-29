package com.sample.configclient.configclient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "abc")
@Getter
@Setter
@ToString
public class Sample {
    String name;
}
