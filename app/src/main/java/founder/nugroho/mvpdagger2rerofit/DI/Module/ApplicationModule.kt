package founder.nugroho.mvpdagger2rerofit.DI.Module

import android.app.Application
import dagger.Module
import dagger.Provides
import founder.nugroho.mvpdagger2rerofit.BaseApp
import founder.nugroho.mvpdagger2rerofit.DI.Scope.PerApplication
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}