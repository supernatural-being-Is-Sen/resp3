package cn.kgc.utils;

import lombok.Data;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@Data
public class Result<T> {

    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;


    public static <T> Result<T> success(String message,T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(StatusCode.OK);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> success(T data){
        return success("操作成功",data);
    }


    public static <T> Result<T> error() {
        return error("操作失败");
    }

    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setCode(StatusCode.ERROR);
        result.setMessage(message);
        return result;
    }
}
