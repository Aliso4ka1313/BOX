package generics;

/**
 * Created by Администратор on 29.08.2015.
 */
public class MyTestCollection<T> {
    private T[] arr;
    private int i;

    public MyTestCollection(int n) {
        arr = (T[]) new Object[n];
        i = 0;
    }

    public void add(T elm) {
        if (i < arr.length) {
            arr[i] = elm;
            i++;

        }
    }
    public T  get (int k){
        return arr[k];
    }


}
