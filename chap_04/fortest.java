package chap_04;
//이중 반복문 연습


public class fortest {
    public static void main(String[] args) {
        

        // print 가 총 5개 있으니 2번 출력하는데 한줄에 다 출력
        // println을 통해 줄바꿈 후 + 총 5번 반복
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            System.out.print("*");
            System.out.println( );
        }

        System.out.println( " ------- ");

        // i = 0~5 번 반복하겠다.(전체적으로 출력을)
        // j = 출력할 것 n개를 출력하겠다. print 한줄로
        // 출력 후 println 줄바꿈 후 0~5번 반복
        // i = 0 이 5보다 작을 때 까지 반복 (5까지 반복)
        for (int i = 0; i < 5 ; i++) {     
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("총");
                
            }
            System.out.println( );
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("8");
                
            }
            System.out.println( );
            
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println( " ----------- ");


        for (int i = 6; i > 0 ; i--) {
            for (int j = 0; j < i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }

        







       }

      
    }

