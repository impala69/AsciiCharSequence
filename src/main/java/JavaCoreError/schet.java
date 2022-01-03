package JavaCoreError;

import java.util.Scanner;

public class schet {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        double sum=0.0;
        while (n.hasNext()) {
            if(n.hasNextDouble()){
                double d=n.nextDouble();
                sum=sum+d;
            }else n.next();
        }
        System.out.printf("%.6f", sum);
    }
}
