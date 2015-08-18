package searchsum;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Администратор on 15.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] mmm = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            mmm[i] = rnd.nextInt(100) - 50;
        }
        Arrays.sort(mmm);
        System.out.println(Arrays.toString(mmm));
        long start = System.currentTimeMillis();
        for (int i = 0; i < mmm.length; i++) {
            for (int j = 0; j < mmm.length; j++) {
                /*for (int k = 0; k <mmm.length ; k++) {
                    if(mmm[i]+mmm[j]+mmm[k] ==0){
                        System.out.println(String.format("%s, %s,%s", mmm [i], mmm[j], mmm [k]));
                    }
                }

            }*/
                int f = -(mmm[i] + mmm[j]);
                int res = Arrays.binarySearch(mmm, f);
                if (res > -1) {
                    System.out.println(String.format("%s, %s,%s", mmm[i], mmm[j], mmm[res]));
                }
            }
            long stop = System.currentTimeMillis();
            System.out.println(stop - start);
        }
    }
}
