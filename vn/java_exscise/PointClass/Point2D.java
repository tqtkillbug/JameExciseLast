package com.java_exscise.PointClass;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
      this.x = x;
      this.y = y;
    }
    public float[] getXY(){
         float[] array = new float[2];
         array[0] = x;
         array[1] = y;
         return array;
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y + ")";
    }

}
class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.z = z;
        setX(x);
        setY(y);
    }

    public float[] getXYZ() {
        float[] arrays = new float[3];
        arrays[0] = z;
        arrays[1] = getY();
        arrays[2] = getX();
        return arrays;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }

}
