package com.sdu.apipassenger.service;

import com.sdu.apipassenger.remote.ServiceVerificationcodeClient;
import com.sdu.internalcommon.dto.ResponseResult;
import com.sdu.internalcommon.response.NumberCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LHP
 * @date 2023-07-10 1:26
 * @description 验证码服务类
 */

@Service
public class VerificationCodeService {

    @Autowired
    private ServiceVerificationcodeClient serviceVerificationcodeClient;

    public String generatorCode(String passengerPhone) {
        // 调用（远程）验证码服务，获取验证码
        System.out.println("调用（远程）验证码服务，获取验证码");

        ResponseResult<NumberCodeResponse> numberCodeResponse = serviceVerificationcodeClient.getNumberCode(6);
        int numberCode = numberCodeResponse.getData().getNumberCode();

        System.out.println("remote number code: " + numberCode);

        // 存入redis
        System.out.println("存入redis");

        // 返回值
        JSONObject result = new JSONObject();
        result.put("code", 1);
        result.put("message", "success");

        return result.toString();
    }
}
