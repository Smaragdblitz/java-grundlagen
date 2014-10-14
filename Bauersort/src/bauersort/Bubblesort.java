/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bauersort;

/**
 *
 * @author Steffen Bertram <Smaragdblitz@gmx.de>
 */
public class Bubblesort {
    
    public static void sortieren(int[] feld){
    
    int tmp = 0;
    int may = feld.length -1;
    boolean getauscht = false;
            
            do{
            getauscht = false;
            
            for(int n = 0; n < max; n++){
            if (feld[n] > feld[n +1])
                tmp = feld [n];
            feld[n] = feld [n+1];
            feld [n +1 ] = tmp;
            
            getauscht = true;

                }
            
            maxx--;}
            } while(getauscht);
    
}
