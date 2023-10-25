import java.util.Scanner;
class test5{
    public static void main(String args[]){
        int number,a=0,b=1,c,i=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        number = sc.nextInt();
          System.out.print(a + " " + b );
        while(number >= i){
         c = a + b;
         a = b;
         b = c;
           System.out.print(c + " ");
          
          i++;
        }
       
      
      

    }
}