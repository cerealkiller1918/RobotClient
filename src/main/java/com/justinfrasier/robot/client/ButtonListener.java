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

    public static ActionListener TurnRight(){
        return e-> System.out.println("Turn Right");
    }

    public static ActionListener TurnLeft(){
        return e -> System.out.println("Turn Left");
    }

    public static ActionListener Forward(){
        return e -> System.out.println("Forward");
    }

    public static ActionListener Backward(){
        return e -> System.out.println("Backward");
    }

    public static ActionListener CamUp(){
        return e -> System.out.println("Cam Up");
    }

    public static ActionListener CamDown(){
        return e -> System.out.println("Cam Down");
    }

    public static ActionListener CamLeft(){
        return e -> System.out.println("Cam Left");
    }

    public static ActionListener CamRight(){
        return e -> System.out.println("Cam Right");
    }

    public static ActionListener Stop(){
        return e -> System.out.println("Stop");
    }
}
