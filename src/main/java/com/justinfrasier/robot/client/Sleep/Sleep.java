package com.justinfrasier.robot.client.Sleep;

public class Sleep {

    public static void sleep(long millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException ignored){}
    }
}
