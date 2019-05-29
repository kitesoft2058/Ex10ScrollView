package com.kitesoft.ex10scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onclick속성이 지정된 버튼을 클릭하였을 때 자동으로 실행되도록 지정된 콜백메소드
    public void clickBtn(View view) {
        //스크롤 뷰 참조하기
        ScrollView sv= findViewById(R.id.sv);

        //스크롤뷰의 스크롤위치를 가장 아래쪽으로 이동
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }

}
