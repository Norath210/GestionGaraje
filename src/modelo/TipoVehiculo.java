/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Castelao
 */
public enum TipoVehiculo {
    COCHE("Coche"),
    FURGONETA("Furgoneta"),
    CAMION ("Camión");
    private final String s;
        private TipoVehiculo(String s){
            this.s = s;
        }
        public String toString() {
            return s;
        }  
        
}
