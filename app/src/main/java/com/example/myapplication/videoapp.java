package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class videoapp extends AppCompatActivity {
   RecyclerView myrecyclerview;
   videotape obj_adapter;
   public static int REQUEST_PERMISSION =1;
   File directory;
   boolean bolean_permission;
   public static ArrayList<File> fileArrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoapp);
        myrecyclerview=(RecyclerView) findViewById(R.id.listvideorec);

        //Phone Memory and SD Card
        directory=new File("/mnt/");

        //Phone Memory and SD Card
//        directory=new File("/storage/");

        GridLayoutManager manager=new GridLayoutManager(videoapp.this,2);
        myrecyclerview.setLayoutManager(manager);

        permissionForVideo();

    }

    private void permissionForVideo() {

        if((ContextCompat.checkSelfPermission(getApplicationContext(),
                Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)){

            if((ActivityCompat.shouldShowRequestPermissionRationale(videoapp.this,
                    Manifest.permission.READ_EXTERNAL_STORAGE))){
            }
            else {
                ActivityCompat.requestPermissions(videoapp.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                      REQUEST_PERMISSION  );

            }
        }else {
               bolean_permission=true;
               getFile(directory);
               obj_adapter=new videotape(getApplicationContext(),fileArrayList);
               myrecyclerview.setAdapter(obj_adapter);

        }
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode==REQUEST_PERMISSION){
            if(grantResults.length>0 && grantResults[0] ==PackageManager.PERMISSION_GRANTED){

                bolean_permission=true;
                getFile(directory);
                obj_adapter=new videotape(getApplicationContext(),fileArrayList);
                myrecyclerview.setAdapter(obj_adapter);
            }
            else{
                Toast.makeText(this,"Please Allow Permission",Toast.LENGTH_SHORT).show();
            }

        }
    }


     public ArrayList<File> getFile(File directory){

        File listFile[]=directory.listFiles();

        if (listFile!=null && listFile.length>0)
        {
            for (int i=0; i<listFile.length; i++)
            {
                if (listFile[i].isDirectory()){
                    getFile(listFile[i]);
                }
                else {
                    bolean_permission=false;
                    if(listFile[i].getName().endsWith(".mp4")){
                        for(int j=0; j<fileArrayList.size(); j++)
                        {
                            if(fileArrayList.get(j).getName().equals(listFile[i].getName())){
                                bolean_permission=true;

                            }
                            else{

                            }
                        }
                        if (bolean_permission){
                            bolean_permission=false;
                        }
                        else {
                            fileArrayList.add(listFile[i]);
                        }
                    }
                }
            }
        }
    return fileArrayList;
    }

}