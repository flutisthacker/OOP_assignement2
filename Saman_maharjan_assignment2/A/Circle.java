package A;
class Circle{

    private double radius =1.0;
    private String color ="red";

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(double radius){
        return Math.PI * radius * radius;
    }

    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color   ){
        this.color=color;
    }

    @Override
    public String toString() {
      return "Circle[" +
          "radius=" + radius +
          ", color=" + color + '\'' +
          ']';
    }
}