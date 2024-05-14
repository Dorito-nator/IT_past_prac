
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class CardGame {

    public static String name;
    public static double totalPoints;

    public static void main(String[] args) {

        int characters = 0;

        for(int i = 0;totalPoints < 100; i++){
            oneCard();

            characters = characters + 1;
        }

    }

    public static void oneCard(){

        name = JOptionPane.showInputDialog("Enter Characters name");

        //generates random number between 1-3
        Random rnd = new Random();
        int rand_num = rnd.nextInt(3);
        int type = rand_num +1;


        String side = "";

        switch (type){
            case 0:
                side = "Dark side";
                break;

            case 1:
                side = "Light side";
                break;

            case 2:
                side ="Support";
                break;
        }

        System.out.println("\n \n Name: " + name + " - " + side);


        totalPoints = 0;
        for (int i = 1; i<=3; i++){


            int rand_genAttack = rnd.nextInt(5);
            int rand_genDefense = rnd.nextInt(5);

            int Defense = rand_genDefense + 1;
            int Attack = rand_genAttack + 1;

            double length =name.length() / 3.5;

            double luck = Math.round(length * 10)/ 10.0;

            double points = (Defense + Attack) * luck;

            System.out.println("Attack: " + Attack + " Defense: " + Defense + " Luck: " + luck + " Points: " + points);



            totalPoints = totalPoints + points;
        }

        System.out.println("Total Points: " + totalPoints);
    }
}