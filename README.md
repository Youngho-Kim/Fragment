# Fragment


[전체코드보기](https://github.com/Youngho-Kim/Fragment/tree/master/app/src/main/java/com/android/kwave/fragment)

### 프래그먼트를 화면에 넣기
```java
        // 1. 프래그먼트 트랜잭션 시작하기
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // 2. 화면에 프래그먼트 넣기
        transaction.add(R.id.Container,list);   // Transaction을 사용하는 이유는 트랜잭션이 Stack을  사용하기 때문이다.
        // 3. 트랜잭션 완료
        transaction.commit();
```


### 프래그먼트에서 세팅
```java
        // 프래그먼의 메인 레이아웃을 inflate하고
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        // 안에 위젯들을 코드에 연결한다.
        Button btnGoDetail = (Button)view.findViewById(R.id.btnGoDetail);
```
        
        
        