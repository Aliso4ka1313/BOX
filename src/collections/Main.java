package collections;



import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

/**
 * Created by Администратор on 29.08.2015.
 */
public class Main {
    public static void main(String[] args) {
     /*   //List<Integer> a = new LinkedList<Integer>();
        List<Integer> a = new ArrayList<Integer>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            a.add(0, i);
            //a.add(i/10,i);
        }
        long total = System.currentTimeMillis() - start;
        System.out.println("INSERT:" + total);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int x = a.get(i / 2);
            // int x = b.get(i/2);
        }
        long total12 = System.currentTimeMillis() - start2;
        System.out.println("GET:" + total12);*/

        MyTranslator mt = new MyTranslator();
        mt.loadDic("D:\\Cat.txt");
        System.out.println(mt.translate("cat human dog"));

        /*Set<String> mySet = new HashSet<>();



        mySet.add("aaa");
        mySet.add("aaa");
        mySet.add("aaa");
        mySet.add("bbb");
        mySet.add("dddd");
        mySet.add("aaa");
        mySet.add("aaa");
        System.out.println(mySet);*/

        //lucky lotery numbers
        /* Set<Integer> mySet = new HashSet<>();
        Random rnd = new Random();
        while(mySet.size() < 6){
            int x = rnd.nextInt(49);
            mySet.add(x);

        }
        System.out.println(mySet);

    }


    {
        File f = new File("D\\Programming");
        String[] list1 = f.list();
        File[] list2 = f.listFiles();
        for (String s : list1)
            System.out.println(s);
        for (File t : list2)
            try {
                System.out.println(t.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        //list2[0].delete(); delete file
        long sz = list2[1].length();//size file
        long date = f.lastModified();

        Date dt = new Date(date);
        System.out.println(dt);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(dt));
        boolean b = f.isDirectory();
        new File("C:\\test").mkdir();
        new File("test1\\p1\\p2\\p3").mkdirs();*/



    }


}
