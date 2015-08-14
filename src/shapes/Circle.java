package shapes;

/**
 * Created by Администратор on 08.08.2015.
 */
public class Circle extends Shape{

     private int r;

    public Circle (String color,Point p, int r){
        super(color);
        this.pt = new Point [1];
        this.pt[0] = p;
        this.r = r;
    }
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public int calcS() {
        return (int) (Math.PI*(r*r));// Math.pow(r,2)
    }
}
