package exam.liukeling.zzptc.com.exam_liukeling;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences spf = getPreferences(MODE_PRIVATE);
        boolean isFrist = spf.getBoolean("isFrist", true);
        if(isFrist) {
            SharedPreferences.Editor editor = spf.edit();
            editor.putBoolean("isFrist", false).commit();
            startActivity(new Intent(this, Wellcom.class));
        }else{
            startActivity(new Intent(this, Yindao.class));
        }
        finish();
    }
}
