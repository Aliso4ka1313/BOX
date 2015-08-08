package lesson_1;

public class Point {

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

    public static Point parse(String s) {
        String[] parse1 = s.split(":")[1].split(",");
        int px = Integer.parseInt(parse1[0].substring(1));
        int py = Integer.parseInt(parse1[1].substring(0, parse1[1].length() - 1));
        return new Point(px, py);
    }

    /*@Override
    protected void finalize() {
        System.out.println("Help me!!!");
    }*/
}
