package Week6_CodingTasks;

public class Task1_Kristine {

    public static void main(String[] args) {
        System.out.println("isValidPassword? = " + isValidPassword("Panorama1!"));
    }

    /*
    String -- Password Validation Task
     Write a return method that can verify if a password is valid or not.
requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean isValidPassword(String password){

        boolean isValid = false;

        char [] arr = password.toCharArray();

        int lower = 0;
        int upper = 0;
        int special = 0;
        int digit = 0;

        for(int i = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                upper++;
            }
            if (Character.isLowerCase(arr[i])){
                lower++;
            }
            if(!Character.isLetterOrDigit(arr[i])){
                special++;
            }
            if(Character.isDigit(arr[i])){
                digit++;
            }
        }

        if(password.length() >=6 && !password.contains(" ") && lower >= 1 && upper >=1 && special >=1 && digit >=1){
            isValid = true;
        }

        return isValid;
    }
}
