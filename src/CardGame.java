
import javax.swing.*;
import java.util.Random;

public class CardGame {

    //Global Variables
    public static String name;
    public static double totalPoints;
    public static double points;

    public static void main(String[] args) {

        //local variables
        int characters = 0;
        String strongest = "";
        double highestPoints = 0.0;

        //for loop to run the code until toatalPoints adds up to just over 100
        for(int i = 0;totalPoints < 100; i++){
            //oneCard Method
            oneCard();
            // counts the number of characters registered
            characters = characters + 1;

            //finds teh character with the highest points
            if (points>highestPoints){
                highestPoints = points;
                strongest = name;
            }
        }
        //prints teh character with the highest points
        System.out.println("The strongest character is: " +strongest + " with: " + highestPoints + " points");
        //prints the number of characters entered
        System.out.println("The number of characters: " + characters);

    }

    public static void oneCard(){

        //Gets user to input the name of the characvcter they want
        name = JOptionPane.showInputDialog("Enter Characters name");

        //generates random number between 1-3
        Random rnd = new Random();
        int rand_num = rnd.nextInt(3);
        int type = rand_num +1;

        //assigns a side to the character they chose
        String side = "";
        switch (type){
            case 1:
                side = "Dark side";
                break;

            case 2:
                side = "Light side";
                break;

            case 3:
                side ="Support";
                break;
        }

        //prints out the character and their stats
        System.out.println("\n \n Name: " + name + " - " + side);


        //for loop to run the following code 3 times
        for (int i = 1; i<=3; i++){

            // generates random number(1-5) to use as heir Attack and Defense stats
            int rand_genAttack = rnd.nextInt(5);
            int rand_genDefense = rnd.nextInt(5);

            int Defense = rand_genDefense + 1;
            int Attack = rand_genAttack + 1;

            //calculates the characters luck stats based on the amount of chars in the chracters name
            double length =name.length() / 3.5;
            double luck = Math.round(length * 10)/ 10.0;

            //calculates their points
            points = (Defense + Attack) * luck;

            //prints the characters stats
            System.out.println("Attack: " + Attack + " Defense: " + Defense + " Luck: " + luck + " Points: " + points);
            charPoints = charPoints + points;

            //adds up the amount of points and assigns it to the global variable "totalPoints"
            totalPoints = totalPoints + charPoints;
        }

        System.out.println("Character points: " + charPoints);
        System.out.println("Total Points: " + totalPoints);
    }
}