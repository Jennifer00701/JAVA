package 복습;
// 주민번호에서 생년월일 및 성별가지만 출력하는 프로그램 작성
// 주민번호는 13자리 숫자로 구성 입력 데이터 - 포함 14문자열 형태 

public class _Quiz_03 {

    public static void main(String[] args) {
        String w = "960701-2111111";
        String m = "801229-1122222";

        System.out.println("w의 주민번호는 : " + w + "입니다.");
        System.out.println("m의 주민번호는 : " + m + "입니다.");
        System.out.println("여자의의 마킹 주민번호는 : " + w.substring(w.indexOf("9"),w.indexOf("11")) + "입니다.");
        System.out.println("남자의 마킹 주민번호는 : " + m.substring(m.indexOf("8"),m.indexOf("1222"))+"입니다.");


        String all = "730306";
        String all1 = "0123456";

        System.out.println("all 주민번호는 : " + all + " - " + all1 + "입니다.");
        System.out.println();
    }
    
}


// 8:35까지 강의 
