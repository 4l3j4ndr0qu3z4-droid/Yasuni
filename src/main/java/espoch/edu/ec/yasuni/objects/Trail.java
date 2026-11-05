/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate doubledefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.yasuni.objects;

/**
 *
 * @author aleja
 */
public class Trail {

    private String name;
    private double lengthTrail;
    private double time;

    public Trail(String name, double lengthTrail, double time) {
        this.name = name;
        this.lengthTrail = lengthTrail;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthTrail() {
        return lengthTrail;
    }

    public void setLengthTrail(double lengthTrail) {
        this.lengthTrail = lengthTrail;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    
}
