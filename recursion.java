class fact{
    int fact1(int n){
        if(n >=1){

            return n * fact1(n -1);
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        fact obj = new fact();
        int n = obj.fact1(5);
        System.out.print(n);
    }
}