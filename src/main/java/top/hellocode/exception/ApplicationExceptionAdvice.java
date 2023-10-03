package top.hellocode.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.hellocode.common.res.Result;

@ControllerAdvice
public class ApplicationExceptionAdvice {

    @ExceptionHandler(GlobalException.class)
    @ResponseBody
    public Result<String> globalException(GlobalException e){
        return Result.failed(e.getCode(), e.getMessage());
    }
}
