package teamvoy.com.gifcreator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class UrlActivity extends AppCompatActivity {
    String URL2="http://vk.com/videos36699641?section=all&z=video36699641_167851638%2Falbum36699641%2Fpl_36699641";
    String Url="https://ia700401.us.archive.org/19/items/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        Intent intent =new Intent();
        intent.setData(Uri.parse(URL2));
        setResult(RESULT_OK,intent);
        finish();
    }

}
