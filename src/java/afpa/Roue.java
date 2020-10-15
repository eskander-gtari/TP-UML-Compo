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
public class Roue {
    
    private int roues = 4;

    public int getRoues() {
        return roues;
    }

    public void setRoues(int roues) {
        this.roues = roues;
    }
    
    
    
    public String toString(){
        return "Je suis le " + roues;
    }
    
}
