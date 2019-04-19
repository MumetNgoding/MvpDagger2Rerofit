package founder.nugroho.mvpdagger2rerofit.UI.List

import founder.nugroho.mvpdagger2rerofit.Models.DetailsViewModel
import founder.nugroho.mvpdagger2rerofit.Models.Post
import founder.nugroho.mvpdagger2rerofit.UI.Base.BaseContract

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}