package Arrays;
    // I have just tried this code by myself.
/*
    String[] list = new String[10];
    public static void main(String[] args) {
        E_Create_an_empty_array target = new E_Create_an_empty_array();
        target.list[1] = "mouse";
        System.out.println(target.list[1]);
        */

// The concept and the car example of this program is done by me.

import java.util.Arrays;
public class E_Create_an_empty_array {

    String[] carsBrand = {"Toyota", "Tesla", "Ford", "Kia", "Hyundai", "Renault"};
    int[] views = {0, 0, 0, 0, 0, 0};
    String[] favoriteBrand;

    // constructor method:
    public E_Create_an_empty_array() {
        // Initialize favoriteBrand here:
        favoriteBrand = new String[10];
    }

    //  setFavoriteBrand method:
    public void setFavoriteBrand(int index, String carName) {
        // Add carName to favoriteBrand:
        favoriteBrand[index] = carName;
    }

    // brandView method which return the view: which is specially count as the index of the views array.
    public int brandView(int view) {
        return views[view] = views[view] + 1;
    }

    // main method start here:
    public static void main(String[] args) {
        E_Create_an_empty_array carList = new E_Create_an_empty_array();

        // calling the setFavoriteBrand method.
        carList.setFavoriteBrand(0,"Innova");
        carList.setFavoriteBrand(1,"Dim");
        carList.setFavoriteBrand(8,"Wagenar");
        carList.setFavoriteBrand(2,"Eco sport");
        carList.setFavoriteBrand(3,"Darer sport");
        carList.setFavoriteBrand(4,"i20");
        carList.setFavoriteBrand(5,"Renault Duster");
        // carList.setFavoriteBrand(0,"Fortuner");
        carList.setFavoriteBrand(6,"range rover");


        // calling to the brandView method:
        carList.brandView(0);
        carList.brandView(0);
        carList.brandView(1);
        carList.brandView(1);
        carList.brandView(0);
        carList.brandView(2);
        carList.brandView(2);
        carList.brandView(2);
        carList.brandView(4);
        carList.brandView(6);
        carList.brandView(5);
        carList.brandView(0);


        String brandName = Arrays.toString(carList.carsBrand);
        String cars = Arrays.toString(carList.favoriteBrand);
        System.out.println("These are the brands name available in our ex-showroom: " + brandName);
        System.out.println("Ok Sir deal, these are all cars will be deliver to you shortly: " + cars);

        String brand = Arrays.toString(carList.views);
        System.out.println("Most selling brand is: " + carList.carsBrand[0] + "\nClient has visited: " + carList.views[0] + " times");

    }
}

