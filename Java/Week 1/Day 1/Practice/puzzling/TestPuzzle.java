import java.util.ArrayList;

public class TestPuzzle {
    public static void main ( String [] args) {
        Puzzle generator = new Puzzle();

        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        String randomLetters = generator.RandomLetters(10);
        System.out.println("Random Letters: " + randomLetters);

        String generatePassword = generator.GeneratePassword(10);
        System.out.println("generate password: "+generatePassword);

        ArrayList<String> passwordSet =generator.getNewPasswordSet(3);
        System.out.println("passwordSet "+passwordSet);
    }
    }
