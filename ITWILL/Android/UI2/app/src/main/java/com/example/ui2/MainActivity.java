package com.example.ui2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

//자바 코드로 뷰를 생성 하는 방법 실습
//실습 내용 : 2개의 버튼을 만들고  버튼에 표시되는 텍스트를 설정 하는 자바코드
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //리니어 레이아웃 객체 생성(위젯들을? 수직, 수평 배치)
        LinearLayout container = new LinearLayout(this);
        //리니어 레이아웃 내부에 위젯들을 수직 배치 하게끔 설정
        container.setOrientation(LinearLayout.VERTICAL);

        //버튼 객체 생성
        Button b1 = new Button(this);
        //버튼의 텍스트 설정
        b1.setText("첫번째 버튼");
        //버튼 객체를 리니어 레이아웃 내부에 추가 하여 배치
        container.addView(b1);

        //버튼 객체 생성
        Button b2 = new Button(this);
        //버튼의 텍스트 설정
        b2.setText("두번째 버튼");
        //버튼 객체를 리니어 레이아웃 내부에 추가하여 배치
        container.addView(b2);

        //메소드를 호출하여 만들어진 뷰그룹(리니어레리아웃)를
        //MainActivity화면으로 설정 하여 나타냄
        setContentView(container);

        //결론:
        //자바코드로만 사용자 화면을 구성하면
        //자바코드와 디자인 코드가 분리 되어 있지 않아서
        //유지보수에 어려움을 겪는다.

    }
}



