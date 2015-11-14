package singleton;

/**
 * Created by Администратор on 10.10.2015.
 */
public class MyConnection {
    private static MyConnection instance = new MyConnection();
    private MyConnection (){

    }
public static MyConnection getInstance(){
    if (instance == null) {
        instance = new MyConnection();
    }
    return instance;
}

}
