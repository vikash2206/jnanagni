package com.example.coverflow.Contact;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coverflow.R;


public class OneFragment extends Fragment{


    private RecyclerView ContactList;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one, container, false);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.pubg);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
        // ImageView circularImageView = view.findViewById(R.id.circleView);
       //  circularImageView.setImageBitmap(circularBitmap);


        ContactList = view.findViewById(R.id.ContactDetail);
        ContactList.setHasFixedSize(true);
        ContactList.setLayoutManager(new LinearLayoutManager(getContext()));
        ContactList.setAdapter(new ContactAdapter(getContext(), ContactCollection.getContact()));
        return view;
    }

}