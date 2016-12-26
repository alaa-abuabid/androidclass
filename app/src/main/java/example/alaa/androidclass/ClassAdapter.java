package example.alaa.androidclass;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Alaa ab on 12/21/2016.
 */

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.Holder> {


    private List<OneClass> one_class;
    private LayoutInflater inflater;
    private Context c ;
    class Holder extends RecyclerView.ViewHolder {

        private TextView number;
        private TextView subject;

        public Holder(View itemView) {
            super(itemView);
            number = (TextView)itemView.findViewById(R.id.class_number);
            subject = (TextView)itemView.findViewById(R.id.class_subject);
        }

    }

    public ClassAdapter(List<OneClass> one_class, Context c){
        this.one_class=one_class;
        this.c=c;
    }


    @Override
    public ClassAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.from(parent.getContext()).inflate(R.layout.classlayout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(ClassAdapter.Holder holder, final int position) {
        OneClass lesson = one_class.get(position);
        holder.number.setText(String.valueOf(lesson.getNumber()));
        holder.subject.setText(lesson.getSubject());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(c.getApplicationContext(), String.valueOf(one_class.get(position).getNumber()), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return one_class.size();
    }
}
