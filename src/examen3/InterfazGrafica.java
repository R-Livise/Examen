/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-CAQP-C0206
 */
public class InterfazGrafica {
    
    public static final String MENU_PRODUCTOS = "PRODUCTOS-- \n"
                                                + "1-Papas\n"
                                                + "2-Atun\n"
                                                + "3-Pan";
    public static final String MENU_OPERACIONES = "OPERACIONES-- \n"
                                                + "1-SUMAR PRODUCTOS\n"
                                                + "2-RESTAR PRODUCTOS\n"
                                                + "3-MULTIPLICAR PRODUCTOS\n"
                                                + "4-DIVIDIR PRODUCTOS";
    public static final String MENU_OPCIONES = "MENU-- \n"
                                                + "1-INGRESAR PRODUCTO\n"
                                                + "2-EDIAR PRODUCTO\n"
                                                + "3-MOSTRAR PRODUCTO\n"
                                                + "4-MODIFICAR CATIDAD DEL PRODUCTO";
    
    public static final String MENU_SALIR = "Para salir pon EXIT";
    
    public static final String MENU_NUMERO = "Elige un numero con el cual operar";
    
    public static void mostrar(String menu){
        
        JOptionPane.showMessageDialog(null, menu);
    }
    
    public static String elegirOpcionString(String menu){
        
        return JOptionPane.showInputDialog(menu);
    }
    
    public static int elegirOpcionInt(String menu){
        
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
    
    public static Number elegirNumero(String menu){
        
        int salidaInt;
        
        Double numero = new Double(JOptionPane.showInputDialog(menu));
        
        if(numero % 1 == 0){
            salidaInt = numero.intValue();
            return salidaInt;
        }else{
            
            return numero;
        }
               
    }
}
