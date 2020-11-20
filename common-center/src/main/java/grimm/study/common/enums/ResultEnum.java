package grimm.study.common.enums;

import grimm.study.common.api.IErrorCode;
import lombok.Getter;

@Getter
public enum ResultEnum implements IErrorCode {
    SUCCESS(0,"执行成功"),



    AUTHORIZATION_ERROR(40001,"认证失败"),

    SERVER_ERROR(99999,"服务器错误"),

    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
