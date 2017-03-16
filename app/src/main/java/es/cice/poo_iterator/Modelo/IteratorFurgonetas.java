package es.cice.poo_iterator.Modelo;

import java.util.Iterator;
import java.util.List;

/**
 * Created by cice on 16/3/17.
 */

public class IteratorFurgonetas implements Iterator<Vehiculo> {

    int pos = 0;
    Furgoneta[] misFurgonetas;

    public IteratorFurgonetas(Furgoneta[] misFurgonetas) {
        this.misFurgonetas = misFurgonetas;
    }

    @Override
    public boolean hasNext() {
        return pos +1 <= misFurgonetas.length
                && misFurgonetas[pos]!=null;
    }

    @Override
    public Vehiculo next() {
        Vehiculo vehiculo = misFurgonetas[pos];
        pos++;
        return vehiculo;
    }
}
