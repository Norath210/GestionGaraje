/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Castelao
 */
public class Estancia {

    Vehiculo vehiculo;
    Date entrada;
    Date salida;
    TPago fPago = TPago.TARJETA;
    long tarifa;

    public Estancia(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        long ahora = System.currentTimeMillis();
        this.entrada = new Date(ahora);
        switch (vehiculo.getTipo()) {
            case COCHE:
                tarifa = (long) 0.01;
                break;
            case FURGONETA:
                tarifa = (long) 0.02;
                break;
            case CAMION:
                tarifa = (long) 0.10;
                break;
        }

    }
    @Override
    public String toString(){
        return vehiculo.toString()+" "+entrada+" "+salida+" "+fPago+" "+tarifa;
    }

    public void Salir(TPago fPago) {
        if (salida == null) {
            this.fPago = fPago;
            long ahora = System.currentTimeMillis();
            salida = new Date(ahora);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public Date getSalida() {
        return salida;
    }

    public TPago getfPago() {
        return fPago;
    }

    public long getTarifa() {
        return tarifa;
    }

}
