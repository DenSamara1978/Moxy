package ru.melandra.popularlibrary.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.melandra.popularlibrary.Presenter.MainPresenter;
import ru.melandra.popularlibrary.R;

public class MainActivity extends AppCompatActivity implements MainView {

    private TextView resultTextView;
    private EditText editText;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        resultTextView = findViewById(R.id.resultTextView);
        Button appendButton = findViewById(R.id.appendButton);
        editText = findViewById(R.id.editText);

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