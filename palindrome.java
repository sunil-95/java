public class palindrome {
    public static void main(String[]args)
    {
        int num=12;
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }    
        if(num==rev) System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }
    
}
