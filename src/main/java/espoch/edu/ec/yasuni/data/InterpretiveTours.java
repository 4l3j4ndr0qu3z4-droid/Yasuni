/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.yasuni.data;

import espoch.edu.ec.yasuni.access.InterfaceInterpretiveTour;
import espoch.edu.ec.yasuni.objects.InterpretiveTour;
import espoch.edu.ec.yasuni.objects.Trail;

/**
 *
 * @author aleja
 */
public class InterpretiveTours extends Tours implements InterfaceInterpretiveTour {

    public double distance(InterpretiveTour interpretiveTour) {
        Trail[] trail = new Trail[10];
        trail = interpretiveTour.getSeveralTrails();

        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += trail[i].getLengthTrail();
        }
        return total;
    }

    public boolean orderRuteTime(InterpretiveTour interpretiveTour) {
        boolean result = false;

        return result;
    }

    public boolean orderRuteDistance(InterpretiveTour interpretiveTour) {
        boolean result = false;

        return result;

    }

}
