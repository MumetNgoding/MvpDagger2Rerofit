package founder.nugroho.mvpdagger2rerofit.DI.Component

import dagger.Component
import founder.nugroho.mvpdagger2rerofit.BaseApp
import founder.nugroho.mvpdagger2rerofit.DI.Module.ApplicationModule

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)
}