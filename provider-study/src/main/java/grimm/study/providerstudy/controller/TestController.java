package grimm.study.providerstudy.controller;

import grimm.study.exception.CommonException;
import grimm.study.vo.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public ServerResponse exceptionTest() throws CommonException {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            throw new CommonException(e);
        }

        return new ServerResponse().success();
    }


}
