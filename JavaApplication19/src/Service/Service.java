/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Cartas;
import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class Service {
    public ArrayList <Cartas> crearMazo(){
        ArrayList <Cartas> a1 = new ArrayList();
        int c=0;
        do{
            for (int j = 1; j <= 12; j++) {
             Cartas c1 = new Cartas();
             if(j<=7 || j>9){
                 c1.setNum(j);
             }
                switch (c) {
                    case 0:
                        c1.setPalo("Oro");
                        break;
                    case 1:
                        c1.setPalo("Basto");
                        break;
                    case 2:
                        c1.setPalo("Espada");
                        break;
                    case 3:
                        c1.setPalo("Copas");
                        break;    
                    
                }
                a1.add(c1);
            }
            c++;
        }while(c<4);
        
        return a1;
    }
    
    
    
}
