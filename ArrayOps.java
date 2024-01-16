public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(secondMaxValue(new int[] {6,9,9,4,7,3,4,4}) );
        
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int missNum =-1;
            for (int i=0 ; i<=n; i++){
                for(int j = 0; j<n ; j++){
                    if (i == array[j]){
                        break;
                    }
                    if (n-1 == j){
                        missNum = i;
                      //  break;
                    }
                }
            }   
        return missNum;
    }

    public static int secondMaxValue(int [] array) {
        int firstMax = array[0];
        int secondMax;
        int counter = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] > firstMax){
                firstMax = array[i];
            }
        }
        if (array[0]!= firstMax){
            secondMax = array[0];
        }
        else{
            secondMax = array[1];
        }
        for (int i = 0; i<array.length; i++){
            if (array[i] > secondMax) {
                if (array[i] != firstMax){
                    secondMax = array[i];
                }
                if (array[i] == firstMax){
                    counter++;
                }
            }
        }

        if (counter>1)
            return firstMax;
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i=0 ; i<array1.length; i++){
            if (!isNumExist(array2,array1[i])){
                return false;
                //break;
            }
            
        }
        for (int i=0 ; i<array2.length; i++){
            if (!isNumExist(array1,array2[i])){
                return false;
                //break;
            }
            
        }
        return true;
                

    }

    public static boolean isNumExist(int [] array1,int nun) {
        boolean isIn = false;
        for (int i = 0; i<array1.length;i++)
        {
            if (array1[i]==nun){
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public static boolean isSorted(int [] array) {
         for (int i = 0; i<array.length-1;i++){
            if (!(array[i] <= array [i+1])){
                break;
            }
            if(i == array.length-2)
                return true;
         }
         for (int i = 0; i<array.length-1;i++){
            if (!(array[i] >= array [i+1])){
                break;
            }
            if(i == array.length-2)
                return true;
         }
        return false;
    }

}
