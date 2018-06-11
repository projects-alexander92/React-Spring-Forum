package com.config;

import com.config.interceptors.FixNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMVC extends WebMvcConfigurerAdapter
{
    private final FixNotFound fixNotFoundInterceptor;

    @Autowired
    public WebMVC(FixNotFound fixNotFoundInterceptor)
    {
        this.fixNotFoundInterceptor = fixNotFoundInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(this.fixNotFoundInterceptor);
        super.addInterceptors(registry);
    }
}
