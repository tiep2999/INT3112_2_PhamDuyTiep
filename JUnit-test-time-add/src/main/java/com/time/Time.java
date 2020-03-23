package com.time;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time(int h, int m, int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public Time(){
    }

    @Override
    public String toString() {
        if (this.hour >= 0 && this.minute >= 0 && this.second >= 0){
            if (this.second < 10 && this.minute < 10 && this.hour < 10){
                return "0" + this.hour + " : 0" + this.minute + " : 0" + this.second;
            } else if (this.second < 10 && this.minute > 10 && this.hour > 10){
                return this.hour + " : " + this.minute + " : 0" + this.second;
            } else if (this.second > 10 && this.minute > 10 && this.hour < 10){
                return "0" + this.hour + " : " + this.minute + " : " + this.second;
            } else if (this.second > 10 && this.minute < 10 && this.hour > 10) {
                return this.hour + " : 0" + this.minute + " : " + this.second;
            } else if (this.second < 10 && this.minute < 10 && this.hour > 10) {
                return this.hour + " : 0" + this.minute + " : 0" + this.second;
            } else if (this.second < 10 && this.minute > 10 && this.hour < 10) {
                return "0" + this.hour + " : " + this.minute + " : 0" + this.second;
            } else if (this.second > 10 && this.minute < 10 && this.hour < 100) {
                return "0" + this.hour + " : 0" + this.minute + " : " + this.second;
            } else
                return this.hour + " : " + this.minute + " : " + this.second;
        } else {
            return "-1 : -1 : -1";
        }

    }

}
