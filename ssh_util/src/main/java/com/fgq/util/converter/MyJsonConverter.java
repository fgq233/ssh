package com.fgq.util.converter;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

public class MyJsonConverter extends MappingJackson2HttpMessageConverter {

    public MyJsonConverter() {
        super.getObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

}

