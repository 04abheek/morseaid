package rocks.poopjournal.morse;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
public class SirenActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private boolean isSoundOn = false;
    private ImageButton soundButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siren_activity);
        View fullScreenView = findViewById(R.id.fullScreenView);
        soundButton = findViewById(R.id.soundButton);
        mediaPlayer = MediaPlayer.create(this, R.raw.ambulance_siren);
        mediaPlayer.setLooping(true);
        ValueAnimator colorAnim = ValueAnimator.ofObject(new ArgbEvaluator(),
                Color.RED, Color.BLUE);
        colorAnim.setDuration(100);
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.addUpdateListener(animator -> {
            int color = (int) animator.getAnimatedValue();
            fullScreenView.setBackgroundColor(color);
        });
        colorAnim.start();
        soundButton.setOnClickListener(v -> toggleSound());
    }
    private void toggleSound() {
        if (isSoundOn) {
            mediaPlayer.pause();
            soundButton.setImageResource(R.drawable.ic_speaker_off);
        } else {
            mediaPlayer.start();
            soundButton.setImageResource(R.drawable.ic_speaker_on);
        }
        isSoundOn = !isSoundOn;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }}}
