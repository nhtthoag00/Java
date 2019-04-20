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
public class StopWatch {
    private double timeStart, timeEnd;
    public StopWatch() {}
    
    public StopWatch(double timeStart, double timeEnd) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }
    
    public double getTimeStart() {
        return this.timeStart = System.currentTimeMillis();
    }
    
    public double getTimeEnd() {
        return this.timeEnd = System.currentTimeMillis();
    }
    
    public double getElapseTime() {
        return this.timeEnd - this.timeStart;
    }
}
