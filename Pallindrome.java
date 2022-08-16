import java.util.Scanner;;
public class Pallindrome {
    public static boolean isPallindrome(int x){
         if(x<0||(x%10==0 && x!=0)){
        return false;
    }
    int reversednumber = 0;
    while( x > reversednumber)
    {
        reversednumber=reversednumber *10+x % 10;
        x/=10;
    }
    return x==reversednumber || x==reversednumber/10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPallindrome(n));
    }
}
