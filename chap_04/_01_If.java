package chap_04;

// 조건문 

public class _01_If {
    public static void main(String[] args) {
        int hour = 15; // 오전 10시
        if (hour < 14){ // hour가 14보다 작을 때 출력


        //거짓으로 할 때 샷추가, 커피주문완료가 출력됨 
        // if 조건이 참일 때 수행하는 문장이 2개 이상이면 중괄호{}로 묶어줘야함
        System.out.println("아이스 아메리카노 + 1");
        System.out.println("샷추가");
        }
        
        System.out.println("커피주문완료");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우 

        hour = 13;
        boolean morningCoffee = false; // 모닝커피
        if (hour < 14 && morningCoffee == false ) {    
        // hour Coffee가 false 고, hour이 14보다 작으면 실행
        System.out.println("아아 + 1"); 
    
    }
        // 오후 15시, 모닝 커피 마시다. 둘 다 true 일 경우 출력 &&
        hour = 15; 
        morningCoffee = true;
        if (hour == 15 && morningCoffee == true ) { 

            System.out.println("15시에 커피 마시다.");
        }

        // 오후 13시, 모닝 커피 둘 중에 1개라도 true일 경우 출력 || 
        hour = 13; 
        morningCoffee = false;
        if (hour == 13 || morningCoffee == true ) { 

        System.out.println("13시에 커피 : "+ morningCoffee);
        }

        // 오후 13시거나, 넘었거나 할 때 모닝커피 먹었으면 출력
        hour = 13; 
        morningCoffee = true;
        if (hour >= 13 && morningCoffee == true ) { 

        System.out.println("13시가 넘었거나 같고 커피는 : "+ morningCoffee + "이다.");
        }



        
    }
}
