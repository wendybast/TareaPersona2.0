/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapersona2.pkg0;

/**
 *
 * @author GALATEA
 */
public class Persona {
    String Nombre="";
    String Apellido="";
    int DNI;
    
    public Persona(){
        System.out.println("Buscando Información en la Base de Datos...");
    }
    
    public Persona(int DNI){
       this.DNI=DNI;
    }
    
   public Persona(int DNI,String Nombre){
       this(DNI);
       this.Nombre=Nombre;
   }
   
   public Persona(int DNI,String Nombre,String Apellido){
       this(DNI,Nombre);
       this.Apellido=Apellido;
   }
   public void Datos(){
       System.out.println("Los datos encontrados son DNI "+DNI+" "+Nombre+" "+Apellido);
   }
    
 
    }


 
