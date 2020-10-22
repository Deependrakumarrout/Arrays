package Arrays;

import java.util.Arrays;  // Here i have import the java package which will help me to apply the method.
public class C_Importing_Array {

    // constructor method: which is empty.
    public C_Importing_Array() {
    }

    // getTopics method: That contain topics of string type
    public String[] getTopics() {
        String [] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    // lottery method: That return random numbers.
    public int[] lottery() {
        return new int[] {2,5,87,4,45,73,432,7,56,34,687,45,23,290,6,85,32};
    }

    // main method:
    public static void main(String[] args)  {
        C_Importing_Array sampleFeed = new C_Importing_Array();

        // Code is from codeAcademy: using here Arrays.toString.
        String[] container = sampleFeed.getTopics();
        System.out.println(Arrays.toString(container));

        // Created by me:
        int[] number = sampleFeed.lottery();
        System.out.println("There are the lottery number, please select one from it " + Arrays.toString(number));
        System.out.println("The length is: 0 to " + number.length + " of all lottery number.");
    }
}