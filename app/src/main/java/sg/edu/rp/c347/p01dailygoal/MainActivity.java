package sg.edu.rp.c347.p01dailygoal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tx = findViewById(R.id.textView);
                TextView tx2 = findViewById(R.id.textView2);
                TextView tx3 = findViewById(R.id.textView3);
                TextView tx4 = findViewById(R.id.textView4);

                RadioGroup rg = findViewById(R.id.radioGroup);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = findViewById(selectedButtonId);

                RadioGroup rg2 = findViewById(R.id.radioGroup2);
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(selectedButtonId2);

                RadioGroup rg3 = findViewById(R.id.radioGroup3);
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = findViewById(selectedButtonId3);

                EditText etRJ = findViewById(R.id.editText);
                String[] info = {
                        tx.getText().toString() + ": " + rb.getText().toString(),
                                tx2.getText().toString() + ": " + rb2.getText().toString(),
                                tx3.getText().toString() + ": " + rb3.getText().toString(),
                                tx4.getText().toString() + ": " + etRJ.getText().toString()};

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
        SharedPreferences prefs = this.getSharedPreferences(
                "com.example.app", Context.MODE_PRIVATE);
    }
}
