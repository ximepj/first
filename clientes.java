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

public class clientes {
        public String nnombre;
        public String aapellido;
        public String pprovincia;
        public String ccedula;
    public void cliens () {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre= "";
        String apellido= "";
        String provincia= "";
        String cedula="";
        
        System.out.println("Ingrese el nombre: ");
        nombre= sc.nextLine();
        
        
        System.out.println("Ingrese el apellido: ");
        apellido=sc.nextLine();      
        
        System.out.println("Ingrese la provincia en la que vive: ");
        provincia = sc.nextLine();
        
      
        System.out.println("Ingrese la cedula: ");
        cedula = sc.nextLine();
        
        nnombre=nombre;
        aapellido=apellido;
        pprovincia=provincia;
        ccedula=cedula;
        
        printClientes();
        
        
        
        
        
      
        
                
       
      
}

    public clientes() {
          
    }

    public clientes(String nnombre, String aapellido, String pprovincia, String ccedula) {
        this.nnombre = nnombre;
        this.aapellido = aapellido;
        this.pprovincia = pprovincia;
        this.ccedula = ccedula;
    }

    public String getNnombre() {
        return nnombre;
    }

    public void setNnombre(String nnombre) {
        this.nnombre = nnombre;
    }

    public String getAapellido() {
        return aapellido;
    }

    public void setAapellido(String aapellido) {
        this.aapellido = aapellido;
    }

    public String getPprovincia() {
        return pprovincia;
    }

    public void setPprovincia(String pprovincia) {
        this.pprovincia = pprovincia;
    }

    public String getCcedula() {
        return ccedula;
    }

    public void setCcedula(String ccedula) {
        this.ccedula = ccedula;
    }
        

                
        
        public void printClientes(){
        
        System.out.println("Nombre: " + nnombre);
        System.out.println("Apellido: " + aapellido);
        System.out.println("Cedula: " + ccedula);
        System.out.println("Provincia: "+ pprovincia);
      
    }

   
    }
        
    


    



