package Arrays;

    // Practice set
    /*
    int x = 16, y = 18, z = 2;
        int p = (y++) + (++y) + x + (x++) + (y++) + (++y) + (z++);
        //(x++)+x+(y++)+(z++)+x/y/z + x;

        //x/=(x++)+(x--)+(y++)+(y++)+(z++)+(z++);

        // x+(z++)+(z++)+(y++)+(--z); // 2
        //x*= x+y+z+(x++)+x/z+z%x; // 68
        //x= x + 1;
        // (y--)+(y++)+(x++)+(z++); // 11
        // (x++)+x+(y++)+(z++)+x/y/z + x; // 19

        System.out.println(p);

        */



public class A_Introduction {

    // whole code is from codeAcademy.

    String[] trendingArticles;
    int[] views;
    double[] ratings;

    // constructor method:
    public A_Introduction(String[] initialArticles, int[] initialViews, double[] initialRating) {
        trendingArticles = initialArticles;
        views = initialViews;
        ratings = initialRating;
    }

    // getTopArticle method:
    public String getTopArticle() {
        return trendingArticles[3];
    }


    // viewArticle method:
    public void viewArticle(int articleNumber) {
        views[articleNumber] = views[articleNumber] + 1;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
    }


    // changeRating method:
    public void changeRating(int articleNumber, double newRating) {
        if(newRating > 5 || newRating < 0) {
            System.out.println("The rating must be between 0 and 5 stats!");
        } else {
            ratings[articleNumber] = newRating;
            System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
        }
    }


    // main method:
    public static void main(String[] args) {
        String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?", "Organic Eye Implants", "Path Finding in an Unknown World"};
        int[] robotViewers = {87,33,21,13,7};
        double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.4};
        A_Introduction robotTimes = new A_Introduction(robotArticles,robotViewers,robotRatings);

        robotTimes.viewArticle(3);
        robotTimes.viewArticle(4);
        robotTimes.viewArticle(3);
        System.out.println("The top article is " + robotTimes.getTopArticle());
        robotTimes.changeRating(2,3);

    }
}