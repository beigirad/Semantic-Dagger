package ir.beigirad.semanticdagger.model;

import android.content.Context;
import android.util.Log;

public class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;
    private final Context context;

    public CoffeeMaker(Heater heater, Pump pump, Context context) {
        this.heater = heater;
        this.pump = pump;
        this.context = context;
    }

    public void brew() {
        heater.on();
        pump.pump();
        Log.i("Log", "brew in " + context.getClass().getSimpleName());
        Log.i("Log", "[_]P coffee! [_]P ");
        heater.off();
    }
}