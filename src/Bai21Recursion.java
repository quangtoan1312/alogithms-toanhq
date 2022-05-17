

import java.util.Scanner;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;

public class Bai21Recursion {
    private static int calSalary(int salary, int n){
        //Recursion
        if (n==1){
            return salary;
        }
        else
            return (int) ((calSalary(salary,n-1))*1.1);

        //Non-Recursion
//        if(n==1){
//            return salary;
//        }
//        else {
//            return (int) (salary*pow(1.1,n-1));
//        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong:");
        int salary = input.nextInt();
        System.out.print("Nhap so nam lam viec:");
        int n = input.nextInt();

        System.out.println("Tong so luong qua " + n + " nam la: " + calSalary(salary, n));
    }
}
