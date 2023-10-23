import java.util.Scanner;
class test2{
    public static void main(String args[]){
        int number,rev=0,s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        number = sc.nextInt();
        int temp  = number;
        while(number > 0){
            s = number % 10;
            rev += s;
            number = number / 10;
        }
        System.out.println("Entred number is" + temp + 
             " \n Sum of digit is : " + rev);

    }
}