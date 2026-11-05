/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.yasuni.objects;

/**
 *
 * @author aleja
 */
public class CommunicationDevice {

    private String code;
    private String description;
    private boolean status;
    
    public CommunicationDevice(String code, String description, boolean status, Guide guides) {
        this.code = code;
        this.description = description;
        this.status = status;
     }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
