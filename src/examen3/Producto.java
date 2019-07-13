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
public interface Producto {
    
    double IGV = 0.18;
    
    public boolean isAgranel();
    public String getNombre();
    public double getPrecio();
    public Number getCantidad();
    public void setPrecio(double precio);
    public void setCantidad(Number cantidad);
    
    
}
