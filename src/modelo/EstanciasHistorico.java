/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Castelao
 */
public class EstanciasHistorico extends AbstractTableModel {

    private final List<Estancia> lstEstancias = new ArrayList<>();
    private final String[] columnas = {"Matricula", "Tipo", "Entrada", "Salida", "Duración", "Tarifa", "FPago", "Total"};

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }

    @Override
    public int getRowCount() {
        return lstEstancias.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Estancia e = lstEstancias.get(row);
        
        Long duracion = e.getEntrada().getTime() - e.getSalida().getTime();

        switch (col) {
            case 0:
                return e.getVehiculo().getMatricula();
            case 1:
                return e.getVehiculo().getTipo().toString();
            case 2:
                return e.getEntrada();
            case 3:
                return e.getSalida();
            case 4:
                return TimeUnit.MINUTES.convert(duracion, TimeUnit.MILLISECONDS);
            case 5:
                return e.getTarifa();
            case 6:
                return e.getfPago().toString();
            case 7:
                return duracion * e.getTarifa();
            default:
                return null;
        }
    }

    public Estancia getRow(int i) {
        return lstEstancias.get(i);
    }

    public void removeRow(int i) {
        lstEstancias.remove(i);
        fireTableDataChanged();
    }

    public void addEstancia(Estancia e) {
        lstEstancias.add(e);
        fireTableDataChanged();
    }
}
