import java.util.Scanner;
class SumOfDigits{
   static int add(int n){
     if(n==0){
       return 0;
     }  
     return (n%10)+add(n/10);
   }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = sc.nextInt();
    int result = add(x);
    System.out.println("Sum of Digits: "+result);
  }
}  
    
