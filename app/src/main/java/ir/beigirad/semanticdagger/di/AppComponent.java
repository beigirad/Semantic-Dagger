package ir.beigirad.semanticdagger.di;

import android.content.Context;

import dagger.BindsInstance;
import dagger.Component;
import ir.beigirad.semanticdagger.MainActivity;

/**
 * Created by Farhad Beigirad on 2019-06-29.
 */
@Component(modules = {AppModule.class})
public abstract class AppComponent {

    @Component.Builder
    public interface AppComponentBuilder {
        @BindsInstance
        public AppComponentBuilder builderContext(Context context);

        public AppComponent buildAppComponent();
    }

    abstract public void inject(MainActivity mainActivity);

}
