import java.util.Scanner;

class CountElementsGreater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int count = 0;

        int[] array = {2, 34, 6, 7, 9};

        for(int i = 0; i < array.length; i++){
            if(array[i] > n){
                count++;
            }
        }

        System.out.println("Count of elements greater than " + n + " = " + count);
    }
}



