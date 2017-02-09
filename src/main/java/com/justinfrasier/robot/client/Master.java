package com.justinfrasier.robot.client;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;

public class Master {

    private BufferedImage image;
    private Socket socket;
    private DataInputStream inputStream;
    private OutputStreamWriter outputStream;
    private byte[] bytes;

    public void run(){
        try {
            image = null;
            bytes = new byte[16384];
            socket = new Socket("192.168.1.12", 444);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new OutputStreamWriter(socket.getOutputStream());
            Thread thread = new Thread() {
                @Override
                public void run() {
                    super.run();
                    while (true) {
                        try {
                            //System.out.println("loop Start");
                            bytes = getBytesFromInputStream(inputStream);
                            //outputStream.write("good");
                            //outputStream.flush();
                            //System.out.println("got input stream");
                            image = BytesToBufferedImage(bytes);
                            //System.out.println("loop End");
                        } catch (Exception e) {

                        }

                    }
                }
            };
            thread.start();
            new Window(this);
        }catch (Exception e){
            run();
        }
    }

    public  BufferedImage getImage() {
        return image;
    }

    public  BufferedImage BytesToBufferedImage(byte[] bytes) throws IOException {
        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
        return ImageIO.read(stream);
    }

    public  byte[] getBytesFromInputStream(DataInputStream is) throws IOException
    {
        int length = is.readInt();
        byte[] message = new byte[length];
        if(length>0) {
            is.readFully(message,0,message.length);
        }
        return message;
    }
}
