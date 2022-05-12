package com.wxw.springcloud.service;

import com.wxw.springcloud.entity.CommonResult;
import com.wxw.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author by xxz           openfeign service 接口
 * @date 2022/5/9
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentOpenFeignService {

    @GetMapping(value = "/payment/st/{id}")
    public CommonResult<Payment> st(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
