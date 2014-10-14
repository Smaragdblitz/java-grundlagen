/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bauersort;

import java.util.Arrays;

/**
 *
 * @author Steffen Bertram <Smaragdblitz@gmx.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] feld = {9, 6, 8, 4, 7, 5, 3, 1, 0, 2};
        
        System.out.println(Arrays.toString(feld));
        
        BubbleSort.sortieren(feld);
        
        System.out.println(Arrays.toString(feld));
    }
    
}
