/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Steffen Bertram <Smaragdblitz@gmx.de>
 */
public class SortBubble {
    
     int [] feld = {888, 99, 88, 77, 66, 55, 44, 111, 222, 333 };
   
    public static void sortiere(int[] x) {
      boolean unsortiert=true;
      int temp;
      
      while (unsortiert){
         unsortiert = false;
         for (int i=0; i < x.length-1; i++) 
            if (x[i] > x[i+1]) {                      
               temp       = x[i];
               x[i]       = x[i+1];
               x[i+1]     = temp;
               unsortiert = true;
            }          
      } 
    
    }
}
