import java.util.Scanner;

public class columnnumber {
    public static int solve(String a)
    {
        long n = 0;
        double j=0;
        for(int i=a.length()-1; i>=0; i--)
        {
            n += (a.charAt(i)-'A'+1)*Math.pow(26, j);
            j++;
        }
        System.out.println(n);
        return (int)n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the col ID, only in caps");
        String s = sc.next();
        int x = solve(s);
        System.out.println(x);


    }
}
