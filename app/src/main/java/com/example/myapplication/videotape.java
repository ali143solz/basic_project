package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;

public class videotape extends RecyclerView.Adapter<VideoHolder>{

    private Context context;
    ArrayList<File> videoArrayList;

    public videotape(Context context, ArrayList<File> videoArrayList) {
        this.context = context;
        this.videoArrayList = videoArrayList;
    }

    @Override
    public VideoHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View mview= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_videoapp,parent,false);

        return new VideoHolder(mview);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoHolder holder, int position) {
      holder.txtfile.setText(videoapp.fileArrayList.get(position).getName());
        Bitmap bitmapThumbnail= ThumbnailUtils.createVideoThumbnail(videoArrayList.get(position).getPath(), MediaStore.Images.Thumbnails.MINI_KIND);
        holder.imagetmnl.setImageBitmap(bitmapThumbnail);
       holder.mcard.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(context,videoplayer.class);
               intent.putExtra("position",holder.getAdapterPosition());
               intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
           }
       });
    }

    @Override
    public int getItemCount() {
        if (videoArrayList.size()>0){
            return videoArrayList.size();
        }
        else {
            return 1;
        }
    }
}

class VideoHolder extends  RecyclerView.ViewHolder{
    TextView txtfile;
    ImageView imagetmnl;
    CardView mcard;

 VideoHolder(View view)
 {
     super(view);
     txtfile=view.findViewById(R.id.txt_videofile);
     imagetmnl=view.findViewById(R.id.iv_thmnail);
     mcard=view.findViewById(R.id.mycardview);
 }
}