/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate Stringdefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.yasuni.objects;

/**
 *
 * @author aleja
 */
public class Tour {

    private String code;
    private String name;
    private Trail[] severalTrails = new Trail[10];
    private Guide[] guide = new Guide[10];
    private CommunicationDevice[] device = new CommunicationDevice[10];

    public Tour(String code, String name, Trail[] severalTrails, Guide[] guide, CommunicationDevice[] device) {
        this.code = code;
        this.name = name;
        this.severalTrails = severalTrails;
        this.guide = guide;
        this.device = device;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trail[] getSeveralTrails() {
        return severalTrails;
    }

    public void setSeveralTrails(Trail[] severalTrails) {
        this.severalTrails = severalTrails;
    }

    public Guide[] getGuide() {
        return guide;
    }

    public void setGuide(Guide[] guide) {
        this.guide = guide;
    }

    public CommunicationDevice[] getDevice() {
        return device;
    }

    public void setDevice(CommunicationDevice[] device) {
        this.device = device;
    }

}
