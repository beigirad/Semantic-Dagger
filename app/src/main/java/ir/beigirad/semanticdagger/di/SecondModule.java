package ir.beigirad.semanticdagger.di;

import dagger.Binds;
import dagger.Module;
import ir.beigirad.semanticdagger.model.ElectricHeater;
import ir.beigirad.semanticdagger.model.Heater;

/**
 * Created by Farhad Beigirad on 2019-07-05.
 */
@Module
public interface SecondModule {
    @Binds
    Heater bindsHeater(ElectricHeater electricHeater);
}
