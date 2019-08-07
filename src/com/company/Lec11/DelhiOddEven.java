package com.company.Lec11;

import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        for (int i=1;i<=n ;i++ ) {
            int num;
            num=scan.nextInt();
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum+=rem;
                num/=10;
            }
            if (sum%2==0 && sum%4==0) {
                System.out.println("Yes");
            }
            else if(sum%2!=0 && sum%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
