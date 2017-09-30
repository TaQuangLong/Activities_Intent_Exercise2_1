package project.quanglong.activities_intent_exercise2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName     = (EditText) findViewById(R.id.etName);
        btnStudent = (Button) findViewById(R.id.btnStudentActivity);

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString();

                Intent intent = new Intent(MainActivity.this,
                        StudentActivity.class);
                intent.putExtra("fullname",name);
                startActivity(intent);

            }
        });

    }
}
