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
        Intent i = getIntent();
        int num = i.getExtras().getInt("number");
        Bundle bundle = new Bundle();
        bundle.putInt("number", num);
        FragmentManager manger = getSupportFragmentManager();
        FragmentTransaction ft = manger.beginTransaction();
        if(num==8)
        {
            AsyncTaskAndPicassoFragment asyncTaskAndPicassoFragment =new AsyncTaskAndPicassoFragment();
            ft.add(R.id.content, asyncTaskAndPicassoFragment);
            asyncTaskAndPicassoFragment.setArguments(bundle);
            ft.commit();
        }
        else
        {
            ThreeButtonFragment threebuttonfragment = new ThreeButtonFragment();
            ft.add(R.id.content, threebuttonfragment,"threebuttonfragmentid" );
            threebuttonfragment.setArguments(bundle);
            ft.commit();
        }
    }
}
