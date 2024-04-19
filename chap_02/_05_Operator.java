package chap_02;
// 삼항 연산자 (조건 연산자) 조건을 제공하고 그거에 맞는 답을 찾아라 
/*
x와 y 중에서 큰 값을 선택하여 max 변수에 할당
출력 값 = (조건식) ? (참일 때 값) : (거짓일 때 값)
여기서는 x가 y보다 큰지를 확인하여 참이면 x를 선택하고, 
그렇지 않으면 y를 선택합니다. 선택된 값은 max 변수에 저장됩니다. */

public class _05_Operator {
    public static void main(String[] args) {

        int x = 3; 
        int y = 5;
        int max = (x > y) ? x : y;  // 큰 값을 찾아라 
        System.out.println(max); 

        int min = (x < y) ? x : y;  // 작은 값을 찾아라 
        System.out.println(min);

        boolean n = ( x == y ) ? true : false; // 같은지 확인해라
        System.out.println(n);

 
        String s = (x != y) ? "달라" : "같아";
        System.out.println(s);


    }
}
