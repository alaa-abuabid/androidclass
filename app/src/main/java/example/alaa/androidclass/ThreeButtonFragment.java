package example.alaa.androidclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeButtonFragment extends Fragment {


    Button Add, Remove, Replace;
    TextView text ;
    final AddRemoveOrReplaceFragment adder= new AddRemoveOrReplaceFragment();
    final AddRemoveOrReplaceFragment replacer= new AddRemoveOrReplaceFragment();
    public ThreeButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view=  inflater.inflate(R.layout.fragment_three_button, container, false);

        Add= (Button) view.findViewById(R.id.Add_Fragment);
        Remove= (Button) view.findViewById(R.id.Remove_Fragment);
        Replace= (Button) view.findViewById(R.id.Replace_Fragment);

        text = (TextView) view.findViewById(R.id.text1);
        Bundle bundle = getArguments();
        String number = String.valueOf(bundle.getInt("number"));
        text.setText("class number:"+number);

        final FragmentManager manager = getFragmentManager();
        final FragmentTransaction ft = manager.beginTransaction();


        Add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // add new fragment
                ft.add(R.id.content,adder );
                ft.commit();
            }
        });

        Remove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Remove current fragment
                Fragment currentfragment = manager.findFragmentByTag("threebuttonfragmentid");
                ft.remove(currentfragment).commit();

            }
        });

        Replace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // replace with a new fragment

                ft.replace(R.id.content,replacer);
                ft.commit();
            }
        });

        return view;
    }
}
