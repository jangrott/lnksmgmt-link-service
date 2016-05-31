package pl.jangrot.lnksmgmt.linkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

    @RequestMapping(value = "/")
    public List<String> links() {
        return Arrays.asList("http://onet.pl", "http://wykop.pl", "http://allegro.pl");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
