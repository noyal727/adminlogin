package com.admin.admin.utils;


import org.apache.commons.codec.digest.DigestUtils;

public interface CustomHash {
    static String hashString(String s){
        return DigestUtils.sha256Hex(s);
    }
}
