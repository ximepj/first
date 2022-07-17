/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author ximena perez, isaac murillo, caroline chaves 
 */
public class menu {
    
  
    public void Menu()
    {
        
        Scanner sc = new Scanner(System.in);
        
        float opcion=0;
        
        System.out.println("-----------------------------------------");
        System.out.println("\tMENU PRINCIPAL");
        System.out.println("");
        System.out.println("1. Ingresar datos del cliente");
        System.out.println("2. Disponibilidad de productos e inventario");
        System.out.println("3. Devoluciones");
        System.out.println("4. Facturación");
        System.out.println("5. Cierre de caja");
        System.out.println("6. Salir");
        System.out.println("-----------------------------------------");
        
        int x =1;
        
        while (x<2){
            System.out.println("Digite el numero de la opcion que desea: ");
            opcion = sc.nextInt();

            if (opcion==1){
                System.out.println("Ha seleccionado la opcion 1");
                cliens();
                break;
            }
            if (opcion==2){
                System.out.println("Ha seleccionado la opcion 2");
                break;
            }

            if (opcion==3){
                System.out.println("Ha seleccionado la opcion 3");
                break;
            }

           if (opcion==4){
                System.out.println("Ha seleccionado la opcion 4");
                break;

           }
            if (opcion==5){
                System.out.println("Ha seleccionado la opcion 5");
                break;
            }

            if (opcion==6){
                System.out.println("Se ha procedido a salir del sistema");
                
            }

            else{
                System.out.println("ERROR! Favor ingresar un numero del 1 al 6");
                
            }

  
        } 
    }   

    private void cliens() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
// poner para que pare y mandar a su propio metodo

    
    
    
    


