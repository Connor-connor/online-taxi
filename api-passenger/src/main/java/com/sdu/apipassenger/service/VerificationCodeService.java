package com.sdu.apipassenger.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author LHP
 * @date 2023-07-10 1:26
 * @description 验证码服务类
 */

@Service
public class VerificationCodeService {
    public String generatorCode(String passengerPhone) {
        // 调用验证码服务，获取验证码
        System.out.println("调用验证码服务，获取验证码");
        String code = "111111";

        // 存入redis
        System.out.println("存入redis");

        // 返回值
        JSONObject result = new JSONObject();
        result.put("code", 1);
        result.put("message", "success");

        return result.toString();
    }
}
