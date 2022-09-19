package com.tychang.practice.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatter {
    public static String format(LocalDateTime time) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return time.format(formatter);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }
}
