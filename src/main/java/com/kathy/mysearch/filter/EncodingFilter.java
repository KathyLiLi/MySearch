package com.kathy.mysearch.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *@Author feri
 *@Date Created in 2018/12/3 17:11
 */
//@WebFilter("/*")
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("编码格式转换：");

        HttpServletRequest request=(HttpServletRequest)servletRequest;
        System.out.println("请求之前："+request.getParameter("name"));
        request.setCharacterEncoding("UTF-8");
        System.out.println("请求之后："+request.getParameter("name"));
        filterChain.doFilter(request,servletResponse);
    }
}