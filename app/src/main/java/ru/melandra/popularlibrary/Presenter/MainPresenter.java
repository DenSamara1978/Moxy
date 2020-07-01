package ru.melandra.popularlibrary.Presenter;

import ru.melandra.popularlibrary.Model.Model;
import ru.melandra.popularlibrary.View.MainView;

public class MainPresenter {

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        model = new Model();
    }

    public void appendText(String str) {
        String newString = model.getString() + str;
        model.setString(newString);
        mainView.setResultText(newString);
        mainView.setUserText("");
    }
}
