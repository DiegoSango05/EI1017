package es.uji.practica1;

import java.util.List;

public class Table {
    private List<Double> headers;
    private List<Row> ejemplares;

    public Table(List<Row> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Row getRowAt(int rowNumber) {
        if (rowNumber < 0 || rowNumber >= ejemplares.size()) {
            throw new IndexOutOfBoundsException("Índice invalido");
        }
        return ejemplares.get(rowNumber);
    }

    public List<Double> getColumAt(int colNumber) {
        if (colNumber < 0 || colNumber >= ejemplares.size()) {
            throw new IndexOutOfBoundsException("Índice invalido");
        }
    }
}
