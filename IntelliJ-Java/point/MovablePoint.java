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
public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] speed = {xSpeed, ySpeed};
    Point2D point2D;
    
    public MovablePoint () {
    }
    
    public MovablePoint (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint (float x, float y, float xSpeed, float ySpeed) {
        this.point2D = new Point2D();
        point2D.setX(x);
        point2D.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        
    }
   
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public void setSpeed(int index, float value) {
        speed[index] = value;
    }
    
    public float[] getSpeed() {
        return speed;
    }
    
    public void move(float x, float y, float xSpeed, float ySpeed) {
        MovablePoint move = new MovablePoint(x, y, xSpeed, ySpeed);
        x += xSpeed;
        y += ySpeed;
        point2D.x = x;
        point2D.y = y;
    }
    
    @Override
    public String toString() {
        return "New point: x = " + point2D.getX() + ", y = " + point2D.getY();
    }
} 
