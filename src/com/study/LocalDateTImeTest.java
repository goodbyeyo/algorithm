package com.study;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class LocalDateTImeTest {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        long sample = 1648873870000L;
        long sample2 = 1649828484841L;
        LocalDateTime sampleLocal = millsToLocalDateTime(sample);
        LocalDateTime sampleLocal2 = millsToLocalDateTime(sample2);
        LocalDateTime currentLocal = millsToLocalDateTime(current);
        System.out.println("현재시간 CurrentTimeMillis  " + current);
        System.out.println("현재시간 localTime  " + currentLocal);
        System.out.println("sample CurrentTimeMillis  " + sample);
        System.out.println("sample localTime  " + sampleLocal);
        System.out.println("sample2 CurrentTimeMillis  " + sample2);
        System.out.println("sample2 localTime  " + sampleLocal2);
    }

    public static LocalDateTime millsToLocalDateTime(long millis) {
        Instant instant = Instant.ofEpochMilli(millis);
        LocalDateTime date = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        return date;
    }
}
