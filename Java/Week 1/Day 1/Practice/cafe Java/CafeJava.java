public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffe= 4.2;
        double latte= 3.5;
        double cappuccino= 4.2;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 ="Sam";
        String customer3 ="Jimmy";
        String customer4 ="Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 +pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        if (isReadyOrder4==true){
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage+cappuccino);
        }
        else{
            System.out.println(pendingMessage);
        }

        System.out.println(latte+latte);
        if (isReadyOrder2==true){
            System.out.println(readyMessage);
        }else{
            System.out.println(pendingMessage);
        }
        System.out.print(dripCoffe-latte);
    }
}
