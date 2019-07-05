package ir.beigirad.semanticdagger.di;

import dagger.Component;
import ir.beigirad.semanticdagger.MainActivity;

/**
 * Created by Farhad Beigirad on 2019-06-29.
 */
@Component(modules = {AppModule.class})
public abstract class AppComponent {

    abstract public void inject(MainActivity mainActivity);

}
