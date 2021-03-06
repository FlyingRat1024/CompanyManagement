package com.company.management;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ChangeNickName extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_nick_name);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        editText = (EditText) findViewById(R.id.edit_nickname);
        editText.setText(bundle.getString("data"));
//        editText.addTextChangedListener(new UpdateUserInfo.MyTextWatcher("nickname",myApp));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        String pakageName = "com.company.management";
        String toActivity = ".myinformation";
        Intent intent = new Intent();
        intent.setClassName(pakageName,pakageName+toActivity);
        PackageManager pm = getPackageManager();
        if(intent.resolveActivity(pm) != null){
            startActivity(intent);
        }
    }
}
