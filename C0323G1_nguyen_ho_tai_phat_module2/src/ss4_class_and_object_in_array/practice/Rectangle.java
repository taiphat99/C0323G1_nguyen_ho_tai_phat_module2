package ss4_class_and_object_in_array.practice;

public class Rectangle {
    int width;
    int height;
    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return (width+height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
