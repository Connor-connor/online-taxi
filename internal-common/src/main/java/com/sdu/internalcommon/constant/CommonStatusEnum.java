package com.sdu.internalcommon.constant;

import lombok.Getter;

/**
 * @author LHP
 * @date 2023-07-10 8:51
 * @description 通用状态枚举
 */
public enum CommonStatusEnum {

        /**
        * 通用状态
        */
        SUCCESS(1, "success"),
        FAIL(0, "fail"),
        ;

        @Getter
        private int code;
        @Getter
        private String value;

        CommonStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

}
