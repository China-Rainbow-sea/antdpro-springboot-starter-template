package com.yupi.springbootinit.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;

/**
 * 文件上传业务类型枚举
 *
 * @author <a href="https://github.com/China-Rainbow-sea/">RainbowSea</a>
 * @from <a href="https://rainbowsea.blog.csdn.net/">RainbowSea15博客</a>
 */
public enum FileUploadBizEnum {

    USER_AVATAR("用户头像", "user_avatar");

    private final String text;

    private final String value;

    FileUploadBizEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static FileUploadBizEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (FileUploadBizEnum anEnum : FileUploadBizEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
