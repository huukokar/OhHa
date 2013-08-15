/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohhaprojekti;

import java.util.HashMap;

/**
 *
 * @author Huksi
 */
public final class Ruudukko {
    int pystyruudut;
    int vaakaruudut;
    int miinoja;
    int miinojaJaljella;
    int avaamattomiaRuutuja;
    HashMap<String, Ruuturivi> rivit;
    
    public Ruudukko(int pystyruudut, int vaakaruudut, int miinoja){
        this.pystyruudut = pystyruudut;
        this.vaakaruudut = vaakaruudut;
        this.miinoja = miinoja;
        this.miinojaJaljella = miinoja;
        this.avaamattomiaRuutuja = pystyruudut*vaakaruudut;
        this.rivit = new HashMap<String, Ruuturivi>();
        
        int n = 1;
        
        while (n <= this.pystyruudut){
           String indeksikirjain = muutaIndeksiKirjaimeksi(n);
           this.rivit.put(indeksikirjain, new Ruuturivi(indeksikirjain, this.vaakaruudut));
           n++;
        }
        
    }
    
    public void avaaRuutu(Ruutu ruutu){
        this.avaamattomiaRuutuja = this.avaamattomiaRuutuja - 1;
    }
    
    public String muutaIndeksiKirjaimeksi(int indeksi){
        
        if (indeksi == 1){
            return "A";
        } else if(indeksi == 2){
            return "B";
        } else if(indeksi == 3){
            return "C";
        } else if(indeksi == 4){ 
            return "D";
        } else if(indeksi == 5){
            return "E";
        } else if(indeksi == 6){
            return "G";
        } else if(indeksi == 7){
            return "H";   
        } else if(indeksi == 8){
            return "I";
        } else if(indeksi == 9){
            return "J";
        } else if(indeksi == 10){
            return "K";
        } else if(indeksi == 11){
            return "L";
        } else if(indeksi == 12){
            return "M"; 
        } else if(indeksi == 13){
            return "N";
        } else if(indeksi == 14){
            return "O";
        } else if(indeksi == 15){
            return "P";
        } else if(indeksi == 16){
            return "Q";
        } else if(indeksi == 17){
            return "R";
        } else if(indeksi == 18){
            return "S";
        } else if(indeksi == 19){
            return "T";
        } else if(indeksi == 20){
            return "U";    
        } else if(indeksi > 20){
            return "liian iso";
        } else if (indeksi < 1){
            return "nolla";
        }
      return "error";  
        
    }
}

}
            

