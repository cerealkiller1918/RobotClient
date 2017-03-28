package com.justinfrasier.robot.client;

import javax.swing.*;

/**
 * Created by Justin on 03/28/17.
 */
public class ButtonPanel {
    private static JButton forward,backward,right,left,stop,camUp,camDown,camRight,camLeft;

    public static JPanel ButtonPanel(){
        JPanel panel = new JPanel();
        setupButtons();

        return panel;
    }

    private static void setupButtons() {
        forward = Buttons.ForwardButton();
        backward = Buttons.BackwardsButton();
        right = Buttons.RightButton();
        left = Buttons.LeftButton();
        stop = Buttons.StopButton();
        camUp = Buttons.CamUp();
        camDown = Buttons.CamDown();
        camRight = Buttons.CamRight();
        camLeft = Buttons.CamLeft();
    }
}
