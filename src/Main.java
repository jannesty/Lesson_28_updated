import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Привет Жанна!");

        /*int my_number = 5 ;
        double second_number ;
        System.out.println("My number is " + my_number);

        second_number = 22.5 ;
        System.out.println("My number is " + second_number);

        String my_string= "My first string" ;
        System.out.println(my_string.toLowerCase()) ;
        System.out.println(my_string.toUpperCase()) ;
        System.out.println(my_string.length()) ;
        System.out.println(my_string.charAt(0)) ; */
        /*int a = 10 ;
        int b = 3 ;
        System.out.println(a+b) ;
        System.out.println(a-b) ;
        System.out.println(a*b) ;
        System.out.println(a/b) ;*/

        /*int a= 10 ;
        int b = 3 ;*/

        /*System.out.println(++a);
        System.out.println (--b);

        System.out.println(a++);
        System.out.println (b--);

        System.out.println (a);
        System.out.println (b);*/

       /* System.out.println(a>b) ;
        System.out.println (a<b) ;
        System.out.println (a>=b) ;
        System.out.println (a<=b) ;
        System.out.println (a==b) ;
        System.out.println (a!=b) ; */

        /*int age = 17 ;
        if (age>=18) {
            System.out.println("You are an old person");
        } else {
            System.out.println ("You are an child");
        }

        int weekDay = 10 ;
        if (weekDay ==1) {
            System.out.println ("Monday!");
        }

        switch (weekDay) {
            case 1:
                System.out.println ("Monday!");
                break;
            case 2:
                System.out.println ("Tuesday!");
                break;
            case 3:
                System.out.println ("Wednesday!");
                break;
            case 4:
                System.out.println ("Thursday!");
                break;
            case 5:
                System.out.println ("Friday!");
                break;
            case 6:
                System.out.println ("Saturday!");
                break;
            case 7:
                System.out.println ("Sunday!");
                break;
            default:
                System.out.println ("No such day") ;
        } */

        /*int k = 0 ;
        while (k<5) {
            System.out.println (k);
            k++ ;
        }*/

        /*int i_love_ukraine = 0 ;
        while (i_love_ukraine<17) {
            System.out.println (i_love_ukraine) ;
            i_love_ukraine ++ ;
        }*/

        /*String s= console.nextLine() ;

        System.out.println ("My string" +s) ; */

       /* while (true) {
            String s_new = console.nextLine();
            if (s_new.equals("exit")) {
                break;
            }
        }*/

        /*int i = 5;
        do {
            System.out.println (i) ;
            i--;
        } while (i>0) ;*/

       /* int o = 17;
        do {
            System.out.println (o) ;
            o--;
        } while (o>0) ;*/

        /*int result = 0 ;
        for (int i = 1; i <= 5; i++) {
            if ((i%2)==0) {
                System.out.println(i);
                continue;
            }
                result = result +i ;
        }*/

      /*  int result = 0 ;
        for (int p = 1; p <= 50; p++) {
            if ((p%5)==0) {
                System.out.println(p);
                continue;
            }
        } */

        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int s_1= Integer.parseInt(s) ;

        System.out.println(s+1);
        System.out.println(s_1+1);



    }
}