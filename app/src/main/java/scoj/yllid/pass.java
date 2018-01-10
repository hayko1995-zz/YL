package scoj.yllid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class pass extends AppCompatActivity {

    String pass;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        text = (EditText) findViewById(R.id.editText);
        Button enter = (Button)findViewById(R.id.button);



    }


    public void push(View view) {
        int pass = parseInt(text.getText().toString());
        if(pass == 1596){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}
