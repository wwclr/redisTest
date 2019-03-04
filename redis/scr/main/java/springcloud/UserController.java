//package springcloud;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
///*服务消费者Controller*/
//@RestController
//public class UserController {
//
//        @Autowired
//        private RestTemplate restTemplate;
//
//        @GetMapping("/getUser")
//        public User getUser() {
//                return this.restTemplate.getForObject("http://localhost:8000/getUser", User.class);
//        }
//}