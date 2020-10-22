package Arrays;
import java.util.Arrays;


    // practicing with the array:
    /*

    int[] lotteryNum = {1,2,3,4,5,6,7,87,44,93,12,21,32,23,43,34,54,45,56,65,76,67,78,87,89,98};
        public void lotteryView(int view) {
        lotteryNum[view] = lotteryNum[view] + 1;
        }

    public static void main(String[] args) {

        // D_Element_By_index selection = new D_Element_By_index();
        D_Element_By_index schedule = new D_Element_By_index();
        System.out.println(schedule.lotteryNum[3]);
*/



// class D_Element_By_index:
public class D_Element_By_index {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    // constructor method:
    public D_Element_By_index() {
    }

    // getTopics method which is StringArray method: That return the above topic but i have not implemented in my program.
    // This will print all the list and for this i have done [import java.util.Arrays;]
    public String[] getTopics(){
        return topics;
    }

    // getTopTopic method this is also a string method: Which return the first topics string which is: "Opinion".
    public String getTopTopic() {
        return topics[0]; // This line is returning the index of 0 which denote the topics ["Opinion"].
    }

    // viewTopic method which has a parameter that get the index of views which are 0,0,0,0 of the 4 topics that i have implemented above.
    public void viewTopic(int topicIndex) {
        views[topicIndex] = views[topicIndex] + 1; // And here i have done addition like this see below.
    }// views[topicIndex] -> Here views[topicIndex] is the index of the views array which is 0 - views[1], on the top you can see.
     // = views[topicIndex] is also the same thing which will be increment by the index that i have called below [sampleFeed.viewTopic(topicIndex 1);]

    // main method start here:
    public static void main(String[] args) {
        D_Element_By_index sampleFeed = new D_Element_By_index();

        System.out.println("The top topic is " + sampleFeed.getTopTopic());

        // These below six line is calling the viewTopic method to add the views and give the total view of a particular index.
        sampleFeed.viewTopic(1); // Such as views[1], which only denotes to index 1, views[0] which is index 0 and so on.
        sampleFeed.viewTopic(1); // The viewTopic method will count and give the viewsArray to the value.
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(0);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);


        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");


        String[] dow = sampleFeed.getTopics(); // These two line will show the getTopic method array list which is topic full list.
        System.out.println(Arrays.toString(dow));
    }
}

