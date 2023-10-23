import java.util.Scanner;
class test4{
    public static void main(String args[]){
        int number,even = 0, odd = 0,i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        number = sc.nextInt();
        
        while(number >= i){
          if(i % 2 == 0){
            even = even + i;
          }
          else{
            odd = odd + i;
          }
          i++;
        }
        System.out.println("Entred number is" + number + 
        " \n sum of even : " + even);
        System.out.println(" Sum of odd number " + odd);

    }
}