package chap_02;
// 논리 연산자

// || or 연산자랑 동일
// && and 연산자랑 동일 


// boolean 은 true 또는 false. 값만 가질 수 있다. 
public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개||계란말이||제육볶음); // 하나라도 true 이면 true
        System.out.println(김치찌개&&계란말이&&제육볶음); //모두 true 이면 true 
        
        System.out.println((5>3)&&(3>1)); // 2개 모두 true 면 true 
        System.out.println((5>3)&&(3<1)); 

        System.out.println((1>=1)||(1>5)); // 1개라도 true 면 true
        System.out.println((5<3)||(3<1));
        System.out.println(5==5 && 2==2);

        // 반대로 출력 
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(5==5)&&(1==1)); 
        // 5==5, 1==1 true / !반대로 출력 -> false 출력됨 
        

    }
}
