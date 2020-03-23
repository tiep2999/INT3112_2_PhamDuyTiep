package com.time;

import java.util.Scanner;

public class TimeAdd {
    public static Time timeCal(Time timeIn){
        int h = timeIn.getHour();
        int m = timeIn.getMinute();
        int s = timeIn.getSecond();
        Time timeError = new Time(-1, -1, -1);
        Time timeOut = new Time();
        if ((0 <= h && h < 24) && (0 <= m && m < 60) && ( 0 <= s && s < 60)) {
            if (s == 59) {
                if (m == 59) {
                    if (h == 23) {
                        timeOut.setHour(0);
                        timeOut.setMinute(0);
                        timeOut.setSecond(0);
                    } else {
                        timeOut.setHour(h + 1);
                        timeOut.setSecond(0);
                        timeOut.setMinute(0);
                    }
                } else {
                    timeOut.setHour(h);
                    timeOut.setMinute(m + 1);
                    timeOut.setSecond(0);
                }
            } else {
                timeOut.setHour(h);
                timeOut.setMinute(m);
                timeOut.setSecond(s+1);
            }
        } else {
            timeOut = timeError;
        }
        return timeOut;
    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        Time timeTest = new Time(h, m, s);
        Time result = timeCal(timeTest);
    }
}