package ng.com.newsdaily.base;

/**
 * Created by niangang on 2016/11/17.
 */

interface BaseView<T> {

    void setPresenter(T presenter);

    boolean isActive(); // ?????

    void showProgress();

    void hideProgress();

    void showErrorToast(String msg);

}
