package ru.melandra.popularlibrary.View;

import moxy.MvpView;
import moxy.viewstate.strategy.SingleStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = SingleStateStrategy.class)
    void setResultText ( String str );

    @StateStrategyType(value = SingleStateStrategy.class)
    void setUserText ( String str );
}
