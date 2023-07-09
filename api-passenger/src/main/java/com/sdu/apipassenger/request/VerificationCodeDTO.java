package com.sdu.apipassenger.request;

/**
 * @author LHP
 * @date 2023-07-10 1:15
 * @description 验证码请求参数类
 */
public class VerificationCodeDTO {
    private String passengerPhone;

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }
}
