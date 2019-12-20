/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personadirecciones;

/**
 *
 * @author Ingenieria
 */
public class PersonaDirecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Carlitos");
        Direccion direccion = new Direccion();
        
        persona.setDireccion(direccion);
        persona.setDireccion(direccion);
        persona.setDireccion(direccion);
    }
    
}
