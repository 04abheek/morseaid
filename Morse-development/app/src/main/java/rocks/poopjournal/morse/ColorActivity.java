package rocks.poopjournal.morse;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class ColorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_activity);
        setColorChangeListener(R.id.fire, "#FF0000");
        setColorChangeListener(R.id.me, "#0000FF");
        setColorChangeListener(R.id.bt, "#008000");
        setColorChangeListener(R.id.ica, "#FFC0CB");
        setColorChangeListener(R.id.hmse, "#ff8c00");
        setColorChangeListener(R.id.disaster, "#FFFF00");
        setAggressionOrViolenceListener();
    }
    private void setAggressionOrViolenceListener() {
        TextView textView = findViewById(R.id.av);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(ColorActivity.this, ColorDisplayActivity.class);
            intent.putExtra("color", "#FFFFFF");
            startActivity(intent);
        });}
    private void setColorChangeListener(int textViewId, final String colorHex) {
        TextView textView = findViewById(textViewId);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(ColorActivity.this, ColorDisplayActivity.class);
            intent.putExtra("color", colorHex);
            startActivity(intent);
        });}}
