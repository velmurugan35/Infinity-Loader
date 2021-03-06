package velmurugan.com.infinityloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import velmurugan.com.infinity_loader.InfinityLoaderView;

public class MainActivity extends AppCompatActivity {

    private InfinityLoaderView infinityLoaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infinityLoaderView = findViewById(R.id.infinityloader);
        infinityLoaderView.setAnimDuration(1000);
        infinityLoaderView.setLoaderColor(getResources().getColor(R.color.colorAccent));
        infinityLoaderView.setStrokeWidth(20);

    }
}
