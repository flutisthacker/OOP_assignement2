package B;

public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;

    public Rectangle(){}
    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return (double) ( this.length * this.width);
    }
    public double getPerimeter(){
        return (double)( 2* (this.length + this.width));
    }

    @Override
    public String toString() {
      return "Rectangle[" +
          "length=" + length +
          ", width=" + width + '\'' +
          ']';
    }
}
