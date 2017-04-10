package com.justinfrasier.robot.client.ButtonPanel;

import javax.swing.*;


public class ButtonPanel extends JPanel {
    private JButton forward,backward,right,left,stop,camUp,camDown,camRight,camLeft;

    public ButtonPanel(){
        setupButtons();
        //TODO add buttons to panel needs to be in a method
        addButtonsToPanels();
    }

    private void addButtonsToPanels() {
        this.add(forward);
        this.add(backward);
        this.add(right);
        this.add(left);
        this.add(stop);
        this.add(camUp);
        this.add(camDown);
        this.add(camRight);
        this.add(camLeft);
    }

    private void setupButtons() {
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
