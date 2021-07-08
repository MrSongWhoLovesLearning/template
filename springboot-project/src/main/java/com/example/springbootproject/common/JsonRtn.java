package com.example.springbootproject.common;

/**
 * <p>标题: response</p>
 * <p>描述: 成功响应,存储成功信息的对象</p>
 *
 */
public class JsonRtn {
    /**
     * 返回类型：自服务前台用，判断是否请求成功
     */
    private String rtnType;
    /**
     * 返回码：自服务到前台用，从配置文件中读取返回信息的key
     */
    private String rtnCode;
    /**
     * 消息；第三方客户端用或者没有rtnCode时使用
     */
    private String rtnMsg;

    /**
     * 数据
     */
    private Object data;

    /**
     * 默认构造初始化成功实例
     */
    public JsonRtn() {
        this.rtnType = RtnType.OK.getValue();
    }

    public JsonRtn(String rtnType, String rtnCode, String rtnMsg ,Object data) {
        this.rtnType = rtnType;
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
        this.data = data;
    }

    public enum RtnType {
        OK("OK"),
        FAIL("FAIL");

        private String value;

        private RtnType(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    public String getRtnType() {
        return rtnType;
    }

    public void setRtnType(String rtnType) {
        this.rtnType = rtnType;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
