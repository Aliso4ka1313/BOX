package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Администратор on 17.10.2015.
 */

class MyLogic{
    public static String transform (String s1){
        return s1 +"Test";
    }
}
public class StreamTest {
    public static void main(String[] args) {
        List <String> mList = Arrays.asList("aa1", "cc2", "cc3", "AA5");

        mList
                .stream()// parallel()
                .filter(s -> s.startsWith("a"))// just chooses elements, doesn't do smth
                .map(String::toUpperCase)//sequential() does something with data
                //.map(MyLogic::transform)
                .sorted()
                .forEach(System.out::println);// terminal method

        IntStream.range(8, 120)
                .asDoubleStream()
                .map(Math::cos)
               // .average()/ifPresent(System.out::println)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1,2,3,4,5,6,7,8})//double d = Arrays///
                .map(n -> 2*n+1)//.summaryStatistics()/.getSum();System.out.println(d)
                .average()
                .ifPresent(System.out::println);
    }
}
