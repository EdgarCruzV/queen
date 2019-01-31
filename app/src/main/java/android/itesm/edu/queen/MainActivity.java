package android.itesm.edu.queen;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button random;
    private TextView randomText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = (Button) findViewById(R.id.random);
        randomText = (TextView) findViewById(R.id.randomText);
    }
    private void goSong(String file){
        Intent intent = new Intent(this, SongAct.class);
        intent.putExtra("song", file);
        startActivity(intent);
    }


    public void sing(View view){
        String file = "";
        switch(view.getId()){
            case R.id.another:
                file = "another";
                goSong(file);
                break;
            case R.id.under:
                file = "under";
                goSong(file);
                break;
            case R.id.we:
                file = "we";
                goSong(file);
                break;
            case R.id.bohemian:
                file = "bohemian";
                goSong(file);
                break;
            case R.id.dont:
                file = "dont";
                goSong(file);
                break;
            case R.id.random:
                Intent intent = new Intent(this, RandomAct.class);
                startActivityForResult(intent, 500);
                break;
            case R.id.site:
                Uri page = Uri.parse("http://www.queenonline.com/");
                Intent web = new Intent(Intent.ACTION_VIEW, page);
                startActivity(web);
                break;


        }
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 500 && resultCode == RESULT_OK) {
            switch (data.getStringExtra("random")){
                case "1":
                    randomText.setText("Bohemian Rhapsody");
                    break;
                case "2":
                    randomText.setText("We Will Rock You");
                    break;
                case "3":
                    randomText.setText("Don't Stop Me Now");
                    break;
                case "4":
                    randomText.setText("Another One Bites the Dust");
                    break;
                case "5":
                    randomText.setText("Under Pressure");
                    break;

            }

        }
    }
}
