package com.sdu.apipassenger.remote;

import com.sdu.internalcommon.dto.ResponseResult;
import com.sdu.internalcommon.response.NumberCodeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LHP
 * @date 2023-07-10 9:37
 * @description
 */

@FeignClient("service-verificationcode") // 指定服务名
public interface ServiceVerificationcodeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/numberCode/{size}")
    ResponseResult<NumberCodeResponse> getNumberCode(@PathVariable("size") int size);

}
