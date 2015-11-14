package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 05.09.2015.
 */
public class MyTranslator {
    private HashMap <String,String>dictionary = new HashMap<>();

    public MyTranslator() {
        //dictionary.put("cat", "кот");
        //dictionary.put("human", "человек");
        //dictionary.put("dog", "собака");
    }
    public void loadDic (String filename){
            BufferedReader in = null;
            try {
                in = new BufferedReader( (new FileReader(filename)));
                String s;
                /// read open file by strings
                while ((s = in.readLine())!=null){
                    String[] parse1= s.split("-");
                    this.dictionary.put(parse1[0], parse1[1]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                    try {
                        if(in != null)
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }



    }
public String translate (String en){
    String[] parse1 = en.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String s: parse1  ){
        String tmp = dictionary.get(s);
        sb.append(tmp);
        sb.append(' ');
    }
    return sb.toString();
    }
   /* public void addNewWord(String){

    }*/
}
