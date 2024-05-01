package chap_04;
// 반복문

// System.out.println 에서 ln을 빼면 줄바꿈 안 됨 

public class _05_for {
    public static void main(String[] args) {
        System.out.println("A매장");

        // for (선언; 조건; 증감)
        // i 라는 변수를 만들고 초기값을 0으로 설정 i = 0 이다.
        // i 가 n 보다 작다면(<) ? 계속 명령어 실행
        // i (0) ~ 부터 쭉 출력 -> 10보다 작을 때까지 반복!!
        // 증감 ++해라
        // 0 부터 수행 -> 9까지 실행 10은 10보다 작지 않기 때문에 종료

        System.out.println(" ------------- ");
        for (int i = 0; i < 10; i++) {
            System.out.println("ABCD매장" + i);
        }
        for (int i = 1; i < 5; i++) {
            System.out.println("SOHEE매장" + i);
        }

        System.out.println(" ----- 짝수를 출력하시오 -----");
        // 짝수만 출력 ------------ fori 입력 후 엔터 !
        // =2 , 2씩 증가

        for (int i = 2; i < 10; i += 2) {
            System.out.println("2씩 올리기" + i);
        }

        // 값이 10이고, i가 1보다 클 때까지 -= 2 반복
        System.out.println(" ----- 작아지는 짝수를 출력하시오 -----");
        for (int i = 10; i > 1; i -= 2) {
            System.out.println("2씩 줄이기" + i);
        }

        // 1씩 한 줄로 증가하게 만들기
        for (int i = 1; i < 10; i += 1) {
            System.out.print(i); // ln제외 - 같은행 출력

        }
        System.out.println(); // 줄바꿈

        // 홀수만 출력
        System.out.println("----홀수만 출력 -------");
        for (int i = 1; i < 10; i = i += 2) {
            System.out.print(i);
        }

        // 1 ~ 10 까지 수들의 1 + 2 + 3 ... ~ = 합 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("총 합은 : " + sum + "입니다.");

        }

    }
}
