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
public class TareaPersona20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Pa,Pb,Pc,Pd;
        
        Pa = new Persona();
        Pb = new Persona(30981244);
        Pc = new Persona(20114633,"Viktor");
        Pd = new Persona(40229711,"Axel","Bastidas");
        
        Pb.Datos();
        Pc.Datos();
        Pd.Datos();
        
    }
    
}
