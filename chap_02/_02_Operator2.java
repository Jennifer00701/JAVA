package chap_02;

// 대입 연산자

public class _02_Operator2 {  
    public static void main(String[] args) {
        int num = 10;

        num =  num + 2;
        System.out.println(num);

        num = num - 2;
        System.out.println(num);

        num = num * 2;
        System.out.println(num);

        num = num / 2;
        System.out.println(num);

        num = num % 2;
        System.out.println(num);

        // num 계속 업데이트 


        // 복합 대입 연산자 
        num = 10; // 10으로 초기화 

        // num = num + 2; 
        // += 똑같은 변수를 사용해 앞에서 한 동작 똑같이 작동하게 할 때 가능 한 연산 
        num += 2; // 위 문장이랑 똑같은 것 
        System.out.println(num);

        num -= 2;
        System.out.println(num);

        num *= 2;
        System.out.println(num);

        num /= 2;
        System.out.println(num);

        num %= 2;
        System.out.println(num);

        num = + 1+2;
        System.out.println(num);
    
 
    }
    
}
