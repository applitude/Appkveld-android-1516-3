package steinpetter.com.appkveld_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    private TextView mActTekst;
    private String tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        Intent intent = getIntent();
        tekst = intent.getStringExtra("tekst");
        mActTekst = (TextView)findViewById(R.id.txtActTekst);
        if(tekst.equals(null) || tekst.equals("")){
            tekst = "hvorfor forandret du ikke teksten?";
        }
        mActTekst.setText(tekst);

    }
}
