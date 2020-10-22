package Arrays;
import java.util.Arrays;
public class G_Practice {

    String[] NameOfStudent = {"Summit", "Bablu", "Tony", "Roman", "Sandy"};
    double[] Rupees = {12.32, 53.34, 53.23, 43.45, 10.44};

    public String[] StudentName() {
        return NameOfStudent;
    }

    public double[] reward() {
        return Rupees;
    }

    // viewList method:
    public String viewList(String view) {
        return NameOfStudent[Integer.parseInt(view)]; // Integer.parseInt(view)? means.
    }

    public static void main(String[] args) {
        G_Practice content = new G_Practice();
        String[] name = content.StudentName();
        //System.out.println();

        double[] num = content.reward();
        String order = content.viewList("0"); // In this way we can access by calling the index of the Array list.

        System.out.println(order);

        System.out.println("The Student name " + Arrays.toString(name)
                + " has got Rs: " + Arrays.toString(num));
    }
}
