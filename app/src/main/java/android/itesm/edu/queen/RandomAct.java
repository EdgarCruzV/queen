package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomAct extends AppCompatActivity {
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        value = ((int)(Math.ceil(Math.random()* 5))) + "";
        ((TextView)findViewById(R.id.textView)).setText(value);
        switch (value){
            case "1":
                ((TextView)findViewById(R.id.textView2)).setText("Bohemian Rhapsody");
                break;
            case "2":
                ((TextView)findViewById(R.id.textView2)).setText("We Will Rock You");
                break;
            case "3":
                ((TextView)findViewById(R.id.textView2)).setText("Don't Stop Me Now");
                break;
            case "4":
                ((TextView)findViewById(R.id.textView2)).setText("Another One Bites the Dust");
                break;
            case "5":
                ((TextView)findViewById(R.id.textView2)).setText("Under Pressure");
                break;

        }
    }
    public void done(View view){
        Intent intent = new Intent();
        intent.putExtra("random", value);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}

