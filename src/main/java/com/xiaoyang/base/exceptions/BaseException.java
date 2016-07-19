package com.xiaoyang.base.exceptions;
/**
 * 基础异常类.
 * 
 * @author zyhe
 *
 */
public abstract class BaseException extends Exception{
    private static final long serialVersionUID = 1L;
    
    private String code;
    
    private String descriptionKey;
    
    private Object[] parameters;
    /**
     * 不应该 直接实例化，应该定义子类.
     * 
     * @param code
     *          异常code,通常与模块CODE对应
     * @param descriptionKey
     *          异常消息代码,系统描述中定义
     * @param parameters
     *          如果没有参数,可以传null
     */
    protected BaseException(String code, String descriptionKey, Object[] parameters){
        super(descriptionKey);
        this.code = code;
        this.descriptionKey = descriptionKey;
        this.parameters = parameters;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDescriptionKey() {
        return descriptionKey;
    }
    public void setDescriptionKey(String descriptionKey) {
        this.descriptionKey = descriptionKey;
    }
    public Object[] getParameters() {
        return parameters;
    }
    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

}
