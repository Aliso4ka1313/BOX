package lesson_1;

/**
 * Created by Администратор on 08.08.2015.
 */
public abstract class Shape {
    public int test = 33;
    protected String color;
    protected Point[] pt;

    public Shape(String color){
        this.color = color;
    }
    public abstract int calcS ();
    public abstract void draw();

    public String getName(){
        return "Shape";
    }
    public  Shape parse(String str){
        String [] parse = str.split("=");
        String part1 = parse[0];
        /*switch(part1){
            case "Rect":
                return new Rect (...);
            break;
            case "Rect":
                return new Rect (...);
            break;
            default:
                break;
        }*/
        return null;

    }
}
