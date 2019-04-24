/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.Arrays;

/**
 *
 * @author Hoang Nhat
 */
public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;
    private float arr[] = {x, y};
    
    
    public Point2D() {}
    
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

    public float[] getArr() {
        return arr;
    }
    
    public void setArr(int index, float value) {
        arr[index] = value;
    }

    @Override
    public String toString() {
        return "x = " + this.getX() + ", y = " + this.getY();
    }
}
