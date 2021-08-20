package com.example.ui3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

/*
  .xml의 코드와 .java의 자바코드를 동시에 사용 하여 사용자 인터페이스를 구현 하는 방법

  방법 : 레이아웃은처음에 .xml의 코드로 정의 하고....
         앱 실행 시간에 레이아웃에 포함된 뷰를 자바코드로 참조하여
         그속성을 변경 하는 방법.

*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id가 button1인 버튼객체를 찾는다
        //R클래스 내부의 id클래스 내부의 button1상수값을 이용하여
        //activity_main.xml에 작성된 <Button>위젯에 대한 new Button("첫번쨰 버튼")객체를 반환 받는다.
        Button b1  = (Button) findViewById(R.id.button1);

        //버튼객체의 setText()메소드를 이용하여 버튼의 텍스트를 변경 할수 있다.
        b1.setText("자바코드로 변경 가능");

        //R.id.button2을 이용하여 두번째 버튼을 찾아서 저장
        Button b2 = (Button) findViewById(R.id.button2);

        //두번째 버튼객체의 setEnabled()메소드를 이용하여 버튼을 비활성화 버튼으로 만들자
        b2.setEnabled(false);



    }
}









