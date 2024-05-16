import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0 ;
        for(int i=0 ; i<11 ; i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[]prices){
        double total=0.0;
        for( double price : prices ){
            total +=price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String>menuItems){
        for( int i=0 ; i<menuItems.size() ;i++){
            System.out.println(i +" "+menuItems.get(i));
        }
        
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.print("please enter your name");
        String username = System.console().readLine();
        customers.add(username);
        System.out.print("hello,"+username+"!");
        System.out.print( "There are"+" "+ customers.size() +" " +"people in front of you" );
        System.out.print(customers);
    }
} 
