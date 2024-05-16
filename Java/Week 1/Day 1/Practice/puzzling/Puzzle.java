import java.util.ArrayList;
import java.util.Random;

public class Puzzle{
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomRolls = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i<10 ; i++) {
            int roll = rand.nextInt(21);
            randomRolls.add(roll);
        }
        return randomRolls ;
    }
    public String RandomLetters(int length){
        Random rand =new Random();
        StringBuilder sb = new StringBuilder();
        for( int i=0 ;i<length ; i++){
            char randomLetter =(char) (rand.nextInt(26)+'a');
            sb.append(randomLetter);
        }
        return sb.toString();
    }
    public String GeneratePassword(int length ){
        return RandomLetters(length);
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet= new ArrayList<String>();
        for (int l=0 ; l<length; l++) {
            passwordSet.add(GeneratePassword(10));
        }
        return passwordSet;
    }
}
