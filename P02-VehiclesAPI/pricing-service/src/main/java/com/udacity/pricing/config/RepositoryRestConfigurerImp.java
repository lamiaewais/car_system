package com.udacity.pricing.config;

import com.udacity.pricing.domain.price.Price;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;

@Configuration
public class RepositoryRestConfigurerImp implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Price.class);
        config.setDefaultMediaType(MediaType.APPLICATION_JSON_UTF8);
    }
}