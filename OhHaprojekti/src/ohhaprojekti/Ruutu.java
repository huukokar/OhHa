/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohhaprojekti;

/**
 *
 * @author Huksi
 */
public class Ruutu {
    public boolean onMiina;
    public boolean onkoAvattu;
    public int sarake;
    public String rivi;
    
    public Ruutu(String rivi, int sarake){
        this.onMiina = false;
        this.onkoAvattu = false;
        this.sarake = sarake;
        this.rivi = rivi;
        
    }
    
    public void miinoitaRuutu(){
        this.onMiina = true;
    }
    
    public void ruudunAvaus(){
        this.onkoAvattu = true;
    }
            
}
