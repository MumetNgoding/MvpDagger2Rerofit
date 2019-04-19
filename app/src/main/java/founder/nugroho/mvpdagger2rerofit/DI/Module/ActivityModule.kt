package founder.nugroho.mvpdagger2rerofit.DI.Module

import android.app.Activity
import dagger.Module
import dagger.Provides
import founder.nugroho.mvpdagger2rerofit.UI.Main.MainContract
import founder.nugroho.mvpdagger2rerofit.UI.Main.MainPresenter

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}