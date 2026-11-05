/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package espoch.edu.ec.yasuni.access;

import espoch.edu.ec.yasuni.objects.InterpretiveTour;

/**
 *
 * @author aleja
 */
public interface InterfaceInterpretiveTour {

    public double distance(InterpretiveTour interpretiveTour);

    public boolean orderRuteTime(InterpretiveTour interpretiveTour);

    public boolean orderRuteDistance(InterpretiveTour interpretiveTour);
}
