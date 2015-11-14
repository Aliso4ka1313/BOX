package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Администратор on 26.09.2015.
 */
public class Sender {
    private String host;
    private int port;
    DatagramSocket ds;
    Sender(String host, int port){
        this.host = host;
        this.port = port;
        try {
            ds= new DatagramSocket();
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void sendMessage(String mes){
        try{
            byte[] data = mes.getBytes();
            //InetAddress addr = InetAddress.getByName(host);
            InetAddress addr = InetAddress.getByName("localhost");
            DatagramPacket pack =
                    new DatagramPacket(data, data.length, addr, port);

            ds.send(pack);

        }catch(IOException e){
            System.err.println(e);
        }
    }
}