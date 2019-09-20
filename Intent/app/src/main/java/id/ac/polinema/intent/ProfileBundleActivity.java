package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            //String username = input_username.getText().toString();
            //String name = input_name.getText().toString();
            //String age = input_age.getText().toString();

            usernameText.setText(extras.getString("username"));
            nameText.setText(extras.getString("name"));
            ageText.setText(String.valueOf(extras.getInt(BundleActivity.AGE_KEY)));

            //usernameText.setText(getIntent().getStringExtra());
        }
    }
}
