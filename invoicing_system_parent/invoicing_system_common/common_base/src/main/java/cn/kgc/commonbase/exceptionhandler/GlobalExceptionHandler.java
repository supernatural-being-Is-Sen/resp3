package cn.kgc.commonbase.exceptionhandler;

import cn.kgc.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * @author 吴雨森
 * @data 2020/5/10
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvoicingSystemException.class)
    @ResponseBody
    public Result error(InvoicingSystemException e){
        e.printStackTrace();
        return Result.error(e.getMessage());
    }
}
