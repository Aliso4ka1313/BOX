package BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Администратор on 05.09.2015.
 */
public class BufferedReaderTest {
    public static String read (String filename) throws IOException {
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder();
        try {
            in = new BufferedReader( (new FileReader(filename)));
            String s;
            /// read open file by strings
            while ((s = in.readLine())!=null)
                sb.append(s + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            in.close();
        }
       return sb.toString();

    }

    public static void main(String[] args) {
        try {
            System.out.println(read("C:\\setup.log"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
