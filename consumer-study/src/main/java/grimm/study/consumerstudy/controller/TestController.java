package grimm.study.consumerstudy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private DiscoveryClient discovery;

    @RequestMapping("/discovery")
    public String discovery(){
        System.out.println(loadBalancer.choose("test-provider"));
        return "success";
    }

    @RequestMapping("/all")
    public String all(){
        System.out.println(discovery.getServices());
        return "success";
    }
    @RequestMapping("/hello")
    public String hello(String name){
        return null;
    }
}
