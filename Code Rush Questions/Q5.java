/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coderush;

/**
 *
 * @author Veersingh Lodhi
 */
public class Q5 {

    public static int getFact(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*getFact(num-1);
    }
    public static boolean getCheckNumber(int num){
        int temp=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=getFact(digit);
            num/=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        // Strong number 
        int no;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        no=sc.nextInt();
        if(getCheckNumber(no)){
            System.out.println("Strong number");
        }else{
            System.out.println("No Strong number");
        }
    }
    
}
