package com.justinfrasier.robot.client.ButtonPanel;

import com.justinfrasier.robot.client.Listeners.ButtonListener;

import javax.swing.*;

class Buttons {

    static JButton ForwardButton(){
        JButton button = new JButton();
        button.setText("Forward");
        button.addActionListener(ButtonListener.Forward());
        return button;
    }
    static JButton RightButton(){
        JButton button = new JButton();
        button.setText("Right");
        button.addActionListener(ButtonListener.TurnRight());
        return button;
    }
    static JButton LeftButton(){
        JButton button = new JButton();
        button.setText("Left");
        button.addActionListener(ButtonListener.TurnLeft());
        return button;
    }
    static JButton BackwardsButton(){
        JButton button = new JButton();
        button.setText("Backwards");
        button.addActionListener(ButtonListener.Backward());
        return button;
    }

    static JButton CamUp(){
        JButton button = new JButton();
        button.setText("Cam Up");
        button.addActionListener(ButtonListener.CamUp());
        return button;
    }

    static JButton CamDown(){
        JButton button = new JButton();
        button.setText("Cam Down");
        button.addActionListener(ButtonListener.CamDown());
        return button;
    }
    static JButton CamRight(){
        JButton button = new JButton();
        button.setText("Cam Right");
        button.addActionListener(ButtonListener.CamRight());
        return button;
    }
    static JButton CamLeft(){
        JButton button = new JButton();
        button.setText("Cam Left");
        button.addActionListener(ButtonListener.CamLeft());
        return button;
    }

    static JButton StopButton(){
        JButton button = new JButton();
        button.setText("Stop");
        button.addActionListener(ButtonListener.Stop());
        return button;
    }

}
