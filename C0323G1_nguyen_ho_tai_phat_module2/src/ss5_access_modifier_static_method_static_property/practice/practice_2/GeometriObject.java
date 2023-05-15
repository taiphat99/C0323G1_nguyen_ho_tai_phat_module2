package ss5_access_modifier_static_method_static_property.practice.practice_2;

public class GeometriObject {
    public class GeometricObject{
        String color = "blue";
        public GeometricObject(){

        }
        public GeometricObject(String color){

        }
        public String getColor(){
            return color;
        }
        public void setColor(String newColor){
            this.color = newColor;
        }
    }
    public class Circle extends GeometricObject{

    }
    public class Rectangle extends GeometricObject{

    }
}

