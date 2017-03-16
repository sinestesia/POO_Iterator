package es.cice.poo_iterator.Modelo;

import java.util.Iterator;
import java.util.List;

/**
 * Created by cice on 16/3/17.
 */

public class FlotaFurgonetas implements Iterable<Vehiculo> {
    Furgoneta[] misFurgonetas;

    public FlotaFurgonetas(Furgoneta[] misFurgonetas) {
        this.misFurgonetas = misFurgonetas;
    }

    @Override
    public Iterator<Vehiculo> iterator() {
        return new IteratorFurgonetas(misFurgonetas);
    }
}
