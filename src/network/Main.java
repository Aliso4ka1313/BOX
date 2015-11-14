package network;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Администратор on 26.09.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Recipient r = new Recipient();
        r.start();
        Thread.sleep(1000);

        Sender sndr = new Sender("localhost", 1050);

        BufferedReader br = new BufferedReader(new FileReader("D:\\film.go2"));
        String line = "";
        while((line = br.readLine())!=null){

            for(int i=0;i<12;i++){
                sndr.sendMessage(br.readLine());
            }

            Thread.sleep(200);

        }
    }

}
