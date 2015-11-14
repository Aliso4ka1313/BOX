package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Администратор on 26.09.2015.
 */
public class Recipient extends Thread{

    public void run(){
        try{
            DatagramSocket ds = new DatagramSocket(1050);
            while (!isInterrupted()){
                DatagramPacket pack = new DatagramPacket(new byte[1024], 1024);
                ds.receive(pack);
                System.out.println(new String(pack.getData()));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}