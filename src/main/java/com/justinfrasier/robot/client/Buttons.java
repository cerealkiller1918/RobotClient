package com.justinfrasier.robot.client;

import javax.swing.*;

/**
 * Created by Justin on 03/27/17.
 */
public class Buttons {

    public JButton ForwardButton(){
        JButton button = new JButton();
        button.setText("Forward");
        //TODO Add Action listener
        return button;
    }
    public JButton RightButton(){
        JButton button = new JButton();
        button.setText("Right");
        //TODO Add Action listener
        return button;
    }
    public JButton LeftButton(){
        JButton button = new JButton();
        button.setText("Left");
        //TODO Add Action listener
        return button;
    }
    public JButton BackwardsButton(){
        JButton button = new JButton();
        button.setText("Backwards");
        //TODO Add Action listener
        return button;
    }

    public JButton CamUp(){
        JButton button = new JButton();
        button.setText("Cam Up");

        return button;
    }
    public JButton CamDown(){
        JButton button = new JButton();
        button.setText("Cam Up");

        return button;
    }
    public JButton CamRight(){
        JButton button = new JButton();
        button.setText("Cam Up");

        return button;
    }
    public JButton CamLeft(){
        JButton button = new JButton();
        button.setText("Cam Up");

        return button;
    }
}
