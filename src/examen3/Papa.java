/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

/**
 *
 * @author LAB-USR-CAQP-C0206
 */
public class Papa implements Producto{

    public Papa(double cantidad) {
        this.nombre = "papa";
        this.cantidad = cantidad;
        this.precio = 1.50*(1+1*Producto.IGV);
    }
    
    
    
    private String nombre;
    private double cantidad;
    private double precio;

    
    @Override
    public boolean isAgranel(){
        return true;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Number getCantidad() {
        return cantidad;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString(){
        return this.nombre + "->" + this.cantidad +" kg --- costo C/U" + this.precio ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCantidad(Number cantidad) {
        this.cantidad = (double)cantidad;
    }
    
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }    

}
