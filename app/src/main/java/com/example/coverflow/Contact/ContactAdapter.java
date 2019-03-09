package com.example.coverflow.Contact;


import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.coverflow.EventDetail1.ItemClickListner;
import com.example.coverflow.R;
import java.util.ArrayList;

class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{

    public ImageView ImgIcon;
    public TextView txtName;
    public   TextView txtGmail;
    public   TextView txtDevelop;
    private ItemClickListner itemClickListner;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        txtName = itemView.findViewById(R.id.textView1);
        txtGmail = itemView.findViewById(R.id.textView2);
        txtDevelop = itemView.findViewById(R.id.textView3);
        ImgIcon = itemView.findViewById(R.id.circleView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void setItemClickListner(ItemClickListner itemClickListner){
        this.itemClickListner=itemClickListner;
    }

    @Override
    public void onClick(View v) {
        itemClickListner.onClick(v,getAdapterPosition(),false);

    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListner.onClick(v,getAdapterPosition(),false);
        return true;
    }
}


public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<Contact> technicals;
    private Context c;

    public ContactAdapter( Context c,ArrayList<Contact> technicals) {
        this.technicals = technicals;
        this.c = c;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup Parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(Parent.getContext());
        View view = inflater.inflate(R.layout.contact_item_layout, Parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        final Contact s = technicals.get(position);
        holder.txtName.setText(s.getName());
        holder.txtGmail.setText(s.getGmail());
        holder.txtDevelop.setText(s.getDevelop());
        holder.ImgIcon.setImageResource(s.getImage());

        holder.setItemClickListner(new ItemClickListner() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {







            }
        });

    }

    @Override
    public int getItemCount() {
        return technicals.size();
    }
}