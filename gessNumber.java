import java.util.Scanner;
import java.lang.Math;
class test6{
    public static void main(String args[]){
        int number,numberRan;
        test6 obj = new test6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gess numebr Range 10 to 100");
        number = sc.nextInt();
        numberRan = obj.random();
        System.out.println(numberRan);


    }

}