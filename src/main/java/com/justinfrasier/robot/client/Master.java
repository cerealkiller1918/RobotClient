package com.justinfrasier.robot.client;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;

public class Master {

    private BufferedImage image;
    private Socket socket;
    private DataInputStream inputStream;
    private OutputStreamWriter outputStream;
    private byte[] bytes;
    private ImageConverter converter = new ImageConverter();

    public void run(){
        try {
            image = null;
            setupSocketAndStreams();
            Runnable runnable = () -> imageUpdateLoop();
            Thread thread = new Thread(runnable);
            thread.start();
            new Window(this);
        }catch (Exception e){
            closeDownConnection();
            run();
        }
    }

    void closeDownConnection() {
        try {
            if (socket.isConnected()) socket.close();
            if(inputStream != null)inputStream.close();
            if(outputStream != null)outputStream.close();
        }catch (IOException | NullPointerException e){}
    }

    private void setupSocketAndStreams() throws IOException {
        socket = new Socket("192.168.1.12", 444);
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new OutputStreamWriter(socket.getOutputStream());
    }

    private void imageUpdateLoop() {
        while (true) {
            try {
                bytes = converter.getBytesFromInputStream(inputStream);
                image = converter.BytesToBufferedImage(bytes);
            } catch (Exception e) {}
        }
    }

    public  BufferedImage getImage() {
        return image;
    }


}
