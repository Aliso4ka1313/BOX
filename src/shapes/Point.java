package shapes;

public class Point implements Cloneable{

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calcDx(Point pt2) {
        return this.x - pt2.x;
    }

    public int calcDy(Point pt2) {
        return this.y - pt2.y;
    }

    public int distance(Point pt2) {
        return (int) Math.sqrt(Math.pow(this.x - pt2.x, 2)
                + Math.pow(this.y - pt2.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +//String.format("Point:(%s,%s),x,y);
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static Point parse(String str) throws MyException{
        String[] s = str.split(",");
        int px = 0;
        int py = 0;
        try {
            px = Integer.parseInt(s[0].substring(1));
            py = Integer.parseInt(s[1].substring(0, s[1].length() - 1));
        }catch (Exception e){
            throw new MyException("My Error!!!");
        }
            return new Point(px, py);
    }

    /*@Override
    protected void finalize() {
        System.out.println("Help me!!!");
    }*/
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
