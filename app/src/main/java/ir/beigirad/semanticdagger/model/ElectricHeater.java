package ir.beigirad.semanticdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class ElectricHeater implements Heater {
  boolean heating;

  @Inject
  public ElectricHeater() {
  }

  @Override public void on() {
    Log.i("Log", "~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}