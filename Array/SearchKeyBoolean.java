import java.util.Scanner;
class SearchKeyBoolean{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num: ");
    int key = sc.nextInt();

    int[] array = {23,12,89,4,5};
    boolean check = false;

    for(int i=0;i<array.length;i++){
       if(key==array[i]){
         check = true;
         break;
       }
    }

      System.out.println(check);

  }
}
    
