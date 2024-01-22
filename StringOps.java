public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // int arr [] = {1,2,3};
        // //System.out.println(arr);
        // int[] arr1 = allIndexOf("MMMM" ,'M');
        // for (int i = 0; i<arr1.length; i++)
        // {
        //     System.out.println(arr1[i]);
        // }
        // System.out.println(arr1);
    }

    public static String capVowelsLowRest (String string) {
        String ans = "";
        int i = 0;
        while (i < string.length()) {
         char ch = string.charAt(i);
            // #feedback - to make the code a bit cleaner, you can extract some code to helper funciton, for example isVowel.
         if (ch == 'A' || ch == 'E'|| ch == 'O'||ch == 'I'||ch == 'U'||ch == 'a' || ch == 'e'|| ch == 'o'||ch == 'i'||ch == 'u'){
            if (ch == 'a' || ch == 'e'|| ch == 'o'||ch == 'i'||ch == 'u'){
                ans = ans  + (char) (string.charAt(i) - 32);
            }
            else
                ans = ans + ch;
         }
         else{
            if ((ch >= 'A') && (ch <= 'Z')) {
            ans = ans  + (char) (string.charAt(i) + 32);
            // #feedback please remove unrelated comments when you submit the exercises.
            //i++;
            } 
            else {
            ans = ans + ch;
            }
         
         }
         i++;

        }
        return ans;
    }

    public static String camelCase (String string) {
        String ans = "";
        int i = 0;
        while (i< string.length()){
            char ch = string.charAt(i);
            if (ch != ' '){
                if (ans != ""){
                    if (string.charAt(i-1) == ' ')
                        ans = ans + upperCase(ch);
                    else
                        ans = ans + lowerCase(ch);
                }
                else
                    ans = ans + lowerCase(ch);
            }
            // #feedback - consider using a for loop here instead of explicitly increasing the index every iteration.
            i++;
        }
        return ans;
    }

    // #feedback - please note the indentation here and throughout this file.
        public static char lowerCase(char ch) {
         if ((ch >= 'A') && (ch <= 'Z')) {
            return (char) (ch + 32);
         } 
         return ch;
        }
        public static char upperCase(char ch) {
         if ((ch >= 'a') && (ch <= 'z')) {
            return (char) (ch - 32);
         } 
         return ch;
        }

    public static int[] allIndexOf (String string, char chr) {
        int[] arr;
        int i = 0;
        int counter = 0;
        while (i<string.length()){
            if(string.charAt(i)== chr)
                counter++;
            i++;
        }
        arr = new int[counter];
        counter =0;
        i=0;
        while (i<string.length()){
            if(string.charAt(i)== chr){
                arr[counter] = i;
                counter ++;
            }
            i++;
        }
        return arr;
    }
}
