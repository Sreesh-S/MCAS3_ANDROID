package com.example.hello;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText unameEditText;
    private EditText passEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        unameEditText=findViewById(R.id.uname1);
        passEditText=findViewById(R.id.pass1);
    }
    public  void Login(View view) {
        String username = unameEditText.getText().toString();
        String password = passEditText.getText().toString();
        if (isValidCredentials(username, password)) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isValidCredentials(String username,String password)
    {
        return username.equals("Admin")&& password.equals("1234");
    }
}
