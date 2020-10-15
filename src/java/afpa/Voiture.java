/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afpa;

/**
 *
 * @author cda600
 */
public class Voiture {
    private Chassis chassis;
    
    private Roue roues;

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Roue getRoues() {
        return roues;
    }

    public void setRoues(Roue roues) {
        this.roues = roues;
    }
    
    
    public Voiture(){
        chassis = new Chassis();
    }
    
    public String toString(){
        return "je suis la voiture" +chassis+"roues"+roues;
    }
    
}
