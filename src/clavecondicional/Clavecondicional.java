/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clavecondicional;

/**
 *
 * @author alexander
 */
import java.util.*;
public class Clavecondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int clave=1234;// clave correcta
        System.out.println("Digite la clave: ");
        Scanner tec=new Scanner(System.in);
        clave=tec.nextInt();
        if(clave==1234)System.out.println("correcto");
        else System.out.println("incorrecto");
        
    }
    
}
