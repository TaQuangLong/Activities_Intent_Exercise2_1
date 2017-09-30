package project.quanglong.activities_intent_exercise2_1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class StudentActivity extends AppCompatActivity {

    TextView tvName;
    Button btnStudentInfo;
    EditText etHometown, etBirthday, etSex, etNameClass, etCourse;

    public static final String HOMETOWN="HOMETOWN";
    public static final String BIRTHDAY="BIRTHDAY";
    public static final String SEX="SEX";
    public static final String NAMECLASS="NAMECLASS";
    public static final String COURSE="COURSE";
    public static final String BUNDLE="BUNDLE";


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        AnhXa();

        String name = getIntent().getStringExtra("fullname");
        tvName.setText(name + " welcome to StudentActivity");



        btnStudentInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String hometown = etHometown.getText().toString().trim() ;
                 String birthday = etBirthday.getText().toString().trim();
                 String sex      = etSex.getText().toString().trim();
                 String nameLop  = etNameClass.getText().toString().trim();
                 String course   = etCourse.getText().toString().trim();
                byBundle(hometown,birthday,sex,nameLop,course);

            }
        });
    }
    private void AnhXa()
    {
        etHometown = (EditText) findViewById(R.id.etHometown);
        etBirthday = (EditText) findViewById(R.id.etBirthday);
        etSex      = (EditText) findViewById(R.id.etSex);
        etNameClass= (EditText) findViewById(R.id.etNameClass);
        etCourse   = (EditText) findViewById(R.id.etCourse);
        btnStudentInfo = (Button) findViewById(R.id.btnStudentInforActivity);
        tvName     = (TextView) findViewById(R.id.tvName);
    }

    public void byBundle(String hometown, String birthday, String sex, String nameLop, String course){
        Intent intent = new Intent(StudentActivity.this, StudentInforActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(HOMETOWN,hometown);
        bundle.putString(BIRTHDAY,birthday);
        bundle.putString(SEX,sex);
        bundle.putString(NAMECLASS,nameLop);
        bundle.putString(COURSE,course);

        intent.putExtra(BUNDLE,bundle);
        startActivity(intent);
    }
}
