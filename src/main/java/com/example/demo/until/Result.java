package com.example.demo.until;

import lombok.Data;

/**
 * author : hwang
 * date : 2024/1/13 14:56
 * description : Result
 * 响应结果类
 */
@Data
public class Result {
    /**
     * 响应给前端的数据前端的数据
    */

    //flag 表示状态，true表示成功，false表示失败
    private boolean flag;
    //message 表示响应信息
    private String message;
    //data 表示响应数据
    private Object data;

    public Result() {}
    public  Result(boolean flag, String message) {}
    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    //成功，不带数据
    public static  Result success(String message){
        return  new Result(true, message, null);
    }

    //成功，带数据
    public static  Result success(String message, Object data){
        return  new Result(true, message, data);
    }

    //失败，不带数据
    public static  Result fail(String message){
        return  new Result(false, message, null);
    }

    //失败，带数据
    public static  Result fail(String message, Object data){
        return  new Result(false, message, data);
    }

}
