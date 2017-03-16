package es.cice.poo_iterator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.cice.poo_iterator.Modelo.FlotaFurgonetas;
import es.cice.poo_iterator.Modelo.FlotaMotos;
import es.cice.poo_iterator.Modelo.Furgoneta;
import es.cice.poo_iterator.Modelo.Moto;
import es.cice.poo_iterator.Modelo.Vehiculo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Moto> listaMotos = new ArrayList<Moto>();
        listaMotos.add(new Moto("MatriculaMoto1"));
        listaMotos.add(new Moto("MatriculaMoto2"));
        listaMotos.add(new Moto("MatriculaMoto3"));
        FlotaMotos flotaMotos = new FlotaMotos(listaMotos);


        Furgoneta[] misFurgonetas = new Furgoneta[2];
        misFurgonetas[0] = new Furgoneta("MatriculaFurgoneta0");
        misFurgonetas[1] = new Furgoneta("MatriculaFurgoneta1");
        FlotaFurgonetas flotaFurgonetas = new FlotaFurgonetas(misFurgonetas);

        bucle(flotaMotos.iterator());
        bucle(flotaFurgonetas.iterator());

    }


    private void bucle(Iterator<Vehiculo> iterator){
        while (iterator.hasNext()){
            Log.d("POO_ITERATOR", iterator.next().getMatricula());
        }
    }
}
