package com.zx.vo;

import lombok.Data;

@Data
public class ReturnValue {
    private int code;
    private String msg;
    private Object data;

    public static ReturnValue setReturnValue(int code,String msg,Object data){
        ReturnValue r=new ReturnValue();
        r.code=code;
        r.data=data;
        r.msg=msg;
        return r;
    }
    //设置成功
    public static ReturnValue setOK(){
        return setReturnValue(200,"OK",null);
    }
    public static ReturnValue setOK(Object data){
        return setReturnValue(200,"OK",data);
    }
    //设置失败
    public static ReturnValue setERROR(){
        return setReturnValue(400,"ERROR",null);
    }

    public static ReturnValue setERROR(Object data){
        return setReturnValue(400,"ERROR",data);
    }





}
