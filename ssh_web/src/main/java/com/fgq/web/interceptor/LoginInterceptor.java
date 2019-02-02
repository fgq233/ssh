package com.fgq.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * SpringMVC拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 作用于controller层方法执行之前，true放行，false不放行
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        String uri = request.getRequestURI();
//
//        if (!uri.contains("login")) {
//            String user = (String) request.getSession().getAttribute("userSession");
//            if (user == null) {
//                response.sendRedirect(request.getContextPath() + "/login");
//                return false;
//            }
//        }
        return true;
    }


    /**
     * 作用于controller层方法执行之后，只有在所有拦截器preHandle()全放行情况下才调用
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    }

    /**
     * 作用于页面渲染后，只有在preHandle()返回true才执行
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    }
}
