package chap_02;

// 산술 연산자



public class _01_Operator1 {
    public static void main(String[] args) {
    // 일반 연산
        System.out.println(4+2); 
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(7%2);
        System.out.println(5/2); //소수점 버리고 정수만 출력

        // 우선 순위에 따른 연산

        System.out.println(2+2*2); // 사칙연산 순서 그대로 감 수학과 동일
        
        // 앞에 연산이 먼저 되도록 
        System.out.println((2+2)*2); // 괄호 안 연산 먼저

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);

        c = a-b;
        System.out.println(c);

        c = a*b;
        System.out.println(c);

        c = a/b;
        System.out.println(c);

        c = a%b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;

        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);
        // ++val; 'val'을 먼저 1증가시키고 그 증가된 값을 사용 
        // 


        val = 10; //다시 10으로 찍음 
        System.out.println(val); //10 
        System.out.println(val++); // 10
        System.out.println(val); // 11
        // val++ 'val'의 현재 값 사용 후 다음에 'val'을 1 증가

        // ++, -- 동일하게 작동

        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val); 
        
        
        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting+ "명 입니다.");
        
        
    }
}

