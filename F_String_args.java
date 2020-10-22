package Arrays;

import java.util.Arrays;
public class F_String_args {

    // This below code is for practicing propose only.
/*
    public static void main(String[] args) {
        String[] dae = new String[2];
        dae[0] = "Assignment done";
        String done = Arrays.toString(dae);
        String done1 = Arrays.toString(dae);
        System.out.println("R.D Sharma " + args[0] + " " + args[0]);
    }
}
 */

    String[] topics;
    // constructor method:
    public F_String_args(String[] initialTopics) {
        topics = initialTopics;
    }

    // main method:
    public static void main(String[] args) {
        F_String_args feed;
        if(args[0].equals("Human")) {

            // topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new F_String_args(humanTopics);

        } else if(args[1].equals("Robot")) {

            // topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new F_String_args(robotTopics);
        } else {

            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new F_String_args(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}


/*
   This above program will not work when i run though the dialog box. So for that in the tutorial too it run through
   terminal so you have to give this path in the terminal.
   and then write -> java packageName if any. I have used here Arrays package so i am writing (Arrays) then the
   className and then the three parameter you have to give like Human Robot None.
   ex - java Arrays.F_String_args Ham Robot None -> So this is going to print the Robot's topics.

   For more detail go through the note book that has written throughly. (Topic: String[] args)
   you can also get the path over there.

 */


