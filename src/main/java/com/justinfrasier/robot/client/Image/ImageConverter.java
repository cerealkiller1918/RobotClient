package com.justinfrasier.robot.client.Image;




import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImageConverter {


    public  byte[] getBytesFromInputStream(DataInputStream is) throws IOException
    {
        int length = is.readInt();
        byte[] message = new byte[length];
        if(length>0) {
            is.readFully(message,0,message.length);
        }
        return message;
    }



    public  BufferedImage BytesToBufferedImage(byte[] bytes) throws IOException {
        try {
            ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
            return ImageIO.read(stream);
        }catch (IOException e) {return null;}
    }

}
