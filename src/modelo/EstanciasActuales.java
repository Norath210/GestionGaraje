/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Castelao
 */
public class EstanciasActuales extends AbstractTableModel {

    private final List<Estancia> lstEstancias = new ArrayList<>();
    private final String[] columnas = {"Matricula", "Tipo", "Entrada"};

    public EstanciasActuales() {

        Vehiculo v1 = new Vehiculo("0000ABC", TipoVehiculo.COCHE);
        Vehiculo v2 = new Vehiculo("0000CDE", TipoVehiculo.FURGONETA);
        Vehiculo v3 = new Vehiculo("0000FGH", TipoVehiculo.CAMION);
        Vehiculo v4 = new Vehiculo("0000IJK", TipoVehiculo.COCHE);

        Estancia e1 = new Estancia(v1);
        Estancia e2 = new Estancia(v2);
        Estancia e3 = new Estancia(v3);
        Estancia e4 = new Estancia(v4);

        lstEstancias.add(e1);
        lstEstancias.add(e2);
        lstEstancias.add(e3);
        lstEstancias.add(e4);

    }

    @Override
    public int getRowCount() {
        return lstEstancias.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Estancia e = lstEstancias.get(row);
        switch (column) {
            case 0:
                return e.getVehiculo().getMatricula();
            case 1:
                return e.getVehiculo().getTipo().toString();
            case 2:
                return e.getEntrada();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }

    public void addVehiculo(Vehiculo c) {
        lstEstancias.add(new Estancia(c));
        fireTableDataChanged();
    }

    public int getCoches() {
        int i = 0;
        for (Estancia e : lstEstancias) {
            if (e.getVehiculo().getTipo() == TipoVehiculo.COCHE) {
                i++;
            }
        }
        return i;
    }

    public int getFurgonetas() {
        int i = 0;
        for (Estancia e : lstEstancias) {
            if (e.getVehiculo().getTipo() == TipoVehiculo.FURGONETA) {
                i++;
            }
        }
        return i;
    }

    public int getCamion() {
        int i = 0;
        for (Estancia e : lstEstancias) {
            if (e.getVehiculo().getTipo() == TipoVehiculo.CAMION) {
                i++;
            }
        }
        return i;
    }
    public Estancia getRow(int i){
        return lstEstancias.get(i);
    }
    public void removeRow(int i){
        lstEstancias.remove(i);
        fireTableDataChanged();
    }
    
}
