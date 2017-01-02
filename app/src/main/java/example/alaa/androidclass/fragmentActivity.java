package example.alaa.androidclass;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class fragmentActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager manger = getSupportFragmentManager();
        FragmentTransaction ft = manger.beginTransaction();
        BlankFragment framgentblank = new BlankFragment();
        ft.add(R.id.content,framgentblank);
        Intent i = getIntent();
        int num = i.getExtras().getInt("number");

        Bundle bundle = new Bundle();
        bundle.putInt("number", num);
        framgentblank.setArguments(bundle);
        ft.commit();
    }
}
