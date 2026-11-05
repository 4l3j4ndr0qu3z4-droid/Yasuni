/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package espoch.edu.ec.yasuni.access;

import espoch.edu.ec.yasuni.objects.RegularTour;

/**
 *
 * @author aleja
 */
public interface InterfaceRegularTour {

    public double distance(RegularTour regularTour);

    public boolean orderRuteTime(RegularTour regularTour);

    public boolean orderRuteDistance(RegularTour regularTour);
}
