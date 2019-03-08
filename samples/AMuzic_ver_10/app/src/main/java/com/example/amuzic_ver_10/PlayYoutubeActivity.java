package com.example.amuzic_ver_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class PlayYoutubeActivity extends YouTubeBaseActivity {

    public static final String YT_API_KEY = "AIzaSyB93pNxvt2Hl3pV0NmX5U1O0M2w-URkY-U";
    EditText search;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        search=findViewById(R.id.search);
        go=findViewById(R.id.go);
        View view = this.getWindow().getDecorView();

        view.setBackgroundColor(0xaaaaaaaa);
        setContentView(R.layout.activity_play_youtube);

        YouTubePlayerView youTubePlayerView =
                (YouTubePlayerView) findViewById(R.id.player);

        youTubePlayerView.initialize(YT_API_KEY,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {

                        // do any work here to cue video, play video, etc.
                        youTubePlayer.cueVideo("WNeLUngb-Xg");
                        // or to play immediately
                        // youTubePlayer.loadVideo("5xVh-7ywKpE");
                    }
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(PlayYoutubeActivity.this, "Youtube Failed!", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}