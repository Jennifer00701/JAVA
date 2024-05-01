package chap_04;

public class test {
    public static void main(String[] args) {

        int a = 105;
        int b = 100;

        String str = "TEST";

        int age = (a > b) ? a : b;
        System.out.println("big age" + age + " 는" + str);

        if (a < b) {
            System.out.println("b가 a 보다 큰 값");
        } else {
            System.out.println("a가 b보다 큰 값");
        }

        String num = "012345-678910";
        System.out.println(num.substring(0, 8));

        a = 11;
        b = 12;

    }

}
