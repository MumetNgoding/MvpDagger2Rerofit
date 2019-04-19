package founder.nugroho.mvpdagger2rerofit.DI.Module

import dagger.Module
import dagger.Provides
import founder.nugroho.mvpdagger2rerofit.API.ApiServiceInterface
import founder.nugroho.mvpdagger2rerofit.UI.About.AboutContract
import founder.nugroho.mvpdagger2rerofit.UI.About.AboutPresenter
import founder.nugroho.mvpdagger2rerofit.UI.List.ListContract
import founder.nugroho.mvpdagger2rerofit.UI.List.ListPresenter

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}