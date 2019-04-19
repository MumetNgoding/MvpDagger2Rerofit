package founder.nugroho.mvpdagger2rerofit.UI.Main

import founder.nugroho.mvpdagger2rerofit.UI.Base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}