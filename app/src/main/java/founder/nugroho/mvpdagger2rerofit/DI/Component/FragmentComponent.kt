package founder.nugroho.mvpdagger2rerofit.DI.Component

import android.support.v4.app.ListFragment
import dagger.Component
import founder.nugroho.mvpdagger2rerofit.DI.Module.FragmentModule
import founder.nugroho.mvpdagger2rerofit.UI.About.AboutFragment

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}