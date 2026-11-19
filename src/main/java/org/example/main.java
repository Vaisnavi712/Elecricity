package org.example;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units Consumed : ");
        int unit = sc.nextInt();
        double result=0.0;
        if (unit<= 100) {
            result=unit*1.50;
        } else if (unit <= 200) {
            double temp=100*1.50;
            result=temp+(unit-100)*2.50;
        } else {
            double temp=100*1.50;
            double temp1=100*2.50;
            result=temp+temp1+(unit-200)*4.50;
        }
        System.out.println("The amount is :");
        System.out.println("50.0");
        sc.close();
    }
}
