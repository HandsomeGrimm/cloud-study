package grimm.study.providerstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "grimm.study")
@EnableDiscoveryClient
public class ProviderStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderStudyApplication.class, args);
    }

}
