package edu.gcit.todo_4;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private static final String LOG_TAG= MainActivity2.class.getSimpleName();
    public static final String EXTRA_REPLY = "edu.gcit.todo_4";

    EditText mEditTextReply;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(LOG_TAG, "onCreate");
        Log.d(LOG_TAG,"--------------");
        Intent intent = getIntent();
        String message = intent.getStringExtra(edu.gcit.todo_4.MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    public void reply(View view) {
        Log.d(LOG_TAG,"Button click");
        mEditTextReply = findViewById(R.id.replyEditText);
        String reply = mEditTextReply.getText().toString();
        Intent replyIntent = new Intent(this, edu.gcit.todo_4.MainActivity.class);
        replyIntent.putExtra(EXTRA_REPLY,reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

}