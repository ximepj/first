/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 
 * @author ximena perez, isaac murillo, caroline chaves 
 */
public class productos {

    private void Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void prod () {
       Scanner sc = new Scanner(System.in);
        
        float opcion=0;
        
        System.out.println("-----------------------------------------");
        System.out.println("\tProductos");
        System.out.println("");
        System.out.println("1. Tenis negro");
        System.out.println("2. Sandalias de playa");
        System.out.println("3. Botas cafe");
        System.out.println("4. Converse azul");
        System.out.println("5. Zapatos escolares");
        System.out.println("6. Salir");
        System.out.println("-----------------------------------------");
        
        int x =1;
        
        while (x<2){
            System.out.println("Digite el numero del producto que desea: ");
            opcion = sc.nextInt();

            if (opcion==1){
                System.out.println("Ha seleccionado Tenis negro");
                break;
            }
            if (opcion==2){
                System.out.println("Ha seleccionado Sandalias de playa");             
                break;
            }

            if (opcion==3){
                System.out.println("Ha seleccionado Botas cafe");
                break;
            }

           if (opcion==4){
                System.out.println("Ha seleccionado Converse azul");
                break;

           }
            if (opcion==5){
                System.out.println("Ha seleccionado Zapatos escolares");
                break;
            }

            if (opcion==6){
                System.out.println("Se ha procedido al menu");
                Menu();
                break;
            }

            else{
                System.out.println("ERROR! Favor ingresar un numero del 1 al 6");
                x=1;       
            }

  
        } 
    }   

}
