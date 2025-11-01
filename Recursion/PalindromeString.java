import java.util.Scanner;
class PalindromeString{
  static boolean isPalindrome(String s, int start, int end){
    if(start>=end){
      return true;
    }
    if(s.charAt(start)!=s.charAt(end)){
      return false;
    }
    return isPalindrome(s, start+1, end-1);
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter: ");
    String str = sc.nextLine();
    boolean result = isPalindrome(str, 0, str.length()-1);
    if(result){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
    }  
  }
}  
      
