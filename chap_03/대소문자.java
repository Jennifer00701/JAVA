package chap_03;

/// 재공부 이해못함~~~

public class 대소문자 {

    public static void main(String[] args) {

        String str = "abcdef";

        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder(str);

        // "b"와 "d"의 인덱스 찾기
        int indexB = str.indexOf('b');
        int indexD = str.indexOf('d');

        // "b"와 "d"를 대문자로 변경
        if (indexB != -1)
            sb.setCharAt(indexB, Character.toUpperCase(sb.charAt(indexB)));
        if (indexD != -1)
            sb.setCharAt(indexD, Character.toUpperCase(sb.charAt(indexD)));

        // 수정된 문자열 출력
        System.out.println(sb.toString());
    }
}

/*
 * charAt : 문자열 N 번째 문자열을 가져오기
 * substring : 문자열 N번째부터 M번째 문자열을 가져오기
 * Character.toUpperCase : 가져온 n 번째 문자를 대문자로 변경
 */
