package csrp.york.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallHelloController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/call")
    public String call(){
    	String servicePath = getServicePath("csrp-provider");
        String callServiceResult = new RestTemplate().getForObject(servicePath + "/order/getOrderById/00001", String.class);
        System.out.println(callServiceResult);
        return callServiceResult;
    }
    public String getServicePath(String url){
    	ServiceInstance serviceInstance = loadBalancerClient.choose(url);
        System.out.println("服务地址：" + serviceInstance.getUri());
        System.out.println("服务名称：" + serviceInstance.getServiceId());
        return serviceInstance.getUri().toString();
    }
}
