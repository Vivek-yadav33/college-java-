import java.util.Scanner;
class test{
    public static void main(String args[]){
        int number,rev=0,s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        number = sc.nextInt();
        int temp  = number;
        while(number > 0){
            s = number % 10;
            rev = (rev * 10)+s;
            number = number / 10;
        }
        System.out.println("Entred number is" + temp + 
             " \n reverse number is " + rev);

    }
}