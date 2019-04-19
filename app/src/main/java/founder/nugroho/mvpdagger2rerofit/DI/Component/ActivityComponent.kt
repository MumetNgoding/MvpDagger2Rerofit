package founder.nugroho.mvpdagger2rerofit.DI.Component

import dagger.Component
import founder.nugroho.mvpdagger2rerofit.DI.Module.ActivityModule
import founder.nugroho.mvpdagger2rerofit.UI.Main.MainActivity

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}