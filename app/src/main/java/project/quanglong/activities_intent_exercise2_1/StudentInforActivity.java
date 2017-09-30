package project.quanglong.activities_intent_exercise2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {
    TextView tvHometown, tvBirthday,tvSex, tvNameLop,tvCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);

        AnhXa();
        setDataByBundle();

    }


    private void AnhXa()
    {
        tvBirthday = (TextView) findViewById(R.id.tvBirthday);
        tvCourse   = (TextView) findViewById(R.id.tvCourse);
        tvHometown = (TextView) findViewById(R.id.tvHometown);
        tvNameLop  = (TextView) findViewById(R.id.tvNameClass);
        tvSex      = (TextView) findViewById(R.id.tvSex);
    }

    public void setDataByBundle(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(StudentActivity.BUNDLE);
        String hometown = bundle.getString(StudentActivity.HOMETOWN);
        String birthday = bundle.getString(StudentActivity.BIRTHDAY);
        String sex = bundle.getString(StudentActivity.SEX);
        String nameLop = bundle.getString(StudentActivity.NAMECLASS);
        String  course= bundle.getString(StudentActivity.COURSE);


        tvHometown.setText(hometown);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);
        tvNameLop.setText(nameLop);
        tvCourse.setText(course);
    }
}
