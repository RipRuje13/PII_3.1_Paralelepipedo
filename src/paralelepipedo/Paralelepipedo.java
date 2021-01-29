/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelepipedo;

import java.util.Scanner;

/**
 *
 * @author Noriega
 */
public class Paralelepipedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vector u = new Vector();
        Vector v = new Vector();
        Vector w = new Vector();
        
        Scanner leer = new Scanner(System.in);
        int op,x,y,z;
        do{
            System.out.println("---MENU---");
            System.out.println("1.- Leer vectores");
            System.out.println("2.- Calcular volumen");
            System.out.println("3.- imprimir vectores del paralelepipedo");
            System.out.println("4.- Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("---Vector 1---");
                    System.out.println("leer X");
                    x = leer.nextInt();
                    u.setX(x);
                    System.out.println("leer Y");
                    y = leer.nextInt();
                    u.setY(y);
                    System.out.println("leer Z");
                    z = leer.nextInt();
                    u.setZ(z);
                    
                    System.out.println("---Vector 2---");
                    System.out.println("leer X");
                    x = leer.nextInt();
                    v.setX(x);
                    System.out.println("leer Y");
                    y = leer.nextInt();
                    v.setY(y);
                    System.out.println("leer Z");
                    z = leer.nextInt();
                    v.setZ(z);
                    
                    System.out.println("---Vector 3---");
                    System.out.println("leer X");
                    x = leer.nextInt();
                    w.setX(x);
                    System.out.println("leer Y");
                    y = leer.nextInt();
                    w.setY(y);
                    System.out.println("leer Z");
                    z = leer.nextInt();
                    w.setZ(z);
                break;
                    
                case 2:
                    u.volumen(v, w);
                break;
                
                case 3:
                    System.out.println(u.toString(v, w));
                break;
            }
        }while(op!=4);
    }
    
}
