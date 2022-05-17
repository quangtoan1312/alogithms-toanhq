import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Bai22Recursion {
    private static int calMonth(double money, double rate){
        for (int month = 2; ; month++){
            money = money + money * (rate/100);
            if ((int)2*money == (int)money * pow(1 + rate/100, month-1))
                return month;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tien: ");
        int money = input.nextInt();
        System.out.print("Nhap lai suat: ");
        int rate = input.nextInt();

        System.out.println("Tong so thang la: " + calMonth(money, rate));
    }
}
