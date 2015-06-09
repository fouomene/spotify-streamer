/**
 *
 Author: Daniel Fouomene
 EmailAuthor: fouomenedaniel@gmail.com

 */

package com.fouomene.spotifystreamer;

import  android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.fouomene.spotifystreamer.fragment.TopTracksFragment;

public class TopTracksActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_tracks);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(R.layout.action_bar_title_top_tracks);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new TopTracksFragment())
                    .commit();
        }
    }

}
