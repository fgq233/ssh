package com.fgq.web.aop;

import com.fgq.util.data.AjaxReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * SpringMVC全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 业务异常拦截
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public AjaxReturn exceptionHandle(Exception e) {
        logger.error(e.getMessage());
        return new AjaxReturn(false, e.getMessage());
    }


    private void assertAjax(HttpServletRequest request, HttpServletResponse response) {
        if (request.getHeader("x-requested-with") != null
                && "XMLHttpRequest".equalsIgnoreCase(request.getHeader("x-requested-with"))) {
            //如果是ajax请求响应头会有，x-requested-with
            response.setHeader("sessionstatus", "timeout");//在响应头设置session状态
        }
    }
}
