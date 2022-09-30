import java.util.Scanner;

public class sqr {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        double k;
        int n;
        k=cin.nextInt();
        n=cin.nextInt();
        double[] ary=new double[n];
        double[] arr=new double[n];
        for(int i=0;i<ary.length;i++)
        {
            ary[i]=cin.nextDouble();
        }
        for(int i=0;i<ary.length;i++)
        {
            arr[i]=cin.nextDouble();
        }
        double[] b=new double[n];
        for(int i=0;i<ary.length;i++)
        {
            b[i]=(ary[i]/arr[i])*k;

        }
        double min=b[0];
        for(int i=0;i<ary.length;i++)
        {
            if(min>b[i])
            {
                min=b[i];
            }
        }
        System.out.println((int)min);

    }
}
