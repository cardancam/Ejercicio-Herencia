
package com.uniajc.herencia;

public class EjercicioHerencia {

    public static void main(String[] args) {
        //crear objeto de la clase cuenta
        Cuenta cuenta1 = new Cuenta(10000, 0);
        cuenta1.imprimir();
        
        System.out.println(" ");
        
        cuenta1.consignar(2501);
        cuenta1.imprimir();
        
        cuenta1.retirar(1501);
        System.out.println("");
        cuenta1.imprimir();
        
        cuenta1.retirar(15000);
    }
    
}
