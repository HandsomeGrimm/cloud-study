package grimm.study.auth2;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(Authorization.class,args);
    }

}
