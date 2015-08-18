package shapes;

import java.text.ParseException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ParseException, CloneNotSupportedException {

		/*Date dt1 = new Date();
		
		Date dt2 = new Date(System.currentTimeMillis()+1000);
		
		System.out.println(dt2.compareTo(dt2));
		
		System.out.println(dt1);
		System.out.println(dt2);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		
		String str = sdf.format(dt2);
		
		Date dt5 = sdf.parse("01.08.2015 15:16:17");
		
		System.out.println(str);
		StringBuilder sb = new StringBuilder();*/

		/*MyRobot r2d2 = new MyRobot();
		r2d2.setShapeNum(10);
		Rect r = new Rect("GREEN",Point.parse("Point:(10,10)"), new Point(20,20));
		r2d2.addShape(r);
		r2d2.addShape(new Circle ("RED", new Point (10,10),23));
		r2d2.startDraw();*/

        /*Rect r1 = new Rect("GREEN", new Point(10, 10), new Point(56, 67));
        Circle c1 = new Circle("BLACK", new Point(10, 10), 45);
		r1.draw();
		Point p = Point.parse("Point:(10,10)");*/
        //System.out.println(p);


		/*Rect r1 = new Rect("WHITE", new Point (10,10), new Point (20,20));
		Rect r2 =  new Rect("RED", new Point (20,20), new Point (25,25));
		Rect r3 = new Rect("BLUE", new Point (15,15), new Point (40,40));
		Rect r4 = (Rect)r2.clone();
		Rect [] rrr = {r1,r2,r3};
		Comparable c = r2;
		System.out.println(c.compareTo(r4));
		Arrays.sort(rrr);
		System.out.println(Arrays.toString(rrr));*/

		try {
			Point p = Point.parse("(22,44)");//("(vvnvn,44)") - Error
			System.out.println(p);
		} catch (MyException e) {
			System.out.println("Error!!!");
		}
    }


}
