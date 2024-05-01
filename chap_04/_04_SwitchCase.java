package chap_04;

// if else = 여러 조건 또는 범위에 해당하는 조건일 경우 사용
// Swich Case = 명확한 케이스가 있는 경우  사용 
// 예 : 쇼핑몰에서 물건을 구매 시 에러 발생하면 에러의 코드에 따라 다른 메시지를 보여준다. 

public class _04_SwitchCase {
    public static void main(String[] args) {

        System.out.println("-----조회 시작");

        // if, else 문 이용
        int ranking = 3;

        if (ranking == 1) {
            System.out.println("전액 장학금 #1등");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금 #2,3등");
        }

        else {
            System.out.println("해당 없음");
        }

        System.out.println("조회 완료 -----");
        System.out.println("--------------");
        System.out.println("--------------");

        // Switch Case 이용 -----------------------------

        ranking = 5;

        switch (ranking) {
            case 1:
                System.out.println("1등 전액 장학금");
                break;
            case 2:
                System.out.println("2등 반액 장학금");
                break;
            case 3:
                System.out.println("3등 반액 장학금");
                break;

            default:
                System.out.println("그 외 / 해당하지 않음");
        }
        System.out.println("# 조회 완료 # ");

        // 2,3 통합
        // break 삭제하고, 문장이 동일할 경우 다음 문장으로 넘어가게 됨)

        ranking = 2;

        switch (ranking) {
            case 1:
                System.out.println("1등 전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("그 외 / 해당하지 않음");
        }
        System.out.println("# 조회 완료 # ");

        // 중고 상품의 등급에 따른 가격을 책정 (1급: 최상, 4급 : 최하)

        int grade = 1; // 등급
        int price = 7000; // 기본 가격

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;

                break;
        }

        System.out.println(grade + "등급제품의 가격은: " + price + "원");
        // n 등급 제품의 가격은 n원

        // 1등급 7000원 에서 시작 -> 1,2,3 쭉 내려김 break 가 없어서 3천원 추가됨
        // 2등급 7000원에서 시작 -> 2부터 쭉 내려가서 break 까지 2천원 추가됨

    }
}

// 1등 : 전액 장학금
// 2등 : 반액 장학금
// 3등 : 반액 장학금
// 그외 : 대상 아님