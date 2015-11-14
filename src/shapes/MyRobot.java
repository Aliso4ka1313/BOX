package shapes;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Администратор on 08.08.2015.
 */
public class MyRobot {
   // private Shape []shapes;
   // private List<Shape> shapes = new ArrayList<>();
    private Deque<Shape> shapes = new LinkedList<Shape>();
    private int i = 0;
    public MyRobot(){
    }
    /*public void setShapeNum(int n){
        shapes = new Shape [n];
        i = 0;
    }
    public void addShape(Shape s){
        this.shapes[i] = s;
        i++;
    }*/
   /* public void addShape(String str){
        this.shapes[i] = str;
        i++;
    }*/
    /*public void startDraw(){
        for(int j = 0;j<i; j++){
            shapes[j].draw();
        }
    }*/
    public void addShapes (String str){
       //this.shapes.add(Shape.parse(str));
    }

    public double sumS (){
        double sum = 0;
        for (Shape sh: shapes);
        return sum;
    }
    public void doJob (){
       while (shapes.size()>0){
           Shape sh = shapes.poll();
           sh.draw();
       }
    }
}
