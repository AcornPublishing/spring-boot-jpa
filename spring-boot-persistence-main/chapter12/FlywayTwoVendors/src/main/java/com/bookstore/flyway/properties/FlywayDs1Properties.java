package com.bookstore.flyway.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Component
@Validated
@ConfigurationProperties(prefix = "app.flyway.ds1")
public class FlywayDs1Properties {
    @NotEmpty
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
