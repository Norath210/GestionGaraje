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
public enum TPago {
    EFECTIVO("Efectivo"),
    TARJETA("Tarjeta"),
    CUENTA ("Cuenta");
    private final String s;
        private TPago(String s){
            this.s = s;
        }
        public String toString() {
            return s;
        }  
    
}
