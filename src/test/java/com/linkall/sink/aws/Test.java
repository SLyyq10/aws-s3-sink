package com.linkall.sink.aws;

import java.text.DecimalFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        int hour0 = OffsetDateTime.now().getHour();
        Test test = new Test();
        String format =  test.getZeroTime(LocalDateTime.now()).format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
        String format1 = test.getZeroTime(LocalDateTime.now()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh"));
        System.out.println(format1);
        String format2 = test.getZeroTime(LocalDateTime.now()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh"));
        System.out.println(format1+"equals"+format2+"?"+(format1.equals(format2)));
        int hour1 = OffsetDateTime.now().getHour();
        System.out.println(hour0 + "==" + hour1 + "?" + (hour0 == hour1));

        DecimalFormat decimalFormat = new DecimalFormat("000000");
        int num = 15678;
        System.out.println(decimalFormat.format(num));

        System.out.println(OffsetDateTime.now().getMonthValue());
    }

    private OffsetDateTime getZeroTime(LocalDateTime time){
        LocalDateTime dt = LocalDateTime.now(ZoneId.of("Z"));
        Duration duration = Duration.between(time, dt);
        OffsetDateTime time2 = OffsetDateTime.of(time, ZoneOffset.UTC).plus(duration);
        return time2;
    }


}
