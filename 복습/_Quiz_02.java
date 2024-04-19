package 복습;
// 키가 115cm 이므로 탑승 불가능합니다.
// 키가 121cm 이므로 탑승 가능합니다.

public class _Quiz_02 {
    public static void main(String[] args) {
        int cm = 121;
        int cmm= 115;
        int max = (cm > cmm) ? cm  : cmm;
        int min = (cm < cmm) ? cmm : cmm;
        System.out.println(max);
        System.out.println("키가"+max+"이므로 탑승 가능합니다.");
        System.out.println("키가"+min+"이므로 탑승 불가합니다.");


        int height = 115; 
        String result = (height >= 120) ? "탑승 가능" : "탑승 불가";
        System.out.println("키가"+height + "cm 이므로"+result+"합니다.");

        int height1 = 120; 
        String result1 = (height1 <= 120) ? "탑승 가능" : "탑승 불가";
        System.out.println("키가"+height1 + "cm 이므로"+result1+"합니다.");

        

    }
    
}
