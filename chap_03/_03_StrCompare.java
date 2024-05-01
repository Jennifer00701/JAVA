package chap_03;
// 문자열 비교

// java 에서 문자열 내용을 비교할 때는 등호 == 사용 X, equals 사용 O

public class _03_StrCompare {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "python";

        // 문자열 내용이 같은지 ( frue or false)
        System.out.println(s1.equals(s2));

        // s1에 있는 데이터가 ()속 데이터와 같은가? (소문자 대문자 구분)
        System.out.println(s1.equals("java"));
        System.out.println(s2.equals("python"));

        // 소문자 대문자 구분 없이 문자열 내용이 같은지 여부
        System.out.println(s2.equalsIgnoreCase("Python"));

        // 문자열 비교 심화
        // 비밀번호 정보
        s1 = "1234";
        s2 = "1234";

        // s1, s2 같은지
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        // 일반 변수에 int 등호 사용 시 참조가 같은지 확인하기 때문에 가능

        // 문자열 다르게 선언
        s1 = new String("1234");
        s2 = new String("1234");

        // 각 다른 곳에 데이터가 존재하기 때문에 등호로는 확인 불가
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

    }

}
