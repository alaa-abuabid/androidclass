package example.alaa.androidclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    TextView text ;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_blank, container, false);

        text = (TextView) view.findViewById(R.id.text1);
        Bundle bundle = getArguments();
        String number = String.valueOf(bundle.getInt("number"));
        text.setText("class number:"+number);
        return view;
    }
}
