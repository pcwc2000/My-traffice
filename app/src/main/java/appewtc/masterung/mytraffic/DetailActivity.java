package appewtc.masterung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, dataTextView;
    private ImageView picImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widgget
        bindWidget();

    }   //main method

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        dataTextView = (TextView) findViewById(R.id.textView5);
        picImageView = (ImageView) findViewById(R.id.imageView2);

    }

}   //main class
