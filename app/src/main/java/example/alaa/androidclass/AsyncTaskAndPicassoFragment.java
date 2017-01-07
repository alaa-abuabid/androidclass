package example.alaa.androidclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class AsyncTaskAndPicassoFragment extends Fragment {
private ImageView AsyncTaskImageView, PicassoImageView ;
    private Button AsyncTaskButton, PicassoImageButton;
    TextView text;
    private String downloadUrl = "https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278_960_720.jpg";


    public AsyncTaskAndPicassoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_async_picasso, container, false);

        text = (TextView) view.findViewById(R.id.text1);
        Bundle bundle = getArguments();
        String number = String.valueOf(bundle.getInt("number"));
        text.setText("class number:"+ number);

        AsyncTaskImageView = (ImageView) view.findViewById(R.id.AsyncTaskImage);
        AsyncTaskButton= (Button) view.findViewById(R.id.AsyncTaskButton);
        PicassoImageView = (ImageView) view.findViewById(R.id.PicassoImage);
        PicassoImageButton= (Button) view.findViewById(R.id.PicassoButton);
        AsyncTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                ImageAsyncTask asyncTask = new ImageAsyncTask(AsyncTaskImageView);
                asyncTask.execute(downloadUrl);
            }
        });
        PicassoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Picasso.with(getContext()).load(downloadUrl).into(PicassoImageView);
            }
        });
        return view;
    }

}
