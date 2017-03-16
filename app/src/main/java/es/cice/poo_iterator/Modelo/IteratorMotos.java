package es.cice.poo_iterator.Modelo;

import java.util.Iterator;
import java.util.List;

/**
 * Created by cice on 16/3/17.
 */

public class IteratorMotos implements Iterator<Vehiculo> {
    int pos = 0;
    List<Moto> misMotos;

    public IteratorMotos(List<Moto> misMotos) {
        this.misMotos = misMotos;
    }

    @Override
    public boolean hasNext() {
        return pos +1 <= misMotos.size();
    }

    @Override
    public Vehiculo next() {
        Vehiculo vehiculo = misMotos.get(pos);
        pos++;
        return vehiculo;
    }
}
