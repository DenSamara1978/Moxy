package ru.melandra.popularlibrary.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import moxy.MvpAppCompatActivity;

import moxy.presenter.InjectPresenter;
import ru.melandra.popularlibrary.Presenter.SecondPresenter;
import ru.melandra.popularlibrary.R;

public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    private TextView resultTextView;
    private EditText editText;

    @InjectPresenter
    SecondPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);

        resultTextView = findViewById(R.id.moxyResultTextView);
        Button appendButton = findViewById(R.id.moxyAppendButton);
        editText = findViewById(R.id.moxyEditText);

        appendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.appendText(editText.getText().toString());
            }
        });
    }

    @Override
    public void setResultText(String str) {
        resultTextView.setText(str);
    }

    @Override
    public void setUserText(String str) {
        editText.setText(str);
    }
}