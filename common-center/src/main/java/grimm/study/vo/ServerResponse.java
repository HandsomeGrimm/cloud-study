package grimm.study.vo;

import grimm.study.enums.ResultEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class ServerResponse<T> implements Serializable {

    private static final long serialVersionUID = -1084851026480451178L;
    private Integer code;
    private String info;
    private T data;

    public  ServerResponse success(){
        ServerResponse response=new ServerResponse();
        response.code= ResultEnum.SUCCESS.getCode();
        response.info=ResultEnum.SUCCESS.getMessage();
        return response;
    }

    public  ServerResponse success(String message){
        ServerResponse response=new ServerResponse();
        response.code= ResultEnum.SUCCESS.getCode();
        response.info=message;
        return response;
    }

    public  ServerResponse success(T data){
        ServerResponse response=new ServerResponse();
        response.code= ResultEnum.SUCCESS.getCode();
        response.info=ResultEnum.SUCCESS.getMessage();
        response.data=data;
        return response;
    }

    public ServerResponse success(String message, T data){
        ServerResponse response=new ServerResponse();
        response.code= ResultEnum.SUCCESS.getCode();
        response.info=message;
        response.data=data;
        return response;
    }

    public  ServerResponse error(){
        ServerResponse response=new ServerResponse();
        response.code=ResultEnum.SERVER_ERROR.getCode();
        response.info=ResultEnum.SERVER_ERROR.getMessage();
        return response;
    }

    public  ServerResponse error(String message){
        ServerResponse response=new ServerResponse();
        response.code=ResultEnum.SERVER_ERROR.getCode();
        response.info=message;
        return response;
    }
}
