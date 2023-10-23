
   
class A{
     void show(){
        
        System.out.println("Hello world!");
    
    }
    void add(){
              int a=12,b=24;
        System.out.println("Addition of two number"+(a+b));
    }
    void odd(){
        if(11%2==0)
        System.out.println("Entred number is Even");
        else
        System.out.println("Entred number is odd");
    }
    public static void main(String args[]){
        A obj=new A();
obj.show();
obj.add();
obj.odd();
            }
}