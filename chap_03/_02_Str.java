package chap_03;
 // 문자열 변환 


public class _02_Str {
    public static void main(String[] args) {
        String s = "java and c and python.";
        
        // and 를 , 로 변환 
        System.out.println(s.replace(" and", ",")); 

        // index 기준으로 4 부터 시작 ( 이전 내용은 삭제 )
        System.out.println(s.substring(4));

        // 해당 위치값으로부터 ~ 끝까지 출력 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("and")));

        // 끝 위치는 포함하지 않음 끝 위치 직전까지만 출력 (바로 앞까지)
        System.out.println(s.substring(s.indexOf("java"), s.indexOf(".")));
        
        // 공백 제거 
        s = "    hello.    java";
        System.out.println(s);

        // 앞 공백 제거 
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "java";
        String s2 = "python";
        System.out.println(s1 + " , "+ s2);
        
        // 결합하고 이어서 출력
        System.out.println(s1.concat(" , ").concat(s2));


    }
}
