package cloud.consumer.feign.controller;

import cloud.consumer.feign.server.FeignServer;
import com.cloud.api.pojo.CommentResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class FeignController {

    @Resource
    private FeignServer feignServer;

    @RequestMapping("/consumer/get")
    String  getPayment(){
         return   feignServer.getPayment();
    }
}
