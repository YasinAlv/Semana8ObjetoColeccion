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
public class Direccion {
     protected String provincia;
    protected String canton;
    protected int telefono;
    protected String distrito;

    
    public Direccion(){}
    
    public Direccion(String provincia){
        this.provincia = provincia; 
    }
    public Direccion (String provincia, String canton){
        this.provincia = provincia;
        this.canton = canton;
    }
    public Direccion (String provincia, String canton, int telefono){
        this.provincia = provincia;
        this.canton = canton;
        this.telefono = telefono;
    }
    public Direccion (String provincia, String canton, int telefono, String distrito){
        this.provincia = provincia;
        this.canton = canton;
        this.telefono = telefono;
        this.distrito = distrito;
    }
    
    //*************************************************  
    public void setProvincia(String provincia) {
        this.provincia=provincia;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setCanton(String canton) {
       this.canton=canton;
    }

    public String getCanton() {
        return this.canton;
    }

    public void setTelefono (int telefono) {
        this.telefono=telefono;
    }

    public int getTelefono() {
       return this.telefono;
    }
    
    public void setDistrito (String distrito){
        this.distrito=distrito;
    }
    
    public String getDistrito(){
        return this.distrito;
    }
}
