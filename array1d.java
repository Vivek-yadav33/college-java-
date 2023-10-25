import java.util.Scanner;
class array1{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int x[] = new int [5];
		for(int i=0; i < 5;i++){
			 System.out.println("Enter the " + i + " index value");
			x[i] = sc.nextInt();
		}
		
      System.out.println("*************");
        for(int i =0;i < 5;i++){
			 
            System.out.println( i + " index Enterd value " + x[i]);
        }
    }
}