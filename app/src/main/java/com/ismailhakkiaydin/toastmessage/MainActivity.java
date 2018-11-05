package com.ismailhakkiaydin.toastmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void CustomToast(String title, String message){

        Toast toast = new Toast(this);

        LayoutInflater li = this.getLayoutInflater();
        View view = li.inflate(R.layout.toast_design,null);

        FrameLayout pnl = (FrameLayout) view;

        LinearLayout pnlInner = (LinearLayout) view.findViewById(R.id.framepnl).findViewById(R.id.linear);

        TextView txtTitle = (TextView) pnlInner.findViewById(R.id.textView);
        txtTitle.setText(title);

        TextView txtMessage = (TextView) pnlInner.findViewById(R.id.textView2);
        txtMessage.setText(message);

        toast.setGravity(Gravity.CENTER, 0, -20);
        toast.setView(pnl);
        toast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast("Android Programing", "Toast Message is Succesfull");
    }
}
