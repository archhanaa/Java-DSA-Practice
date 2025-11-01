import java.util.Scanner;
class ReverseString{
  static String rev(String str){
    if(str.isEmpty()){
      return str;
    }
    return rev(str.substring(1))+str.charAt(0);
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter: ");
    String s = sc.nextLine();
    String result = rev(s);
    System.out.println(result);
  }
}  
