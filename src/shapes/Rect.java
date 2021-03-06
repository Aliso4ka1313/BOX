package shapes;

import java.io.Serializable;

public class Rect extends Shape implements Comparable,Cloneable, Serializable {
   // public int test = 55;

    public Rect(String color, Point p1, Point p2) {
        super(color);
        this.pt = new Point[2];
        pt[0] = p1;
        pt[1] = p2;
    }

    @Override
    public int calcS() {
        return pt[0].calcDx(pt[1]) * pt[0].calcDy(pt[1]);
    }

    @Override
    public void draw() {
        System.out.println(this);
        /*System.out.println(this.test);
        System.out.println(super.test);
        System.out.println(test);*/
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
    public boolean isSq(){
        return pt[0].calcDx(pt[1]) == pt[0].calcDy(pt[1]);
    }

    @Override
    public String toString() {
        return String.format("Rectangle=%s-%s", pt[0], pt[1]);
    }

    public  Rect parse(String str) {
        String [] s = str.split("-");
        Rect r = null;
        try{
            Point pt1 = Point. parse(s[1]);
            Point pt2 = Point. parse(s[2]);
            r = new Rect ("RED",pt1, pt2);
        }catch (Exception e){
            System.out.println("Parse Error!!!");
        }

        return r; ///new Rect();
    }
    @Override
    public int compareTo (Object o){
        Rect r = (Rect)o;
        if (this.calcS()>r.calcS()){
            return 1;
        }else if (this.calcS()<r.calcS()) {
            return -1;
        }
        return 0;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Rect r = (Rect) super.clone();
        //r.pt[0] = this.pt[0].clone();// sozdat' clone tochki u Rectangle, polnoe klonirovanie
        return r;
    }
    @Override
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + pt[0].hashCode();
        result = prime * result + pt[1].hashCode();
        result = prime * result + color.hashCode();
        return result;
    }
    @Override
    public boolean equals (Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Rect rect = (Rect) o;
        if( pt[0] != rect.pt[0] )
            return false;
        if( pt[1] != rect.pt[0] )
            return false;
        if (! color.equals(rect.color))
            return false;
        return true;
    }
}
