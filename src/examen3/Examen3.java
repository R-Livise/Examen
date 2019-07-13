/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author LAB-USR-CAQP-C0206
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer,Producto> compra = new LinkedHashMap<Integer,Producto>();
        
        int opcion;
        int producto;
        int operacion;
        Number operador;
        int codigo = 1;
        int cod=0;
        while(true){
            
            opcion=InterfazGrafica.elegirOpcionInt(InterfazGrafica.MENU_OPCIONES);

            switch(opcion){
                case 1 :
                    producto=InterfazGrafica.elegirOpcionInt(InterfazGrafica.MENU_PRODUCTOS);
                    
                    
                    switch(producto){
                        case 1 :
                            compra.put(codigo,new Papa(InterfazGrafica.elegirNumero("¿Cunatos kilos de PAPA?").doubleValue()));
                            break;
                        case 2 :
                            compra.put(codigo,new Atun(InterfazGrafica.elegirNumero("¿Cuantas latas de ATÚN?").intValue()));
                            break;
                        case 3 :
                            compra.put(codigo,new Panes(InterfazGrafica.elegirNumero("¿CuantOs kilos de PAN?").doubleValue()));
                            break;
                        default:
                            InterfazGrafica.mostrar("Opcion Incorrecta");
                            break;
                    }
                    break;
                case 2:
                    cod=InterfazGrafica.elegirOpcionInt("Ingrese el el codigo el producto"
                                                                + "\n\n sino saber revisa la lista mediante el MENU PRINCIPAL");
                    operacion =InterfazGrafica.elegirOpcionInt(InterfazGrafica.MENU_OPERACIONES);
                    switch(operacion){
                        case 1 :
                            operador=InterfazGrafica.elegirNumero(InterfazGrafica.MENU_NUMERO);
                            
                            CalculadoraMercado.suma(compra.get(cod), operador);
                            break;
                        case 2 :
                            operador=InterfazGrafica.elegirNumero(InterfazGrafica.MENU_NUMERO);
                            CalculadoraMercado.resta(compra.get(cod), operador);
                            break;
                        case 3 :
                            operador=InterfazGrafica.elegirNumero(InterfazGrafica.MENU_NUMERO);
                            CalculadoraMercado.multiplicacion(compra.get(cod), operador);
                            break;
                        case 4 :
                            operador=InterfazGrafica.elegirNumero(InterfazGrafica.MENU_NUMERO);
                            CalculadoraMercado.division(compra.get(cod), operador);
                            break;
                        default:
                            InterfazGrafica.mostrar("Opcion Incorrecta");
                            break;
                    }
                    break;
                case 3:
                    Iterator lista = compra.keySet().iterator();
                    String listaCompleta="";
                    while(lista.hasNext()){
                        Integer key = (Integer)lista.next();
                        listaCompleta= listaCompleta + "\nCodigo:"+ key + " "+compra.get(key).toString();
                    }
                    InterfazGrafica.mostrar(listaCompleta);
                    break;  
                case 4:
                    
                    cod=InterfazGrafica.elegirOpcionInt("Ingrese el el codigo el producto en la compra"
                                                                + "\n\n sino saber revisa la lista mediante el MENU PRINCIPAL");
                    InterfazGrafica.mostrar(compra.remove(cod).toString());
                default:
                            InterfazGrafica.mostrar("Opcion Incorrecta");
                            break;
            }  
            
            String salir = InterfazGrafica.elegirOpcionString(InterfazGrafica.MENU_SALIR);
            if(salir.equalsIgnoreCase("exit"))
                break;
            codigo++;
        }

    }
}
