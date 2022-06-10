package com.luoli.common.exception;

import com.luoli.common.enums.ExceptionEnum;
import lombok.Getter;

/**
 * 自定义异常类
 * @Author liluo
 * @create 2022/6/7 20:34
 */
@Getter
public class LuoLiException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public LuoLiException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

}
