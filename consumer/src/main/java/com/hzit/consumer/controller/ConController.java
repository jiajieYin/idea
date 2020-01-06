package com.hzit.consumer.controller;


import com.hzit.consumer.clients.MyFeignClient;
import com.hzit.consumer.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;

@RestController
@RequestMapping("consumer")
//consumer@DefaultProperties(defaultFallback="queryfallback")
public class ConController {
//    @Autowired
//    private RestTemplate restTemplate;
   // @Autowired
   //private RibbonLoadBalancerClient ribbonLoadBalancerClient;
    //@Autowired
   // private  DiscoveryClient discoveryClient;
    @Autowired
    private MyFeignClient feignClient;
    @GetMapping("{id}")
  /*  @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })*/
//  @HystrixCommand(commandProperties =
//            {
//                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value="10"),
//                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value="10000"),
//                    @HystrixProperty(name = "circuitBreaker.e  rrorThresholdPercentage",value="60")
//            })
    public User query( @PathVariable("id") String id){
       // Map<String,Map<String,ServiceInstance>>
        //List<ServiceInstance> instances = discoveryClient.getInstances("userservice");
       // ServiceInstance serviceInstan
        // ce = instances.get(0);

      // ServiceInstance serviceInstance=  ribbonLoadBalancerClient.choose("userservice");
       // String host = serviceInstance.getHost();
      //  int port = serviceInstance.getPort();
     //  String url = "http://"+host+":"+port+"/user/"+id;
//         int id1= Integer.parseInt(id);
//         if (id1%2==0){
//             throw new  RuntimeException();
//         }
        //String url="http://userservice/user/"+id;
        User  user= feignClient.query(id);
        return user;
}
/*public String queryfallback(String id){
        return "不好意思,服务器拥挤，请稍后再访问";
}*/
//public String queryfallback(){
//        return "不好意思，服务器拥挤，请稍后再访问";
//}
}
