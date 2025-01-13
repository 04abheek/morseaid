package rocks.poopjournal.morse;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
public class ColorDisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_display);
        String colorHex = getIntent().getStringExtra("color");
        View rootView = findViewById(R.id.color_display_layout);
        if (colorHex != null) {
            rootView.setBackgroundColor(Color.parseColor(colorHex));
        }
        TextView textView = findViewById(R.id.text_view_id);
        int textColor = ContextCompat.getColor(this, R.color.text_color);
        textView.setTextColor(textColor);
    }}
