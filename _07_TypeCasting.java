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

    }
}
