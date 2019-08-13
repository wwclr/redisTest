package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //声明这是一个Eureka服务器
public class App {
        public static void main(String[] args) {
                SpringApplication.run(App.class, args);
        }

}