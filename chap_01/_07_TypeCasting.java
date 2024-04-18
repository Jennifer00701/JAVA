package chap_01;
// 형변환 
// 정수 -> 실수 or 실수 -> 정수

public class _07_TypeCasting {
    public static void main(String[] args) {
        // int score = 90+10.9; 정수 + 실수라서 오류 발생

        // int to float, double
        int score = 90;
        System.out.println(score);
        System.out.println((float)score); // 정수 -> 실수 형변환
        System.out.println((double)score); // 정수 -> 실수 형변환
        
        // float to double to int
        float score_f = 92.1F;
        double score_d = 99.1D;
        System.out.println("(92.1F)를 실수에서 정수로 바꾼 값은 : " + (int)score_f);
        System.out.println("(99.1F)를 실수에서 정수로 바꾼 값은 : " + (int)score_d);


        // 정수 + 실수 연산 형변환을 하여 함께 계산하기
        score = 90 + (int)10.1; // 90+10 이 됨
        System.out.println(score);

        score_d = 90 + 98.1; // 오류 안뜸 ! 이유 : 정수 + 실수인데 실수형 안에 들어가면 자동으로 (double)90. ~  변환됨 
        // 90 + 98.1
        System.out.println(score_d); 


        // 변수에 형변환된 데이터 집어넣기 = int -> long -> float -> double 
        double convertedScoreDouble = score; // 191 -> 191.0 형변환

        
        int convertedScoreDoubleInt = (int)score_d; // 191.0 -> 191 형변환
        // 에러 큰 범위 -> 작은 범위로 넣으려고 하면 다 표현 못해서 일부 잘린다
        // 실수 -> 정수 = 소수점 이하 모두 버려지는 것 형변환(int정수) 넣어줘야 실수 -> 정수 형변환 됨
        // double -> float -> long -> int (수동 형변환) 반대로 
    
        
        // 숫자(정수)를 문자열로
        
        // 1. String 옵션 사용
        String s1 = String.valueOf(93);
        System.out.println(s1);
        
        // 2. toString 사용 = 정수를 문자열로 변환
        s1 = Integer.toString(93);
        System.out.println(s1);


        // 숫자(실수)를 문자열로

        // 1. String.valueOf(d)사용
        String s2 = String.valueOf(32.1);
        System.out.println(s2);

        // 2. toString(d)사용 = 실수를 문자열로 반환 
        s2 = Double.toString(32.1);
        System.out.println(s2);


        // 문자열을 숫자로

        // 1. integer.parseInt(s) 정수 -> 문자열
            // integer 은 정수 값을 포장해 객체로 만듬
        int i = Integer.parseInt("10");
        System.out.println(i);

        // 2. Double.parseInt(s) 실수 -> 문자열 
            // Double.parseInt 문자열을 Doubel 값으로 변환
        double d = Double.parseDouble("10.1");
        System.out.println(d);


        // int = error = Integer.parseInt("자바");
        // 각 메서드마다 ()안에 올바르른 값을 넣지 않으면 에러뜸
        
    }
}

