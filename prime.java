import java.util.Scanner;
class test3{
    public static void main(String args[]){
        int count = 0,i=2,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime or not!");
        n = sc.nextInt();
        while(n>=i){
            if(n % i == 0){
                count++;
            }
            i++;
        }
        if(count == 1){
            System.out.println(n + " is prime number");
        }
        else{
            System.out.println(n + " is not prime number");
        }
    }
}