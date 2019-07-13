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
public class Atun implements Producto{

    public Atun(int cantidad) {
        this.nombre = "atun";
        this.cantidad = cantidad;
        this.precio = 4.00*(1+1*Producto.IGV);
    }
    
    private String nombre;
    private int cantidad;
    private double precio;

    
    @Override
    public boolean isAgranel(){
        return false;
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
        return this.nombre + "->" + this.cantidad +" uni --- costo C/U" + this.precio ;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void setCantidad(Number cantidad) {
        this.cantidad = (int)cantidad;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }    
}
