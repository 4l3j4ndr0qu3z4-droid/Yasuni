/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.yasuni.data;

import espoch.edu.ec.yasuni.access.InterfaceRegularTour;
import espoch.edu.ec.yasuni.objects.InterpretiveTour;
import espoch.edu.ec.yasuni.objects.RegularTour;
import espoch.edu.ec.yasuni.objects.Trail;

/**
 *
 * @author aleja
 */
public class RegularTours extends Tours implements InterfaceRegularTour {

    public double distance(RegularTour regularTour) {
        Trail[] trail = new Trail[10];
        trail = regularTour.getSeveralTrails();

        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += trail[i].getLengthTrail();
        }
        return total;
    }

    public boolean orderRuteTime(RegularTour regularTour) {
        Trail[] trail = new Trail[10];
        trail = regularTour.getSeveralTrails();

        for (int i = 0; i < 10; i++) {
            if (trail[i].getTime() >= trail[i + 1].getTime()) {
                for (int j = 0; j < 10; j++) {
                    double temp = trail[i].getTime();
                    double tem = trail[i + 1].getTime();

                trail[i].setTime(tem);
                trail[i+1].setTime(temp);
                
                

                }
            }
        }

        return true;
    }

    public boolean orderRuteDistance(RegularTour regularTour) {
        boolean result = false;

        return result;

    }

}
