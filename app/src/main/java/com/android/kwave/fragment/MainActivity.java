package com.android.kwave.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListFragment list;
    DetailFragment detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 프래그먼트 만들기
        createFragments();
        // 목록 프로그먼트 화면에 세팅
        addList();


    }

    private void createFragments(){
       list = new ListFragment();
        list.setActivity(this);
        detail = new DetailFragment();
        detail.setActivity(this);
    }

    // 프래그먼트 화면에 넣기
    public void addList(){
        /**
         * 프래그먼트 화면에 넣기
         */

        // 1. 프래그먼트 트랜잭션 시작하기
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // 2. 화면에 프래그먼트 넣기
        transaction.add(R.id.Container,list);   // Transaction을 사용하는 이유는 트랜잭션이 Stack을  사용하기 때문이다.
        // 3. 트랜잭션 완료
        transaction.commit();
    }
    public void addDetail(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.Container,detail);   // Transaction을 사용하는 이유는 트랜잭션이 Stack을  사용하기 때문이다.
        // 트랜잭션 처리 전체를 Stack에 담아놨다가, 안드로이드의 back 버튼으로 뒤로가기르 할 수 있다.
        transaction.addToBackStack(null);   //. 스택을 사용하겠다고 알림
        transaction.commit();
    }

    public void backToList() {
        super.onBackPressed();      // 뒤로가기 효과
    }
}
