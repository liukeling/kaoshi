package exam.liukeling.zzptc.com.exam_liukeling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Yindao extends AppCompatActivity {

    ImageView title;
    TextView banquan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yindao);
        title = (ImageView) findViewById(R.id.title);
        banquan = (TextView) findViewById(R.id.banquan);
        title.setVisibility(View.GONE);
        banquan.setVisibility(View.GONE);
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        title.setVisibility(View.VISIBLE);
                        banquan.setVisibility(View.VISIBLE);
                        new Thread(){
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        startActivity(new Intent(Yindao.this, Main.class));
                                        Yindao.this.finish();
                                    }
                                });
                            }
                        }.start();
                    }
                });
            }
        }.start();
    }
}
