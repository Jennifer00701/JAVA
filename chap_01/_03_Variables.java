package chap_01;
// 변수 


public class _03_Variables {
    public static void main(String[] args) {
        
        String name;
        name = "코딩";
        
        int time; // 정수형 변수
        time = 20;

        int time1;
        time1 = 1;

        String name1 = "12시 회수 예정";

        System.out.println(name+"배송이 시작되었습니다."+time1+"시간 후에 도착예정");
        System.out.println(time + " 시에 배송이 완료되었습니다.."+name1);

        double score = 90.5; // 실수형 변수
        char grade = 'A'; // 문자형 변수 // 한글자만표현시 캐릭터도 쓸 수 있다! 작은 따옴표로사용
        name = "소힁"; //위 name 변수 그대로 쓰겠지만 소힁이라는 변수로 새로 넣겠다 아래부터 출력
            // 값 업데이트 
        System.out.println(name+"학점은"+grade+"이고"+","+"평균은"+score+"이다"+name1);
        
        boolean pass = true;
        System.out.println("이번 시험 합격 ?" + pass);


        double d = 3.15123456789;
        //float d = 3.15;
        // 실수 값은 기본적으로 double 자료형으로 인식함
        
        float f = 3.15123456789F; 
        //float은 6자리 까지만 표시됨 그 이하는 정밀하게 표현 불가능 / double은 가능하다!
         //float d = 3.15; => float은 실수나 정밀한 데이터 넣을 수 없어서 에러발생 <더블 자료형으로 인식함>
        // 실수를 float 자료형으로 만드려면 실수값 뒤에 f, F 적으면됨 F그릇에 넣겠다.
        System.out.println(f);
        System.out.println(d);
    
        //int i = 10000000000; // 정수값을 계산하기에 너무 큰 값이라 오류 뜸 
        // 자동으로 인트형태 되는데 인트 값 벗어나는 것 (21억)
        long l = 1000000000000L; //long -> int 보다 큰 범위를 가질 수 있다./ 뒤에 l 입력
        l = 1_000_000_000_000L; // 구분하기 힘들 때 언더바 사용 (출력은 똑같음)
        System.out.println(l);
    }
    
}



/* 요약

작은 범위를 계산 시 너무 큰 자료형으로 쓰면 공간을 너무 낭비됨 
반대로 큰 범위를 계산 시 작은 자료형으로 사용하면 감당할 수 없어서 문제가 됨
커피숍에 가서 큰 사이즈 컵, 작은 사이즈 컵 같은 개념 



 * int(정수) -21억, +21억 숫자까지만 인식
 * long(정수) int값 벗어나면 long으로 사용 ( long l = 숫자L : 뒤에 L 값 필수 )

 * float(실수) 소수점 6자리 까지 표현 가능 
 * double(실수) float 값 벗어나면 double으로 사용 ( double d = 숫자D  : 뒤에 D 값 필수 )

 * char(문자열) 한 글자 표현 가능 / 작은 따옴표 사용 ' '
 * String(문자열) 여러글자 표현 가능 / 큰 따옴표 사용 " "
 
 * boolean(스위치) true, false 표현

 */
