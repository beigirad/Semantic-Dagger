package ir.beigirad.semanticdagger.model;

import android.util.Log;

public class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.on();
        pump.pump();
        Log.i("Log", "[_]P coffee! [_]P ");
        heater.off();
    }
}