import java.util.Scanner;


public class Ass2 {
    public static void main(String[] args){
        // initialize variables
        int million = 1000000;
        int result = 0;

        // create new scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how much you expect to spend each year: ");
        int user_input = scan.nextInt();

        // compute how many years it would take to spend a million dollars
        result= million/user_input;

        // display results
        System.out.println("Years: "+ result);

    }
}
