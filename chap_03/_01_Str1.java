package chap_03;

public class _01_Str1 {
    public static void main(String[] args) {
        String s = "java and c and python";
        System.out.println(s);


        // 문자열 길이 
        System.out.println(s.length()); 
        
        // 대소문자 변환 (전체 문자열)
        System.out.println(s.toUpperCase());
        
        // 소문자 변환 (전체 문자열)
        System.out.println(s.toLowerCase());

        // 포함 관계 (대소문자 구분해야함)
        System.out.println(s.contains("java"));

        // 위치 정보
        System.out.println(s.indexOf("java"));

        // 위치 정보 (포함 안 되어 있는 글자라면 -1 출력)
        System.out.println(s.indexOf("오"));

        // 위치 정보 (가장 마지막 글자)
        System.out.println(s.lastIndexOf("python"));

        // 해당 문자열로 시작이 되는지 true or false
        System.out.println(s.startsWith("java"));
        // 해당 문자열로 끝이 나는지 true or false
        System.out.println(s.endsWith("."));

        
    }
}
