class stringcmp{
    public static void main(String args[]){
        String s = new String("Vivek");
        String s1 =("Vivek");
        String lname = "yadav";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        int strlen = s.length();
        System.out.println(strlen);
        String substr = s.substring(0,3);
        System.out.println(substr);
        System.out.println(s.compareTo(s1));
        String fullName = s.concat(lname);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());






    }
}