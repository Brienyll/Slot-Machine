import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brix on 6/23/2016.
 */
public class Main {
    public static void main(String[] args) {

        int money = 500;
        boolean gameOver = false;
        boolean playGame = true;
        Scanner cinput = new Scanner(System.in);

        while (!gameOver) {
            // 5 fruits ArrayList
            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Cherry");
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Grapes");
            fruits.add("Watermelon");
            // 6 Gemstones ArrayList
            ArrayList<String> gemstones = new ArrayList<>();
            gemstones.add("Diamond");
            gemstones.add("Ruby");
            gemstones.add("Sapphire");
            gemstones.add("Emerald");
            gemstones.add("Turquoise");
            gemstones.add("Quartz");
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add("1");
            numbers.add("2");
            numbers.add("3");
            numbers.add("4");
            numbers.add("5");
            numbers.add("6");
            numbers.add("7");
            //print results

           if (playGame == true) {
            // winning fruit since i can't compare a string from an ArrayList
            String fruitWin =  fruits.get((int) Math.floor(Math.random() * 5));
            String gemstoneWin =  gemstones.get((int) Math.floor(Math.random() * 6));
            String numberWin =  numbers.get((int) Math.floor(Math.random() * 7));

                System.out.println("| "+fruitWin+ " |   " + gemstoneWin + "   |    " + numberWin+"    |\n");

                // Cherry, Diamond and 1 = jackpot
                System.out.println("Your money is " + money);
                money -= 5;
                if (fruitWin.equals("Cherry") && gemstoneWin.equals("Diamond") && numberWin.equals("1")) {
                    System.out.println("You win the Jackpot! You win $500");
                    money += 500;
                    System.out.println("Your money is " + money);
                    // Banana, Diamond and 1 = minor jackpot
                } else if (fruitWin.equals("Banana") && gemstoneWin.equals("Diamond") && numberWin.equals("1")) {
                    System.out.println("You win Minor Prize! You win $250");
                    money += 250;
                    System.out.println("Your money is " + money);
                } else
                    System.out.println("Not a Winner!");
                }
                if (money < 0) {
                    System.out.println("You ran out of money! :(");
                    gameOver = true;
                }
                System.out.println("Play Again?");
                cinput.nextLine();

            }
        }
}


