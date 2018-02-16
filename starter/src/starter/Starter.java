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
import java.util.ArrayList;
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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            ArrayList<String[]> action = new ArrayList<String[]>();
            FileReader fr=new FileReader(System.getProperty("user.home")+"//Desktop//rodokmen.txt");
            BufferedReader br=new BufferedReader(fr);
            String kokot=null;
            while((kokot=br.readLine()) !=null){          
            String[] pole =kokot.split(",");
            //System.out.println(Arrays.toString(pole));
            action.add(pole);
            }
            
            System.out.println(action.get(0)[4]);
            
            for(int i=0;i<action.size();i++){
                int c=13;
            if(action.get(i)[1].equals(String.valueOf(c)))
                   System.out.println(action.get(i)[0]);         
            }
      
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
