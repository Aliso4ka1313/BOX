package shapes;

public class Rect extends Shape {
    public int test = 55;

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
        System.out.println(toString());
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

    public Rect parse(String str) {


        return null; ///new Rect();
    }
}
