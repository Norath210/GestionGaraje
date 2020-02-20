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
public class Vehiculo {
    private String matricula;
    private TipoVehiculo tipo;

    public Vehiculo(String matricula, TipoVehiculo tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return " "+matricula+" "+tipo.toString();
    }
    
}
