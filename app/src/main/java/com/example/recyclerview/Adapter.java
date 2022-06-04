package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
   private List<ModelClass> obj;

   private Context context;
   public Adapter(Context context, List<ModelClass> list)
   {
       this.context = context;
       this.obj = list;
   }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
       int resource = obj.get(position).getImageView1();
       String name = obj.get(position).getText1();
       String time = obj.get(position).getText2();
       String number = obj.get(position).getText3();
       String line = obj.get(position).getLine();

       holder.setData(resource, name, time, number, line);
    }

    @Override
    public int getItemCount() {
        return obj.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView1;
        private TextView text1;
        private TextView text2;
        private TextView text3;
        private TextView line;
        public ViewHolder(@NonNull View itemView) {
        super(itemView);
         itemView.setOnClickListener(this);
        imageView1 = itemView.findViewById(R.id.image1);
        text1 = itemView.findViewById(R.id.text1);
        text2 = itemView.findViewById(R.id.text4);
        text3 = itemView.findViewById(R.id.text3);
        line = itemView.findViewById(R.id.line);
            imageView1.setOnClickListener(this);
        }

        public void setData(int resource, String name, String time, String number, String line) {
            imageView1.setImageResource(resource);
            text1.setText(name);
            text2.setText(time);
            text3.setText(number);
            this.line.setText(line);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Hello World!", Toast.LENGTH_SHORT).show();
        }
    }
}
