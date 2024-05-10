package chap_04;

public class _09_MultipleTabel {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            int j = 1;
            System.out.println( i + " * " + j + " = " + (i * j));
            j ++;

            System.out.println( i + " * " + j + " = " + (i * j));
            j ++;

            System.out.println( i + " * " + j + " = " + (i * j));
            j ++;
          
            System.out.println();

        }

        for (int i = 2; i < 10 ; i++) {
            int j = 1;
            System.out.println( i + "*" + j + " = " + (i*j));
            System.out.println();   
        }

        for (int i = 5; i <10 ; i++) {
            int j = 5; 
            System.out.println((i+j));
            
        }


        System.out.println(" ------- TEST ---------");


    }
}
