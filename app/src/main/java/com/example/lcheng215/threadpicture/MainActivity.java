package com.example.lcheng215.threadpicture;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
//import com.example.lcheng215.threadpicture.HttpUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView imageView;
    Button button;
    Button button2;
    Button button3;
    String theURL;
    Handler handler = new Handler(){
        public void handleMessage(Message msg){
            Log.v("kkk", msg.toString());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                theURL = "http://c.hiphotos.baidu.com/album/w%3D2048/sign=aa13cdbb023b5bb5bed727fe02ebd539/7dd98d1001e93901a318412e7aec54e736d1968c.jpg";
                break;
            case R.id.button2:
                theURL = "http://allstack.net/wordpress/wp-content/uploads/2015/09/logo_linear.png";
                break;
            case R.id.button3:
                theURL = "http://allstack.net/wordpress/wp-content/uploads/2015/09/cat.jpeg";
                break;
            default:
                theURL = "http://allstack.net/wordpress/wp-content/uploads/2015/09/logo_linear.png";
        }
        Thread background = new Thread(new Runnable() {
            //HttpUtils.getImageViewInputStream();
            @Override
            public void run() {
                try{

                }catch (Throwable e){

                }
            }
        });
    }
}
