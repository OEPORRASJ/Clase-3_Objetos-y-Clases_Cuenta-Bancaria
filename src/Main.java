/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OSKAR
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CuentaBancaria Cuenta1 = new CuentaBancaria(1012,1234, "MAGDALENA SANCHEZ" , 0);
        CuentaBancaria Cuenta2 = new CuentaBancaria(1013,9876, "JOSELITO PEREZ" , 500000);
        
        
        Cuenta1.MenuPrincipal();
    }
    
    
    
}
