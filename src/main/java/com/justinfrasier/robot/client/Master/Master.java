package com.justinfrasier.robot.client.Master;

import com.justinfrasier.robot.client.Image.ImageConverter;
import com.justinfrasier.robot.client.MainWindow.Window;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;

import static com.justinfrasier.robot.client.Sleep.Sleep.sleep;
import static com.justinfrasier.robot.client.Logger.Logger.log;

public class Master {

    private BufferedImage image;
    private Socket socket;
    private DataInputStream inputStream;
    private OutputStreamWriter outputStream;
    private ImageConverter converter = new ImageConverter();
    private Window window;

    public void runMain(){
        try {
            image = null;
            setupWindow();
            setupSocketAndStreams();
            Runnable runnable = this::imageUpdateLoop;
            Thread thread = new Thread(runnable);
            thread.start();
            //setupWindow();
        }catch (Exception e){
            closeDownConnection();
            runMain();
        }
    }

    private void setupWindow() throws Exception {
        if(window == null) window = new Window(this);
    }

    private void closeDownConnection() {
        try {
            if (socket != null){
                if (socket.isConnected()) socket.close();
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
                System.out.println("The Stream has closed");
            }
        }catch (IOException | NullPointerException e){
            System.out.println("The Stream will not close");
        }
    }

    private void setupSocketAndStreams() throws IOException {
        socket = new Socket("localhost", 444); // Local host
//        socket = new Socket("192.168.1.19", 444); // IP for the pie
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new OutputStreamWriter(socket.getOutputStream());
    }

    private void imageUpdateLoop(){
        while (true) {
            try {
                if(checkConnectionsIsLost()) break;
                byte[] bytes = converter.getBytesFromInputStream(inputStream);
                image = converter.BytesToBufferedImage(bytes);
            } catch (Exception ignored) {}
        }
        closeDownConnection();
        sleep(300);
        runMain();

    }

    public BufferedImage getImage() {
        return image;
    }

    private boolean checkConnectionsIsLost(){
        if(!socket.isConnected()) log("lost connection line 76");
        return !socket.isConnected();
    }




}
