package com.config.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class FixNotFound extends HandlerInterceptorAdapter
{

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
        if ((response.getStatus() / 100) >= 4)
        {
            response.sendRedirect("/");
        }
        super.postHandle(request, response, handler, modelAndView);

    }
}
