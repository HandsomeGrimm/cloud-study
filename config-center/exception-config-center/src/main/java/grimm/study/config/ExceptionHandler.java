package grimm.study.config;

import grimm.study.exception.CommonException;
import grimm.study.vo.ServerResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(CommonException.class)
    public ServerResponse commpExceptionHandler(CommonException e) {
        return new ServerResponse().error(e.getMessage());
    }
}
