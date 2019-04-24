/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Hoang Nhat
 */
public class Point3D extends Point2D{
    private float z = 0.0f;
    private float[] arr;    
    public Point3D() {}
    
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(int index, int value) {
        this.arr[index] = value;
    }
    
    public float[] getXYZ() {
        return arr;
    }
    
    
}
