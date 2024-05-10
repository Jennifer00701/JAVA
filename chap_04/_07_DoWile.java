package chap_04;
// 반복문

/* 
while = 조건 -> 참이면 실행 
DoWile = 조건 상관없이 do 실행 후 while확인 후 계속 반복할지 결정
*/

public class _07_DoWile {
    public static void main(String[] args) {
        int distance = 25; // 전체거리
        int move = 0; // 현재 이동 거리
        int height = 2; // 키 2m

        while (move + height < distance) {
            System.out.println("계속 진행");
            System.out.println("현재 이동 거리 : " + move);

            move += 3; // 3m 이동
        }
        System.out.println("도착");

        System.out.println("----반복문----#1");

        // DoWile문 --------------------

        distance = 25;
        move = 0;
        height = 20;

        do {
            System.out.println("계속 이동");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }

        while (move + height < distance);
        System.out.println("도착!");

        System.out.println("--다른점 테스트--");

        int a1 = 3;
        int a = 0;

        do {
            System.out.println(a);
            a += 4;

        } while (a1 > a);
        System.out.println("무조건 한 번은 출력됨");

        System.out.println("--구분선--");

        while (a1 > a) {
            System.out.println(a);
            a += 1;
            System.out.println("조건에 만족하지 않으면 출력 안 함");

        }

    }

}
