/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.yasuni.data;

import espoch.edu.ec.yasuni.objects.Tour;
import espoch.edu.ec.yasuni.objects.Trail;

/**
 *
 * @author aleja
 */
public class Tours {

    
    public double distance(Tour tour) {
        Trail[] trail = new Trail[10];
        trail = tour.getSeveralTrails();
        
        double total = 0;
        for (int i = 0; i < 10; i++) {
        total += trail[i].getLengthTrail(); 
        }
        return total;
    }

    public boolean orderRuteTime(Tour tour) {
        boolean result = false;
               
        return result;
    }

    public boolean orderRuteDistance(Tour tour) {
        boolean result = false;
        
        return result;

    }
}
