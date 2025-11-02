class ReplaceNegative {
  public static void main(String[] args) {

    int[] array = {-1, 5, -5, 9, -7, 6};

    for(int i = 0; i < array.length; i++){
      if(array[i] < 0){
        array[i] = 0;
      }
    }

    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}
