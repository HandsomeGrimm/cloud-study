package grimm.study.providerstudy.service.impl;

import grimm.study.providerstudy.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String name) {
        return "hello"+name;
    }
}
