package com.josiah.exception;

import com.josiah.vo.BaseResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @title: GlobalExceptionHandler
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 13:37
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = BussException.class)
    public BaseResp bussExceptionHandler(BussException bussException){
        String msg = bussException.getMsg();
        Integer code = bussException.getCode();
        return BaseResp.error(code,msg);
    }
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public BaseResp methodArgumentHandler(HttpServletRequest request,MethodArgumentNotValidException e){
        BaseResp resp = new BaseResp();
        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors =
                bindingResult.getFieldErrors();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (FieldError fieldError : fieldErrors) {
            String message = fieldError.getDefaultMessage();
            sb.append(fieldError.getField())
                    .append("]:").append(message);
        }
        log.error("请求URL:{},参数错误{}",request.getContextPath()+"/"+request.getRequestURI(),sb.toString());
        resp.setCode(40000);
        resp.setMsg(sb.toString());
        return resp;
    }

    @ExceptionHandler(value = RuntimeException.class)
    public BaseResp runTimeHandler(RuntimeException runtimeException){
       return BaseResp.error();
    }
}
