package com.my.springcloud.api.common.enums;

public enum EnumSet {

    /**
     * code = 0表示操作成功！；为1表示操作失败！
     */
    HYSTRIX(-1, "熔断器机制异常处理结果!"),
    SUCCESS(0, "操作成功"),
    FAILURE(1, "操作失败");
    private Integer code;
    private String msg;

    EnumSet(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(Integer code) {
        String message = null;
        for (EnumSet e : EnumSet.values()) {
            if (e.code == code) {
                message = e.msg;
                break;
            }
        }
        return message;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }
}
