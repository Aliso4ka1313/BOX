package shapes;

/**
 * Created by Администратор on 08.08.2015.
 */
public class MyRobot {
    private Shape []shapes;
    private int i = 0;
    public MyRobot(){
    }
    public void setShapeNum(int n){
        shapes = new Shape [n];
        i = 0;
    }
    public void addShape(Shape s){
        this.shapes[i] = s;
        i++;
    }
   /* public void addShape(String str){
        this.shapes[i] = str;
        i++;
    }*/
    public void startDraw(){
        for(int j = 0;j<i; j++){
            shapes[j].draw();
        }
    }
}
