class FrequencyOfEachElement {
    public static void main(String[] args) {

        int[] array = {1,2,3,3,4,4,4,5,5,6};

        for(int i = 0; i < array.length; i++) {
            boolean check = false;

            for(int j = 0; j < i; j++){
                if(array[j] == array[i]){
                    check = true;
                    break;
                }
            }

            if(check){
                continue;
            }

            int frequency = 1;
            for(int k = i+1; k < array.length; k++){
                if(array[k] == array[i]){
                    frequency++;
                }
            }

            System.out.println("Frequency of "+array[i]+" occurs "+frequency);
        }
    }
}
          
        

        
    
        
        
        
          
          
