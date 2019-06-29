// Generated by Dagger (https://google.github.io/dagger).
package ir.beigirad.semanticdagger.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.beigirad.semanticdagger.model.CoffeeMaker;
import ir.beigirad.semanticdagger.model.Heater;
import ir.beigirad.semanticdagger.model.Pump;
import javax.inject.Provider;

public final class AppModule_ProvideCoffeeMakerFactory implements Factory<CoffeeMaker> {
  private final Provider<Heater> heaterProvider;

  private final Provider<Pump> pumpProvider;

  public AppModule_ProvideCoffeeMakerFactory(
      Provider<Heater> heaterProvider, Provider<Pump> pumpProvider) {
    this.heaterProvider = heaterProvider;
    this.pumpProvider = pumpProvider;
  }

  @Override
  public CoffeeMaker get() {
    return provideCoffeeMaker(heaterProvider.get(), pumpProvider.get());
  }

  public static AppModule_ProvideCoffeeMakerFactory create(
      Provider<Heater> heaterProvider, Provider<Pump> pumpProvider) {
    return new AppModule_ProvideCoffeeMakerFactory(heaterProvider, pumpProvider);
  }

  public static CoffeeMaker provideCoffeeMaker(Heater heater, Pump pump) {
    return Preconditions.checkNotNull(
        AppModule.provideCoffeeMaker(heater, pump),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}