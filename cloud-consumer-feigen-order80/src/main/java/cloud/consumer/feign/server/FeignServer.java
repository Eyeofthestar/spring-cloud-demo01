package cloud.consumer.feign.server;

import com.cloud.api.pojo.CommentResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
// @FeignClient("cloud-payment06-server") 声明需要访问的服务
@FeignClient("cloud-payment06-server")
public interface FeignServer {
//     @RequestMapping("/payment/consul")  这个借口是该服务对外暴露的路由路径
    @RequestMapping("/payment/consul")
    String getPayment();
}
