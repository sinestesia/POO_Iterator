package es.cice.poo_iterator.Modelo;

import java.util.Iterator;
import java.util.List;

/**
 * Created by cice on 16/3/17.
 */

public class FlotaMotos implements Iterable<Vehiculo> {
    List<Moto> misMotos;

    public FlotaMotos(List<Moto> misMotos) {
        this.misMotos = misMotos;
    }

    @Override
    public Iterator<Vehiculo> iterator() {
        return new IteratorMotos(misMotos);
    }
}
