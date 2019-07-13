package examen3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-USR-CAQP-C0206
 */
public class CalculadoraMercado {
    
    public static void suma(Producto prod,Number num){
        
        if(prod.isAgranel()){
            
            double salida;
            
            if(num.getClass().getSimpleName().equalsIgnoreCase("Integer")){
                salida = Double.parseDouble(""+num);
            }else{

                salida = (double)num;
            }
            
            double camb = (double)prod.getCantidad() + salida;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
        }else{
            int camb = (int)prod.getCantidad() + (int)num;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
        }
    }
    
    public static void resta(Producto prod,Number num){
        
        if(prod.isAgranel()){
            double salida;
            
            if(num.getClass().getSimpleName().equalsIgnoreCase("Integer")){
                salida = Double.parseDouble(""+num);
            }else{

                salida = (double)num;
            }
            double camb = (double)prod.getCantidad() - salida;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
        }else{
            int camb = (int)prod.getCantidad() - (int)num;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
        }
    }
    
    public static void multiplicacion(Producto prod,Number num){
        
        
        if(prod.isAgranel()){
            double salida;
            
            if(num.getClass().getSimpleName().equalsIgnoreCase("Integer")){
                salida = Double.parseDouble(""+num);
            }else{

                salida = (double)num;
            }
            double camb = (double)prod.getCantidad() * salida;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
            
        }else{
            int camb = (int)prod.getCantidad() * (int)num;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
        }
    }
    
    public static void division(Producto prod,Number num){
        
        if(prod.isAgranel()){
            double salida;
            
            if(num.getClass().getSimpleName().equalsIgnoreCase("Integer")){
                salida = Double.parseDouble(""+num);
            }else{

                salida = (double)num;
            }
            double camb = (double)prod.getCantidad() + salida;
            prod.setCantidad(camb);
            InterfazGrafica.mostrar("nueva cantida " + prod.getCantidad());
        }else{
            InterfazGrafica.mostrar("este producto no se puede usar dividiendo");
        }
    }
    
}
