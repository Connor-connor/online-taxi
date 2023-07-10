package com.sdu.apipassenger.service;

import com.sdu.apipassenger.remote.ServiceVerificationcodeClient;
import com.sdu.internalcommon.dto.ResponseResult;
import com.sdu.internalcommon.response.NumberCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author LHP
 * @date 2023-07-10 1:26
 * @description 验证码服务类
 */

@Service
public class VerificationCodeService {

    @Autowired
    private ServiceVerificationcodeClient serviceVerificationcodeClient;

    // 乘客验证码的前缀
    private String verificationCodePrefix = "passenger-verification-code-";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public ResponseResult generatorCode(String passengerPhone) {
        // 调用（远程）验证码服务，获取验证码
        // System.out.println("调用（远程）验证码服务，获取验证码");
        ResponseResult<NumberCodeResponse> numberCodeResponse = serviceVerificationcodeClient.getNumberCode(6);
        int numberCode = numberCodeResponse.getData().getNumberCode();

        // System.out.println("remote number code: " + numberCode);

        // 存入redis
        // System.out.println("存入redis");
        // key，value，过期时间
        // key：passenger-verification-code-手机号
        String key = verificationCodePrefix + passengerPhone;
        // 存入redis
        stringRedisTemplate.opsForValue().set(key, numberCode + "", 2, TimeUnit.MINUTES);

        // 通过短信服务商，将对应的验证码发送到手机上，阿里短信服务，腾讯短信通，华信，容联

        // 返回值
        return ResponseResult.success("");
    }
}
