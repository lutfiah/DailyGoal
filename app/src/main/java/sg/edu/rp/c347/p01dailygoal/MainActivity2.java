package sg.edu.rp.c347.p01dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv5 = findViewById(R.id.textView5);
        TextView tv6 = findViewById(R.id.textView6);
        TextView tv7 = findViewById(R.id.textView7);
        TextView tv8 = findViewById(R.id.textView8);
        // Display the name and age on the TextView
        tv5.setText(info[0]);
        tv6.setText(info[1]);
        tv7.setText(info[2]);
        tv8.setText(info[3]);

        Button btnClose = findViewById(R.id.button2);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
