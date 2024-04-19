package chap_03;
// 특수문자, 이스케이프 문자 
// Escape Sequence, Escape Character, Special Character
// \n \t \\ \" \'

public class _04_EscapeSequence {
    public static void main(String[] args) {
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌다.");

        // 줄바꿈  \n
        System.out.println("자바가\n너무\n재밌다."); 

        // 출력되는 길이 동일하게 만들기 (탭기능)  \t
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        // 탭 2번 입력 
        System.out.println("당근\t\t1000원");
        System.out.println("햄버거\t\t7000원");

        // \" 큰따옴표
        // 단비가 "야옹"이라고 했다.
        // System.out.println("단비가 "야옹" 이라고 했다."); 안에 "" 불가능
        System.out.println("단비가 \"야옹\" 이라고 했다."); 
        System.out.println("단비가 '뭘봐' 라고 하네");


        

    }
}
