package chap_04;

import javax.sound.midi.Soundbank;

// 이중 반복문 (여러겹으로 겹쳐서 수행)


public class _08_NestedLoop {
    public static void main(String[] args) {
        // 별(*)로 사각형 만들기

        for (int i = 0; i < 5; i++) {           
            for (int j = 0; j < 5; j++) {
                System.out.print("*"); 
            }
            
            System.out.println( ); //줄바꿈
         }
    
         System.out.println( " --------------- ");
         //왼쪽 삼각형

         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*");
                
            }
            System.out.println( );
         }
         
         System.out.println( " ----------- ");
        

         // 별 오른쪽 삼각형

         for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 4 - i ; j++) {
                System.out.print(" ");
            }
            for (int K = 0; K < i+1 ; K++) {
                System.out.print("*");
                
            }
            System.out.println( );
         }

        for (int i = 5; i >= 1; i--) { 
            //i가 >=1 같거나 큰 동안 실행 // i-- 각 반복 후 i 를 1씩 감소

            for (int j = 1; j <= i - 1 ; j++) {
            // 1부터 시작, i - 1 보다 작거나 같을 동안 실행
                System.out.print("0");
            }
            
            System.out.println( );
            // 내부 루트 완료되면 줄바꿈 출력 다음줄로 이동
        }

        System.out.println("---------");

        for (int i = 6; i >= 1; i--) { // 몇 번 반복하겠다.
            for (int j =  1 ; j <= i - 1; j++) { // 몇 번 출력하겠다.
                System.out.print("*");
            }
            System.out.println( );
        }



         }
}
