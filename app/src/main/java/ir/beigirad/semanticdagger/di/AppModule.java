package ir.beigirad.semanticdagger.di;


import dagger.Module;
import dagger.Provides;
import ir.beigirad.semanticdagger.model.CoffeeMaker;
import ir.beigirad.semanticdagger.model.Heater;
import ir.beigirad.semanticdagger.model.Pump;

/**
 * Created by Farhad Beigirad on 2019-06-29.
 */
@Module(includes = {SecondModule.class})
public class AppModule {

    @Provides
    public CoffeeMaker provideCoffeeMaker(Heater heater, Pump pump) {
        return new CoffeeMaker(heater, pump);
    }
}
