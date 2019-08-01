package com.yzb.utils;

import org.springframework.util.StringUtils;

public class StringUtil {

    public static boolean isBlank(Object data) {
        int strLen;

        if (data != null) {
            CharSequence cs = data.toString();
            if((strLen = cs.length()) != 0){
                for(int i = 0; i < strLen; ++i) {
                    if (!Character.isWhitespace(cs.charAt(i))) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return true;
        }
    }
}
