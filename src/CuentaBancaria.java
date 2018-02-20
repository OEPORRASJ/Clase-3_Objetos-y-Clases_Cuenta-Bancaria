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

public class CuentaBancaria {

    //Atributos
    public int numeroCuenta;
    public int clave;
    public String dueño;
    public double saldo;

    public CuentaBancaria(int numeroCuenta, int clave, String dueño, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.dueño = dueño;
        this.saldo = saldo;
    }

    //Métodos
    public void retirar(int monto) {

        this.saldo = saldo - monto;
        System.out.println("Su nuevo saldo es: " + saldo);

    }

    public void consignar(int monto) {
 
        this.saldo = saldo + monto;
        System.out.println("Su nuevo saldo es: " + saldo);

    }

    public void cambiarClave(int nuevaClave) {
       
        this.clave = nuevaClave;
        System.out.println("Clave cambiada con éxito");

    }

    public void consultarSaldo() {
        System.out.println("Su saldo es: " + saldo);

    }

    public void MenuPrincipal() {
        System.out.println("Ingrese su numero de cuenta: ");
        Scanner lector = new Scanner(System.in);
        int confirmacion = lector.nextInt();
        
        if (confirmacion == numeroCuenta) {
            System.out.println("Ingrese su clave: ");
            int confirmacion2 = lector.nextInt();
            

            if (confirmacion2 == clave) {
                System.out.println("Seleccione una opción: \n 1.Retirar \n 2.Consignar \n 3.Cambiar Clave \n 4.Consultar Saldo");
                
                int opcion = lector.nextInt();
                

                if (opcion == 1) {
                    System.out.println("¿Cuánto dinero deseas retirar?");
                   
                    int cash = lector.nextInt();
                    retirar(cash);
                }
                
                if (opcion == 2){
                    System.out.println("¿Cuánto dinero deseas consignar?");
                    
                    int cash = lector.nextInt();
                    consignar(cash);    
                }
                
                if (opcion == 3){
                    System.out.println("Digite su nueva clave: ");
                    
                    int nuevaClave = lector.nextInt();
                    cambiarClave(nuevaClave);
                }
                
                if (opcion == 4){
                    System.out.println("Su saldo es: " + saldo);
                }

            } else {
                System.out.println("Contraseña Incorrecta");
            }

        } else {
            System.out.println("Yaper, tu cuenta no existe :v");
        }
    }

}
   