package steinpetter.com.appkveld_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mStart;
    private EditText mTekst;
    private String tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStart = (Button)findViewById(R.id.btnStart);
        mTekst = (EditText)findViewById(R.id.txtTekstEdit);

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst = mTekst.getText().toString();
                nyIntent();
            }
        });
    }

    private void nyIntent(){
        Intent intent = new Intent(this, Act2.class);
        intent.putExtra("tekst",tekst);
        startActivity(intent);

    }

    @Override
    protected void onResume(){
        super.onResume();
        mTekst.setText("");
    }
}
