package com.time.junit;

import com.time.Time;
import com.time.TimeAdd;
import org.junit.Assert;
import org.junit.Test;

public class TimeAddTest {

    @Test
    public void test1(){
        String excepted = new Time(12,0,1).toString();
        String actual = TimeAdd.timeCal(new Time(12,0,0)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test2(){
        String excepted = new Time(12,1,2).toString();
        String actual = TimeAdd.timeCal(new Time(12,1,1)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test3(){
        String excepted = new Time(12,58,59).toString();
        String actual = TimeAdd.timeCal(new Time(12,58,58)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test4(){
        String excepted = new Time(13,0,0).toString();
        String actual = TimeAdd.timeCal(new Time(12,59,59)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test5(){
        String excepted = new Time(0,30,1).toString();
        String actual = TimeAdd.timeCal(new Time(0,30,0)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test6(){
        String excepted = new Time(1,30,2).toString();
        String actual = TimeAdd.timeCal(new Time(1,30,1)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test7(){
        String excepted = new Time(22,30,59).toString();
        String actual = TimeAdd.timeCal(new Time(22,30,58)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test8(){
        String excepted = new Time(23,31,00).toString();
        String actual = TimeAdd.timeCal(new Time(23,30,59)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test9(){
        String excepted = new Time(0,0,31).toString();
        String actual = TimeAdd.timeCal(new Time(0,0,30)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test10(){
        String excepted = new Time(1,1,31).toString();
        String actual = TimeAdd.timeCal(new Time(1,1,30)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test11(){
        String excepted = new Time(22,58,31).toString();
        String actual = TimeAdd.timeCal(new Time(22,58,30)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test12(){
        String excepted = new Time(23,59,31).toString();
        String actual = TimeAdd.timeCal(new Time(23,59,30)).toString();
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void test13(){
        String excepted = new Time(12,30,31).toString();
        String actual = TimeAdd.timeCal(new Time(12,30,30)).toString();
        Assert.assertEquals(excepted, actual);
    }
}
