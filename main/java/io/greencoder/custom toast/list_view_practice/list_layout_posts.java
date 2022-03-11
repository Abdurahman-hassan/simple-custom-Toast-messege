package io.greencoder.practice1.list_view_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.greencoder.practice1.R;

public class list_layout_posts extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layout_posts);

        //Toast customization

        View v = getLayoutInflater().inflate(R.layout.custom_toast, null, false);
        // OR
        // View v = LayoutInflater.from(this).inflate(R.layout.custom_toast,null,false);
        
        TextView textView2 = v.findViewById(R.id.textView_toast);
        ImageView imageView = v.findViewById(R.id.imageView_toast);
        textView2.setText(R.string.toastString);
        imageView.setImageResource(R.drawable.login);
        Toast t = new Toast(this);
        t.setView(v);
        t.setDuration(Toast.LENGTH_SHORT);
        t.show();


    }
}

