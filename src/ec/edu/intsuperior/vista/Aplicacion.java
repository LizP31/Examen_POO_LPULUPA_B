/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author LIZ
 */
public class Aplicacion {
    
    
    public static void main(String[] args) {
        
      Cliente Cl = new Cliente();
      Cliente Cl2 = new Cliente();
      
      
      Persona p1 = new Persona();
      Persona p2 = new Persona();
     
     
      
        Cl.setTelefono("098476055");
        Cl2.setTelefono("0980830521");
        p1.setNombre("Luis");
        p2.setNombre("Fernando");
        
        p1.setEdad(23);
        p2.setEdad(29);
        
        
        System.out.println(p1.toString());
        System.out.println(Cl.toString());
        
        System.out.println(p2.toString());
        System.out.println(Cl2.toString());
       
    }     
}
