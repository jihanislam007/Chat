package md.mazharul.islam.jihan.chat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView SenderMessage , ReceiverMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SenderMessage = (TextView) findViewById(R.id.SenderMessageTextView);
        ReceiverMessage = (TextView) findViewById(R.id.receiverMessageTextView);

        EditText yourEditText= (EditText) findViewById(R.id.WriteMessageEditText);
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(yourEditText, InputMethodManager.SHOW_IMPLICIT);


    }
}
