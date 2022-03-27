import java.util.Scanner;

public class inttostring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isnegative= false;
        if(a<0)
            isnegative = true;
        StringBuilder sb = new StringBuilder();
        while(a!=0)
        {
          sb.append(('0'+a%10));
          a = a/10;
        }
        char c = '0'+65;
        int d = '0'+65;
        StringBuilder sv = new StringBuilder();

        System.out.println("enter the value of g");
        int g = sc.nextInt();
        for(int i =g; i<26; i++) {
            sv.append((char) (65 + (g - 10)));
            g++;
        }
        System.out.println(sv);
        System.out.println(c);
        System.out.println((int) c);
        if(isnegative)
        {
            sb.append('-');
        }
        sb.reverse();
       String s = sb.toString();
        System.out.println(s);
    }
}
