package 복습;
// 키가 115cm 이므로 탑승 불가능합니다.

// 키가 121cm 이므로 탑승 가능합니다.

public class _Quiz_02 {
    public static void main(String[] args) {
        int cm = 121;
        int cmm = 115;
        int max = (cm > cmm) ? cm : cmm;
        int min = (cm < cmm) ? cmm : cmm;
        System.out.println(max);
        System.out.println("키가" + max + "이므로 탑승 가능합니다.");
        System.out.println("키가" + min + "이므로 탑승 불가합니다.");

        int height = 115;
        String result = (height >= 120) ? "탑승 가능" : "탑승 불가";
        System.out.println("키가" + height + "cm 이므로" + result + "합니다.");

        int height1 = 120;
        String result1 = (height1 <= 120) ? "탑승 가능" : "탑승 불가";
        System.out.println("키가" + height1 + "cm 이므로" + result1 + "합니다.");

        if (height < height1) {
            System.out.println("탑승불가");
        }

        else {
            System.out.println("탑승가능");
        }

    }

}

/*
 * 
 * int num1 = 110;
 * int num2 = 130;
 * 
 * int max = (num1 > num2) ? num1 : num2;
 * 
 * 이 코드는 두 개의 정수 변수 num1과 num2가 주어졌을 때, 그 중에서 더 큰 값을 찾아내는 방법을 보여줍니다.
 * 여기서는 조건 연산자(삼항 연산자)를 사용하여 두 수를 비교하고, 더 큰 값을 max 변수에 할당합니다. 조건 연산자의 구조는 다음과
 * 같습니다:
 * 
 * (condition) ? (value if true) : (value if false)
 * 
 * 따라서 num1이 num2보다 크다면, max에는 num1의 값이 할당되고, 그렇지 않으면 max에는 num2의 값이 할당됩니다.
 * 
 * 마지막으로, System.out.println(max)를 통해 max의 값을 출력합니다. 이는 가장 큰 값을 화면에 표시하는 역할을
 * 합니다.
 * 
 * 
 */