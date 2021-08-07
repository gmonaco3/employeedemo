package com.example.employeedemo.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean(name = "myModelMapper")
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
