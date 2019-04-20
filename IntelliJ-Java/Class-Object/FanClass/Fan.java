/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;

/**
 *
 * @author Hoang Nhat
 */
public class Fan {
	final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = 1;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStatus(boolean on) {
		this.on = on;
	}
	
	public boolean getStatus() {
		return on;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
