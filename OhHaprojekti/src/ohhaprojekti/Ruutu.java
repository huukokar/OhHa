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
    public boolean onkoTyhja;
    public int sarake;
    public String rivi;
    public int miinojaLahella;
    
    public static final int NOLLA = 0;
    public static final int YKSI = 1;
    public static final int KAKSI = 2;
    public static final int KOLME = 3;
    public static final int NELJA = 4;
    public static final int VIISI = 5;
    public static final int KUUSI = 6;
    public static final int SEITSEMAN = 7;
    public static final int KAHDEKSAN = 8;


    
    public Ruutu(String rivi, int sarake){
        this.onMiina = false;
        this.onkoAvattu = false;
        this.sarake = sarake;
        this.rivi = rivi;
        this.onkoTyhja = true;
        this.miinojaLahella = 0;
    }
    
    private String lahiMiinojenMaara(){
        
          if (miinojaLahella == 1) {
            return "YKSI";
        } else if (miinojaLahella == 2) {
            return  "KAKSI";
        } else if (miinojaLahella == 3) {
            return "KOLME";
        } else if (miinojaLahella == 4) {
            return  "NELJA";
        } else if (miinojaLahella == 5) {
            return "VIISI";
        } else if (miinojaLahella == 6) {
            return  "KUUSI";
        } else if (miinojaLahella == 7) {
            return "SEITSEMAN";
        } else if (miinojaLahella == 8) {
            return  "KAHDEKSAN";
        }         
      return "NOLLA";      
    }
    
    public void miinoitaRuutu(){
        this.onMiina = true;
    }
    
    public void ruudunAvaus(){
        this.onkoAvattu = true;
    }
            
}
