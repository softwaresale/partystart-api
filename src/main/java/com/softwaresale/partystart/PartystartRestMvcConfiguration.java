package com.softwaresale.partystart;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class PartystartRestMvcConfiguration implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
	}

	@Override
	public void configureConversionService(ConfigurableConversionService conversionService) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureConversionService(conversionService);
	}

	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureValidatingRepositoryEventListener(validatingListener);
	}

	@Override
	public void configureExceptionHandlerExceptionResolver(ExceptionHandlerExceptionResolver exceptionResolver) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureExceptionHandlerExceptionResolver(exceptionResolver);
	}

	@Override
	public void configureHttpMessageConverters(List<HttpMessageConverter<?>> messageConverters) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureHttpMessageConverters(messageConverters);
	}

	@Override
	public void configureJacksonObjectMapper(ObjectMapper objectMapper) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureJacksonObjectMapper(objectMapper);
	}
}
