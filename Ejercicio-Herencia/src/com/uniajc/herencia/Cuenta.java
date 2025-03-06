package com.uniajc.herencia;

public class Cuenta {

    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual; //Porcentaje
    protected float comisionMensual = 0;

    // creamos constructor
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    //Creamos metodo para imprimir los atributos
    public void imprimir() {
        System.out.println("Saldo:" + saldo);
        System.out.println("Numero de consignaciones: " + numConsignaciones);
        System.out.println("Numero de retiros: " + numRetiros);
        System.out.println("Tasa Anual: " + tasaAnual);
        System.out.println("Comision: " + comisionMensual);
    }
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
    }
    public void retirar(float cantidad) {
        float nuevoSaldoTemporal = saldo - cantidad;
        if (nuevoSaldoTemporal >= 0) {
            saldo = saldo - cantidad;
        }else{
            System.out.println("Saldo insuficiente, tu saldo actual es: " + saldo);
        }
    }
        
}
