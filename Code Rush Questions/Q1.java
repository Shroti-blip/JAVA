/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coderush;

/**
 *
 * @author Veersingh Lodhi
 */
public class Q1 {

    
    public static int []getCheck(int arr[],int target){
        int len=arr.length;
        int arr1[]=new int[2];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr[i]+arr[j]==target){
                    arr1[0]=i;
                    arr1[1]=j;
                    return arr1;
                }
            }
        }
        return arr1;
    
}
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int temp[]=getCheck(arr,target);
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
    
}
