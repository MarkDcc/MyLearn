package com.Gordon.AOP.config;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan( value = {"com.Gordon.AOP"})
@EnableAspectJAutoProxy
public class AopConfig {

}
