package A;
public class Test {
    public static void main(String[] args) {
        Circle c1=new Circle(3.0,"Blue");
        System.out.println(c1.getColor() + "Color of the provided instance");
        //3
        System.out.println(c1.radius + "Color of the provided instance");
        c1.radius=4.0;
        //4
        c1.setRadius(2.0);
        c1.setColor("green");
    }
}
