package cn.cbg.androidframe;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import cn.cbg.androidframe.di.component.DaggerActivityComponent;
import cn.cbg.androidframe.di.moudle.ActivityModule;

public class MainActivity extends AppCompatActivity {
    @Inject
    FragmentManager fragmentManager;
    @Inject
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).build().inject(this);
//        DaggerActivityComponent.builder().applicationComponent().activityModule()

        new Button(this).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
