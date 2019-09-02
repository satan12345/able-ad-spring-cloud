package com.able;

import lombok.extern.slf4j.Slf4j;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@Slf4j
public class ParkTest {

     public static void main(String[] argsl) throws InterruptedException {

         Thread a=new Thread(() -> {
             int sum=0;
             for (int i = 0; i < 10; i++) {
                 sum+=i;
             }
             try {
                 TimeUnit.SECONDS.sleep(4);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             LockSupport.park();
             log.info("{}计算得到的值为{}",Thread.currentThread().getName(),sum);
         },"线程A");
         a.start();
         TimeUnit.SECONDS.sleep(2);
         LockSupport.unpark(a);
         log.info("主线程休眠结束");

     }
}
