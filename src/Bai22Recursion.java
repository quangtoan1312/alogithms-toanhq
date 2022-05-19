import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Bai22Recursion {
    private static int calMonth(double money, double rate, int n){
        //Recursion
        double newMoney = money;
        for (int i = 0; i<n ; i++){
            newMoney = newMoney + newMoney*rate*0.01;

        }
        if(newMoney >= 2*money){
            return n;
        }
        else {
            return calMonth(money, rate, n+1);
        }

        //Non-Recursion
//        for (int month = 2; ; month++){
//            money = money + money * (rate/100);
//            if ((int) pow(1 + rate*0.01, month) >=2)
//                return month;
//        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tien: ");
        double money = input.nextInt();
        System.out.print("Nhap lai suat: ");
        double rate = input.nextInt();

        System.out.println("Tong so thang la: " + calMonth(money, rate, 0));
    }
}
