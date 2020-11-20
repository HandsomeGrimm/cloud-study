package grimm.study.auth2;

import grimm.study.auth2.config.PasswordEncoder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleTest {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void test(){
        System.out.println(passwordEncoder.encode("app"));
    }

}
