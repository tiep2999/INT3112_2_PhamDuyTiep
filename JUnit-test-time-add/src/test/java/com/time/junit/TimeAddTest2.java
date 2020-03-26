package com.time.junit;

import com.time.Time;
import com.time.TimeAdd;
import org.junit.Assert;
import org.junit.Test;

public class TimeAddTest2 {
    @Test
    public void test1(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,-30,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test2(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,-30,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test3(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,-30,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test4(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,5,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test5(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,5,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test6(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,5,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test7(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,70,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test8(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,70,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test9(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(-30,70,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test10(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,-30,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test11(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,-30,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test12(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,-30,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test13(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,5,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test14(){
        String excepted = new Time(5,5,6).toString();
        String actual = TimeAdd.timeCal(new Time(5,5,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test15(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,5,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test16(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,70,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test17(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,70,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test18(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(5,70,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test19(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,-30,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test20(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,-30,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test21(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,-30,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test22(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,5,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test23(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,5,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test24(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,5,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test25(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,70,-30)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
   public void test26(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,70,5)).toString();
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void test27(){
        String excepted = new Time(-1,-1,-1).toString();
        String actual = TimeAdd.timeCal(new Time(70,70,70)).toString();
        Assert.assertEquals(excepted, actual);
    }
}
