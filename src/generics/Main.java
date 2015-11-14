package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by Администратор on 29.08.2015.
 */
public class Main {
    public static void main(String[] args) {
       /* MyTestCollection<String> mms = new MyTestCollection<>(5);
        mms.add("Str");
        mms.add("Str2");
        String s = mms.get(0);
        System.out.println(s);*/

        ArrayList<String> arrList = new ArrayList<>(1000);

        arrList.add("Str1");
        arrList.add("Str2");

        LinkedList<String> a = new LinkedList<>();
        Iterator<String> itr = a.iterator();

         while (itr.hasNext()){// analog foreaach
             String str = itr.next();
             System.out.println(str);
         }


    }
}
