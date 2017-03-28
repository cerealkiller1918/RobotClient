package com.justinfrasier.robot.client;

import javax.swing.*;

/**
 * Created by Justin on 03/27/17.
 */
public class Buttons {

    public static JButton ForwardButton(){
        JButton button = new JButton();
        button.setText("Forward");
        //TODO Add Action listener
        button.addActionListener(e -> ButtonListener.test());
        return button;
    }
    public static JButton RightButton(){
        JButton button = new JButton();
        button.setText("Right");
        //TODO Add Action listener
        button.addActionListener(ButtonListener.test2());
        return button;
    }
    public static JButton LeftButton(){
        JButton button = new JButton();
        button.setText("Left");
        //TODO Add Action listener
        return button;
    }
    public static JButton BackwardsButton(){
        JButton button = new JButton();
        button.setText("Backwards");
        //TODO Add Action listener
        return button;
    }

    public static JButton CamUp(){
        JButton button = new JButton();
        button.setText("Cam Up");
        //TODO Add Action listener
        return button;
    }
    public static JButton CamDown(){
        JButton button = new JButton();
        button.setText("Cam Down");
        //TODO Add Action listener
        return button;
    }
    public static JButton CamRight(){
        JButton button = new JButton();
        button.setText("Cam Right");
        //TODO Add Action listener
        return button;
    }
    public static JButton CamLeft(){
        JButton button = new JButton();
        button.setText("Cam Left");
        //TODO Add Action listener
        return button;
    }

    public static JButton StopButton(){
        JButton button = new JButton();
        button.setText("Stop");
        //TODO Add Action listener
        return button;
    }

}
