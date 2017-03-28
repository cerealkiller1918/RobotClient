package com.justinfrasier.robot.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Justin on 03/27/17.
 */
public class ButtonListener {

    public static void test(){
        System.out.println("The Button works");
    }
    public static ActionListener test2(){
        return e -> System.out.println("Test2 works");
    }
}
