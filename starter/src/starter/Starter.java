/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dano
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fr=new FileReader(System.getProperty("user.home")+"//Desktop//rodokmen.txt");
            BufferedReader br=new BufferedReader(fr);
            String kokot=br.readLine();
            String[] pole =kokot.split(",");
System.out.println(Arrays.toString(pole));
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
