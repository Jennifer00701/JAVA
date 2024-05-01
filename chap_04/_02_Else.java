package chap_04;

// 조건문 if Else

public class _02_Else {
    public static void main(String[] args) {
    int hour = 11;
    if (hour < 14){ // 10시 이전이면
        System.out.println( " 아아 + 1 ");
    }

    // if조건이 틀리면 무시하고 else 출력
    else { 
        System.out.println("디카페인 + 1 ");
    }
    System.out.println("완료");
        

    hour = 11;
    boolean Coffee = false;
    if (hour >= 10 && Coffee == true) {
        System.out.println("10시 넘었고, 커피는 : " + Coffee);
    }
    else {
        System.out.println("만족하지 않음");
    }
    System.out.println( "bey ");

    
    hour = 15;
    Coffee = true;

    if (hour >= 10 && Coffee == true) {
        System.out.println( " #1. 10시 넘었으면 바라 + 1 주문" + "마셨는가? = "+Coffee);
    }
    else{
        System.out.println(" #2. 시간은? = " + hour + " 시 이고" + "마셨는가? = " + Coffee) ;
    } 
    System.out.println("# 완료!!!!!!!!");



    }
}
