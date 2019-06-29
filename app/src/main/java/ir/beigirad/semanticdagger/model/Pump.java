package ir.beigirad.semanticdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Pump {
    @Inject
    public Pump() {
    }

    public void pump() {
        Log.i("Log", "=> => pumping => =>");
    }
}