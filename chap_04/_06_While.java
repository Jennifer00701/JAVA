package chap_04;
// 반복문 While 

// 명확한 횟수가 없을 경우 사용
// 변수 +=3 을 넣어서 꼭 나갈 경로를 만들어줘야함 아니면 무한루프에 빠짐 

public class _06_While {
    public static void main(String[] args) {
        // 수영장에서 수영하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리

        // while (조건)
        while (move < distance) {
            // 이동 거리가 전체 거리보다 작다는 조건이 참인동안 반복수행
            // move 0 이 25가 될 때 까지 3씩 증가
            // 3씩 증가하여 25가 되었다면 도착했다. 출력 후 종료

            System.out.println("발차기 수수숙");
            System.out.println("현재 이동 거리는" + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했다");

        // move 에 증감을 넣어주지 않으면 무한 루프에 빠지게 됨

    }

}
