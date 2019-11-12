/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.*;
import java.net.*;


public class ServerFAQ {

   public static void main(String[] args) throws Exception{
        
       //receiving the choice
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,1024);
        ds.receive(dp);
        InetAddress ip = InetAddress.getByName("127.0.0.1");
         FileReader reader;
        String buttonNumber = new String(dp.getData(), 0, dp.getLength());
        
       
         int character ;
         String text = "";
         switch (buttonNumber) {
             case "1":
                   reader = new FileReader("Button1.txt");
                   while ((character = reader.read()) != -1) {
                         text +=(char) character;
                        
                    } break;
             case "2":
                 reader = new FileReader("Button2.txt");
                    while ((character = reader.read()) != -1) {
                            text +=(char) character;
                        
                    }break;
             case "3":
                 reader = new FileReader("Button3.txt");
                    while ((character = reader.read()) != -1) {
                        text +=(char) character;
                        
                    }break;
             case "4":
                 reader = new FileReader("Button4.txt");
                    while ((character = reader.read()) != -1) {
                        text +=(char) character;   
                        
                    }break;
             case "5":
                 reader = new FileReader("Button5.txt");
                    while ((character = reader.read()) != -1) {
                        text +=(char) character;    
                        
                    }break;
             case "6":
                reader = new FileReader("Button6.txt");
                    while ((character = reader.read()) != -1) {
                        text +=(char) character;  
                        
                    }break;
         }
         //sending text
        DatagramSocket dgs = new DatagramSocket();  
        DatagramPacket dgp = new DatagramPacket(text.getBytes(), text.length(), ip, 3100);  
        dgs.send(dgp);
        
      
    }
    
}
