package example.alaa.androidclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ClassAdapter Adapter;
    private RecyclerView recyclerView;
    private ArrayList LessonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LessonList= (ArrayList) ClassList.getListData();
        recyclerView = (RecyclerView) findViewById(R.id.Les_list);
        Adapter = new ClassAdapter(LessonList,getApplicationContext());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(Adapter);

    }
}
