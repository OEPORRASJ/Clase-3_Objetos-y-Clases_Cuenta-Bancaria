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
    public void retirar() {
        System.out.println("Cuánto desea retirar?");
        Scanner lector = new Scanner(System.in);
        double monto = lector.nextDouble();
        lector.close();

        this.saldo = saldo - monto;
        System.out.println("Su nuevo saldo es: " + saldo);

    }

    public void consignar() {
        System.out.println("Cuánto desea consignar");
        Scanner lector = new Scanner(System.in);
        double monto = lector.nextDouble();
        lector.close();
 
        this.saldo = saldo + monto;
        System.out.println("Su nuevo saldo es: " + saldo);

    }

    public void cambiarClave() {
        System.out.println("Escriba su nueva clave:");
        Scanner lector = new Scanner(System.in);
        int nuevaClave = lector.nextInt();
        lector.close();
                
        this.clave = nuevaClave;
        System.out.println("Clave cambiada con éxito");

    }

    public void consultarSaldo() {
        System.out.println("Su saldo es: " + saldo);

    }
    
    public void retornoMenu(){
        System.out.println("Desea volver al Menu Principal? \n 1.Sí. \n 2.No. ");
        Scanner lector = new Scanner(System.in);
        int opciones = lector.nextInt();
        lector.close();
        if (opciones == 1){
            MenuPrincipal();    
        }
        if (opciones == 2){
      
        } else{
            System.out.println("Opción incorrecta");
            retornoMenu();
        }
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
                    retirar();
                    retornoMenu();
                }
                
                if (opcion == 2){
                    consignar(); 
                    retornoMenu();
                }
                
                if (opcion == 3){                    
                    cambiarClave();
                    retornoMenu();
                }
                
                if (opcion == 4){
                    consultarSaldo();
                    retornoMenu();
                }

            } else {
                System.out.println("Contraseña Incorrecta");
            }

        } else {
            System.out.println("Yaper, tu cuenta no existe :v");
        }
    }

}
   