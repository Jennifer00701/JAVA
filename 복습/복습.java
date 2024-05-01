package 복습;

import javax.sound.midi.Soundbank;

public class 복습 {
    public static void main(String[] args) {
        String name = "정자역";
        String num = "57";
        float a = 1.5F;
        int time = 3;

        System.out.println("지역은" + name + "이고," +
                "버스 번호는 " + num + ", 그리고 " +
                "도착까지의 남은 거리는 " + a + "km 입니다." +
                "남은 시간은 " + time + "분 남았습니다.");

        int num1 = 110;
        int num2 = 130;

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Hello 점검 시작");

        System.out.println("키는" + max + "으로 탑승 가능하다.");

        int min = (num1 < num2) ? num1 : num2;
        System.out.println("키는" + min + "으로 탑승 불가하다.");

        if (max >= min) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("bye bye");

        String jumin = "960701-2100000";
        System.out.println("주민번호 앞자리 : " + jumin.substring(0, 8));
        // 문자열 인덱스 0~8 출력하기

    }
}

// 주민번호에서 생년월일 및 성별가지만 출력하는 프로그램 작성
// 주민번호는 13자리 숫자로 구성 입력 데이터 - 포함 14문자열 형태

// 퀴즈 2
// int max = (cm > cmm) ? cm : cmm;

// 키가 115cm 이므로 탑승 불가능합니다.
// 키가 121cm 이므로 탑승 가능합니다.

/*
 * 퀴즈1. 버스 도착 정보를 출력하는 프로그램을 작성하시오.
 * 각 정보는 적절한 자료형 변수에 정의합니다.
 * 
 * 버스 번호는 "1234", "상암08" 과 같은 형태 = 상암 08번 버스
 * 남은 시간은 분 단위 (예 : 3분, 5분) = 약 3분 후 도착
 * 남은 거리는 km 단위 (예 : 1.5km, 0.8km) = 남은 거리 1.2km
 */
