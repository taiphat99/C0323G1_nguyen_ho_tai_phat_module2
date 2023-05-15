package ss6_inheritence.exercise.exercise_2;

public class Point3D extends Point2D {
    private float z;
    float[] array = new float[3];
    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        array[0]=super.getY();
        array[1]=super.getX();
        array[2]=z;
        return array;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
