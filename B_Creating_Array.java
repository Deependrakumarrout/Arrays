
// practice set:

/*
public static void main(String[] args) {
int y = 12, x = 10, z = 9, p;
        p = (y--) + (--y) + (--y) +(z--) + (z--) + y + z +(z--) + y + z + (--x) + (--x) + (x++) + (y--) + (y++) + (++y) + (z++) + x-y+z;
        System.out.println(p);
        */



package Arrays;
public class B_Creating_Array {

        public B_Creating_Array() {

    }

    public String[] getTopics() {
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
        // I can also able to write in this way: -> return new String[]{""};
    }

    // I have just try to do this mod method by myself.
    public double[] mod() {
        return new double[] {4%3,5%3,12%3,34%23,43%3};
    }

    public static void main(String[] args) {
        B_Creating_Array sampleFeed = new B_Creating_Array();

        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);  // This is showing the memory address.

        // The below code created by me.
        double[] modular = sampleFeed.mod();
        System.out.println(modular[1]); // But this is showing the array contain value.
    }
}
