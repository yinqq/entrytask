package com.entrytask.interceptors;

import com.entrytask.utils.JsonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ApiInterceptor implements HandlerInterceptor {

    @Override
    //在请求处理之前进行调用
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("cashloan拦截到请求");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> msg = new HashMap<>();
        msg.put("Result", "ok");
        msg.put("Service", "cashloan");
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.print(JsonUtils.obj2StringPretty(msg));
        } catch (IOException e) {
            System.out.println("拦截器输出流异常" + e);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
