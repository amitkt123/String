public class baseconversion {
    public static int conver(String a, int b, int c)
    {
        long num =0;
        int j =0;
        //convert the string into a number in decimal format
        for(int i=a.length()-1; i>=0; i--)
        {
            num += (a.charAt(i)-'0')* Math.pow(7,j);
            j++;
        }
        //convert the number into a
        StringBuilder sb = new StringBuilder();
        while(num!=0)
        {
            if(num%c > 9)
            {
                sb.append((char) (65 + (num%c - 10)));
                num = num/c;}
            else
            {
                sb.append(num%c);
                num = num/c;}
        }
        System.out.println(sb);
        int nums=0;
        int k =0;
        //convert the string into a number
        for(int i=a.length()-1; i>=0; i--)
        {

            nums += (sb.charAt(i)-'0')* Math.pow(10,k);
            k++;
        }
        System.out.println(nums);
        return nums;
    }

    public static void main(String[] args) {
        String num = "615";
        int a = 7, b = 13;
        conver(num,a,b);
    }
}

