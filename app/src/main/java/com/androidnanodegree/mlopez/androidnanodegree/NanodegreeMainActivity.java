package com.androidnanodegree.mlopez.androidnanodegree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class NanodegreeMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nanodegree_main);

        findViewById(R.id.main_spotify_button).setOnClickListener(this);
        findViewById(R.id.main_scores_button).setOnClickListener(this);
        findViewById(R.id.main_library_button).setOnClickListener(this);
        findViewById(R.id.main_build_it_button).setOnClickListener(this);
        findViewById(R.id.main_xyz_reader_button).setOnClickListener(this);
        findViewById(R.id.main_capstone_button).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nanodegree_main, menu);
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
        int id = v.getId();
        switch (id) {
            case R.id.main_spotify_button:
            case R.id.main_scores_button:
            case R.id.main_library_button:
            case R.id.main_build_it_button:
            case R.id.main_capstone_button:
            case R.id.main_xyz_reader_button:

                String appTitle = (String) v.getTag();
                String toastText = getString(R.string.toast_message).replace(getString(R.string.app_title_tag_replacement), appTitle);
                Toast.makeText(NanodegreeMainActivity.this, toastText,Toast.LENGTH_LONG).show();

                break;

        }
    }
}
