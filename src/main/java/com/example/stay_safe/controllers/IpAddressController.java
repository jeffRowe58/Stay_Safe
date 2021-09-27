package com.example.stay_safe.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpAddressController {
    private static String ipAddress;
    @Component
    public static class IPAddressInterceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
            ipAddress = request.getHeader("X-Forward-For");
            if(ipAddress == null){
                ipAddress = request.getRemoteAddr();
            }
            System.out.println(ipAddress);
            return false;
        }
    }
}
