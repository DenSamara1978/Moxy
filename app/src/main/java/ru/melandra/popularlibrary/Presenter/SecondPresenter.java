package ru.melandra.popularlibrary.Presenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.melandra.popularlibrary.Model.Model;
import ru.melandra.popularlibrary.View.SecondView;

@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {

    private Model model;

    public SecondPresenter() {
        model = new Model();
    }

    public void appendText(String str) {
        String newString = model.getString() + str;
        model.setString(newString);
        SecondView view = getViewState();
        view.setResultText(newString);
        view.setUserText("");
    }
}
