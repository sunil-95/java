import java.util.*;
public class armstrong {
    public static void main(String[]args){
        int num=153;
        int temp=num;
        int sum=0;
        while(temp!=0){
            int d=temp%10;
            sum=sum+d*d*d;
            temp=temp/10;
    }
    if(num==sum) System.out.println("armstrome");
    else System.out.println("is not a armstrome");
}
}
