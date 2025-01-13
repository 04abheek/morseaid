package rocks.poopjournal.morse;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class NosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nos_activity);
        Button policeButton = findViewById(R.id.police);
        Button fireButton = findViewById(R.id.fire);
        Button ambulanceButton = findViewById(R.id.ambulance);
        Button disasterManagementButton = findViewById(R.id.disaster_management);
        Button nationalEmergencyButton = findViewById(R.id.national_emergency);
        Button womenHelplineButton = findViewById(R.id.women_helpline);
        Button covidHelplineButton = findViewById(R.id.covid_helpline);
        Button aidsHelplineButton = findViewById(R.id.aids_helpline);
        Button childrenHelplineButton = findViewById(R.id.children_helpline);
        Button touristHelplineButton = findViewById(R.id.tourist_helpline);
        Button lpgLeakButton = findViewById(R.id.lpg_leak);
        Button seniorCitizenButton = findViewById(R.id.senior_citizen_helpline);
        policeButton.setOnClickListener(v -> makeCall("100"));
        fireButton.setOnClickListener(v -> makeCall("101"));
        ambulanceButton.setOnClickListener(v -> makeCall("102"));
        disasterManagementButton.setOnClickListener(v -> makeCall("108"));
        nationalEmergencyButton.setOnClickListener(v -> makeCall("112"));
        womenHelplineButton.setOnClickListener(v -> makeCall("181"));
        covidHelplineButton.setOnClickListener(v -> makeCall("1075"));
        aidsHelplineButton.setOnClickListener(v -> makeCall("1097"));
        childrenHelplineButton.setOnClickListener(v -> makeCall("1098"));
        touristHelplineButton.setOnClickListener(v -> makeCall("1363"));
        lpgLeakButton.setOnClickListener(v -> makeCall("1906"));
        seniorCitizenButton.setOnClickListener(v -> makeCall("14567"));
    }
    private void makeCall(String number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);
    }
}
