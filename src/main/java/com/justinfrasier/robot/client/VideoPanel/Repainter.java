package com.justinfrasier.robot.client.VideoPanel;

import javax.swing.*;

/**
 * Created by Justin on 03/28/17.
 */
public class Repainter {

    public static void run(JPanel panel) {
        Runnable runnable = new Runnable() {
            public void run() {
                while(true){
                    panel.repaint();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
