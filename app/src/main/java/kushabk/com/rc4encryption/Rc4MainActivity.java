package kushabk.com.rc4encryption;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rc4MainActivity extends AppCompatActivity {

    EditText mMessage;
    EditText mshowmesage;
    TextView inkey,outkey;
    Button mEncrypt;
    Button mDecrypt;
    EditText mEncryptKey;
    EditText mDecryptkey;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc4_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mMessage = (EditText) findViewById(R.id.editText);
        mEncryptKey = (EditText) findViewById(R.id.editText2);
        inkey = (TextView)findViewById(R.id.textView);


        mEncrypt = (Button)findViewById(R.id.button);
        mDecrypt = (Button)findViewById(R.id.button2);


        mshowmesage  =(EditText) findViewById(R.id.editText4);
        outkey = (TextView) findViewById(R.id.textView2);
        mDecryptkey = (EditText)findViewById(R.id.editText3);




        mEncrypt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform Encryption here
            }
        });




        mDecrypt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform Decryption here
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rc4_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
