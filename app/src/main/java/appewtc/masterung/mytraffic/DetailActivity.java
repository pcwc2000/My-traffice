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
        setContentView(R.layout.detail_info);

        //Bind Widgget
        bindWidget();

        //Show view
        showView();

    }   //main method

    private void showView() {

        //Show title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //show Image
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        picImageView.setImageResource(intIcon);

        //show detail
        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        int intIndex = getIntent().getIntExtra("Index", 0);
        dataTextView.setText(strDetail[intIndex]);





    }   //showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        dataTextView = (TextView) findViewById(R.id.textView5);
        picImageView = (ImageView) findViewById(R.id.imageView2);

    }

}   //main class
