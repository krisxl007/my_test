package jdk8_features.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 计算两个时间的时间差
 */
public class TimeDiffCulculation {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(9, 15, 13);
        LocalTime t2 = LocalTime.of(15, 30, 8);
        long duration = t1.until(t2, ChronoUnit.NANOS);

        System.out.println("From: " + t1 + " to: " + t2);
        System.out.println("Time difference: " + LocalTime.ofNanoOfDay(duration));
    }
}
