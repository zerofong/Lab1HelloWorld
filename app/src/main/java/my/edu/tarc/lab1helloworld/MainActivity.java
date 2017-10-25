package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or module level variable
    private EditText editTextName,editTextAge;
    private TextView textViewMessage;


    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView method displays the UI at activity_main in layout folder
        //R = resource class
        setContentView(R.layout.activity_main);

        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    //a method to handle View click event
    public void displayMessage(View view){
        String name = editTextName.getText().toString();
        Integer age = Integer.parseInt(editTextAge.getText().toString());
        age ++;
        textViewMessage.setText("Hi "+name + ". You will be " + age + " years old in 2018.");
    }

    //a method to handle Reset click event
    public void resetMessage(View view){
        editTextAge.setText("");
        editTextName.setText("");
        textViewMessage.setText("");
    }
}
