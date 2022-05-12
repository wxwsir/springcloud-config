package com.wxw.springcloud.controller;/**
 * @author by xxz
 * @date 2022/5/9
 */

import com.wxw.springcloud.entity.CommonResult;
import com.wxw.springcloud.entity.Payment;
import com.wxw.springcloud.service.PaymentOpenFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description         客户端 controller

 * @author by xxz

 * @date 2022/5/9

 * @throws
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentOpenFeignService paymentOpenFeignService;

    @GetMapping(value = "/consumer/payment/st/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentOpenFeignService.st(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentOpenFeignService.paymentFeignTimeout();
    }

}
