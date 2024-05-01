package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {

        // 바라가 있으면 +1 주문, 없다면
        // 아아 주문 +1 주문, 없다면
        // 에이드 +1 주문

        boolean bala = false;
        boolean coffee = false;
        boolean orange = true;

        if (bala) {
            System.out.println("바라가 있음");
        }

        // else if 는 여러번 사용 가능
        else if (coffee) {
            System.out.println("아아가 있음");
        }

        else if (orange) {
            System.out.println("오렌지 있음");
        }

        else {
            System.out.println("다 없어");
        }

    }
}
