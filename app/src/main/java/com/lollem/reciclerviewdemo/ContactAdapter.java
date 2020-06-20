package com.lollem.reciclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private Context context;
    private LayoutInflater inflater; //Conterrà il layout dell'item

    private String[] cose = {"Montagna 1","Montagna 2", "Montagna 3", "Montagna 4", "Montagna 5"};

    private int[] photo = {
            R.drawable.montagna1,
            R.drawable.montagna2,
            R.drawable.montagna3,
            R.drawable.montagna4,
            R.drawable.montagna5
    };

    public ContactAdapter(Context appContext){
        this.context = appContext;
        this.inflater = (LayoutInflater.from(appContext));
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_contact, parent, false);
        ContactViewHolder vh = new ContactViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, final int position) {
        holder.name_contact.setText(cose[position]);
        holder.profile_image.setImageResource(photo[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,cose[position],Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cose.length;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        TextView name_contact;
        ImageView profile_image;
        public ContactViewHolder(View itemView) {
            super(itemView);
            this.name_contact = itemView.findViewById(R.id.name_contact);
            this.profile_image = itemView.findViewById(R.id.image_contact);
        }
    }
}
