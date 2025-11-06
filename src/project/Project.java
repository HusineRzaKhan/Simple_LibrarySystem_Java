package project;
import java.util.*;
import java.util.InputMismatchException;
public class Project {
    
    static void DisplayBooks(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {
 
        System.out.println("""
                                   Which catagory you want to display:
                                    1.Computer
                                    2.Biology
                                    3.Maths
                                    4.Chemistry
                                    5.Physics
                                    6.English
                                    7.Others""");
        System.out.println("Choose from 1 to 7: ");
                
        while(true) {
            try{
                Scanner input = new Scanner(System.in);
                
                int choice2 = input.nextInt();
        
                while (choice2 < 1 || choice2 > 7){
                    System.out.println("--------------------------");
                    System.out.println("Invalid Input");
                    System.out.println("Choose only from 1 to 7: ");
                    choice2 = input.nextInt();
                }
        
                while (choice2 > 0 && choice2 < 8){
            
                    if (choice2 == 1) {
                        for (int i = 0; i < Computer.size(); i++) {
                            System.out.println((i+1) + ". " + Computer.get(i) + " by (" + Computerauthor.get(i) + ")"); 
                            }  
                            break;
                    }
                   
                    else if (choice2 == 2) {
                        for (int i = 0; i < Biology.size(); i++) {
                            System.out.println((i+1) + ". " + Biology.get(i) + " by (" + Biologyauthor.get(i) + ")"); 
                            }  
                            break;
                        }
                
                    else if (choice2 == 3) {
                        for (int i = 0; i < Maths.size(); i++) {
                            System.out.println((i+1) + ". " + Maths.get(i) + " by (" + Mathsauthor.get(i) + ")"); 
                            }  
                            break;
                        }
                    
                    else if (choice2 == 4) {
                        for (int i = 0; i < Chemistry.size(); i++) {
                            System.out.println((i+1) + ". " + Chemistry.get(i) + " by (" + Chemistryauthor.get(i) + ")"); 
                            }  
                            break;
                        }
                
                    else if (choice2 == 5) {
                        for (int i = 0; i < Physics.size(); i++) {
                            System.out.println((i+1) + ". " + Physics.get(i) + " by (" + Physicsauthor.get(i) + ")"); 
                            }  
                            break;
                        }
                
                    else if (choice2 == 6) {
                        for (int i = 0; i < English.size(); i++) {
                            System.out.println((i+1) + ". " + English.get(i) + " by (" + Englishauthor.get(i) + ")"); 
                            }  
                            break;
                        }
                
                    else {
                        for (int i = 0; i < Others.size(); i++) {
                            System.out.println((i+1) + ". " + Others.get(i) + " by (" + Othersauthor.get(i) + ")"); 
                            }  
                            break;
                        }  
                }break;
            }
            
            catch(InputMismatchException e){
                System.out.println("""
                                   Invalid input. "
                                   Choose integers only.""");                           
            }
            finally {
                System.out.println("-----------------------------------------------");
            }
        }

        while (true){   
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Continue to Main Menu? \n Press:\n 1 for yes and 2 for no");
                int choice3 = input.nextInt();
                        
                while (choice3 < 1 || choice3 > 2){
                    System.out.println("---------------------------");
                    System.out.println("Invalid Choice. Try Again");
                    choice3 = input.nextInt();
                }
        
                while (choice3 == 1 || choice3 == 2) {
                    if (choice3 == 1) {
                        System.out.println("-----------------------------------------------");
                        newmethod(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                    }
                    else {
                        System.out.println("Program Ended. Thanks to visit Library");
                        System.out.println("-----------------------------------------------");
                        System.exit(0);
                    }
                 }break;                    
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Only integers are allowed.");     
            }
        }
    }       
        
    static void BorrowBook(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {
        
        System.out.println("""
                        From which catagory do you want to borrow a book:
                          1.Computer
                          2.Biology
                          3.Maths
                          4.Chemistry
                          5.Physics
                          6.English
                          7.Others""");

        while (true){        
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Choose from 1 to 7: ");
                int choice2 = input.nextInt();
                
                while (choice2 < 1 || choice2 > 7){
                    System.out.println("---------------------------");
                    System.out.println("Invalid Input");
                    System.out.println("Choose only from 1 to 7: ");
                    choice2 = input.nextInt();
                }
                while (choice2 > 0 && choice2 < 8){
                    if (choice2 == 1) {
                        for (int i = 0; i < Computer.size(); i++) {
                            System.out.println((i+1) + ". " + Computer.get(i) + " by (" + Computerauthor.get(i) + ")"); 
                        }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Computer.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Computer.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Computer.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Computer.size()+1)){
                                    Computer.remove((choice3-1));
                                    Computerauthor.remove((choice3-1));
                                    break;
                                }break;
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }                            
                        }break;
                    }

                    else if (choice2 == 2) {
                        for (int i = 0; i < Biology.size(); i++) {
                            System.out.println((i+1) + ". " + Biology.get(i) + " by (" + Biologyauthor.get(i) + ")"); 
                        }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Biology.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Biology.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Biology.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Biology.size()+1)){
                                    Biology.remove((choice3-1));
                                    Biologyauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   ----------------------------
                                                   Invalid input. 
                                                   Choose integers only.""");
                            }
                        }break;
                    }    

                    else if (choice2 == 3) {
                        for (int i = 0; i < Maths.size(); i++) {
                            System.out.println((i+1) + ". " + Maths.get(i) + " by (" + Mathsauthor.get(i) + ")");
                        }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Maths.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Maths.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Maths.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Maths.size()+1)){
                                    Maths.remove((choice3-1));
                                    Mathsauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   ------------------------------
                                                   Invalid Input
                                                   Choose integers only.""");                                  
                            }
                        }break;
                    }
                        

                    else if (choice2 == 4) {
                        for (int i = 0; i < Chemistry.size(); i++) {
                            System.out.println((i+1) + ". " + Chemistry.get(i) + " by (" + Chemistryauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                               
                                System.out.println("Choice from 1 to "+Chemistry.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Chemistry.size()){
                                    System.out.println("-----------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Chemistry.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Chemistry.size()+1)){
                                    Chemistry.remove((choice3-1));
                                    Chemistryauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");                                        
                            }
                        }break;
                    }

                    else if (choice2 == 5) {
                        for (int i = 0; i < Physics.size(); i++) {
                            System.out.println((i+1) + ". " + Physics.get(i) + " by (" + Physicsauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Physics.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Physics.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Physics.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Physics.size()+1)){
                                    Physics.remove((choice3-1));
                                    Physicsauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }
                        }break;
                    }

                    else if (choice2 == 6) {
                        for (int i = 0; i < English.size(); i++) {
                            System.out.println((i+1) + ". " + English.get(i) + " by (" + Englishauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+English.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > English.size()){
                                    System.out.println("----------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + English.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (English.size()+1)){
                                    English.remove((choice3-1));
                                    Englishauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }
                        }break;
                    }

                    else {
                        for (int i = 0; i < Others.size(); i++) {
                            System.out.println((i+1) + ". " + Others.get(i) + " by (" + Othersauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to borrow: ");
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                            
                                System.out.println("Choice from 1 to "+Others.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Others.size()){
                                    System.out.println("----------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Others.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Others.size()+1)){
                                    Others.remove((choice3-1));
                                    Othersauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }
                        }break;  
                    }
                }
                System.out.println("Book Taken Successfully");
                System.out.println("-----------------------------------------------"); 
                break;
            }    
            catch (InputMismatchException e){
                System.out.println("""
                                    Invalid input. 
                                    Choose integers only.""");
            }             
        }
            
        while (true) {       
            try{
                Scanner input = new Scanner(System.in); 
                System.out.println("Continue? \nPress 1 for yes and 2 for no: ");
                int choice3 = input.nextInt();

                while (choice3 < 1 || choice3 > 2){
                    System.out.println("---------------------------");
                    System.out.println("Invalid Choice. Try Again");
                    choice3 = input.nextInt();
                }

                while (choice3 == 1 || choice3 == 2) {
                    if (choice3 == 1) {
                        newmethod(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);                        
                    }
                    else {
                        System.out.println("Program Ended. Thanks to visit Library");
                        System.out.println("-----------------------------------------------");
                        System.exit(0);
                    }
                }break;
            }
            catch (InputMismatchException e){
                System.out.println("""
                                    Invalid input. 
                                    Choose integers only.""");               
            }
        }
    }
    
    static void AddBook (ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {


        System.out.println("""
                           In which catagory do you want to add the book:
                            1.Computer
                            2.Biology
                            3.Maths
                            4.Chemistry
                            5.Physics
                            6.English
                            7.Others""");
        
        while (true){
            try {
                Scanner in = new Scanner(System.in);
                int choice4 = in.nextInt();

                while (choice4 < 1 || choice4 > 7){
                    System.out.println("Invalid Choice. Choose only betweeen 1 and 7:");
                    choice4 = in.nextInt();
                }
                while (choice4 > 0 && choice4 < 8){
                    System.out.println("Enter book name: ");
                    String choice2 = in.next();
                    System.out.println("Enter author's name: ");
                    String choice3 = in.next();
                    if (choice4 == 1){
                        Computer.add(choice2);
                        Computerauthor.add(choice3);
                        break;
                    }
                    else if (choice4 == 2){
                        Biology.add(choice2);
                        Biologyauthor.add(choice3);
                        break;
                    }
                    else if (choice4 == 3){
                        Maths.add(choice2);
                        Mathsauthor.add(choice3);
                        break;
                    }
                    else if (choice4 == 4){
                        Chemistry.add(choice2);
                        Chemistryauthor.add(choice3);
                        break;
                    }
                    else if (choice4 == 5){
                        Physics.add(choice2);
                        Physicsauthor.add(choice3);
                        break;
                    }
                    else if (choice4 == 6){
                        English.add(choice2);
                        Englishauthor.add(choice3);
                        break;
                    }
                    else {
                        Others.add(choice2);
                        Othersauthor.add(choice3);
                        break;
                    }
                }
                System.out.println("Book Successfully added in Library");
                System.out.println("-----------------------------------------------");
                System.out.println("Continue to Main Menu? \nPress 1 for yes and 2 for no: ");
                
                
                while (true){
                    try {
                        Scanner input = new Scanner(System.in);
                        int choice5 = input.nextInt();
                        while (choice5 < 1 || choice5 > 2){
                            System.out.println("---------------------------");
                            System.out.println("Invalid Choice. Try Again");
                            choice5 = input.nextInt();
                        }

                        while (choice5 == 1 || choice5 == 2) {
                            if (choice5 == 1) {
                                newmethod(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                        Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                            English, Englishauthor, Others, Othersauthor);
                            }
                            else {
                                System.out.println("Program Ended. Thanks to visit Library");
                                System.out.println("-----------------------------------------------");
                                System.exit(0);
                            }
                        }break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("""
                                           ------------------------------
                                           Invalid Input
                                           Choose only Integers.""");                                       
                    }
                }break;
            }    
            catch (InputMismatchException e){
                System.out.println("""
                                   ------------------------------
                                   Invalid Input
                                   Choose only Integers. """);
                                  
            }
        }
    }
    
    static void SearchBook(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {
        
        Scanner input = new Scanner(System.in);

        for (String letter : Computer) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            Computer.set(Computer.indexOf(letter), newValue);
        }
        for (String letter : Biology) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            Biology.set(Biology.indexOf(letter), newValue);
        }
        for (String letter : Maths) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            Maths.set(Maths.indexOf(letter), newValue);
        }
        for (String letter : Chemistry) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            Chemistry.set(Chemistry.indexOf(letter), newValue);
        }
        for (String letter : Physics) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            Physics.set(Physics.indexOf(letter), newValue);
        }
        for (String letter : English) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            English.set(English.indexOf(letter), newValue);
        }
        for (String letter : Others) {
            String newValue = letter.toUpperCase(Locale.ROOT);
            Others.set(Others.indexOf(letter), newValue);
        }
        
        
        System.out.println("Which book would you like to find about? ");
        String choice2 = input.nextLine();
        choice2 = choice2.toUpperCase();
        
        boolean Computer2 = Computer.contains(choice2);
        boolean Biology2 = Biology.contains(choice2);
        boolean Maths2 = Maths.contains(choice2);
        boolean Chemistry2 = Chemistry.contains(choice2);
        boolean Physics2 = Physics.contains(choice2);
        boolean English2 = English.contains(choice2);
        boolean Others2 = Others.contains(choice2);
        
        if (Computer2 == true) {
            int index = Computer.indexOf(choice2);
            System.out.println("Computer related book "
                    +choice2 + " by (" + Computerauthor.get(index) + ") is present");
        }
        else if (Biology2 == true) {
            int index = Biology.indexOf(choice2);
            System.out.println("Biology related book " + choice2 + " by (" + Biologyauthor.get(index) + ") is present");
        }
        else if (Maths2 == true) {
            int index = Maths.indexOf(choice2);
            System.out.println("Maths related book "
                    +choice2 + " by (" + Mathsauthor.get(index) + ") is present");
        }
        else if (Chemistry2 == true) {
            int index = Chemistry.indexOf(choice2);
            System.out.println("Chemistry related book "
                    +choice2 + " by (" + Chemistryauthor.get(index) + ") is present");
        }
        else if (Physics2 == true) {
            int index = Physics.indexOf(choice2);
            System.out.println("Physics related book "
                    +choice2 + " by (" + Physicsauthor.get(index) + ") is present");
        }
        else if (English2 == true) {
            int index = English.indexOf(choice2);
            System.out.println("English book "
                    +choice2 + " by (" + Englishauthor.get(index) + ") is present");
        }
        else if (Others2 == true) {
            int index = Others.indexOf(choice2);
            System.out.println(choice2 + " by ("
                    +Othersauthor.get(index) + ") is present");
        }
        else {
            System.out.println("Sorry, This book is not present in our Library.");
        }
        
        System.out.println("------------------------------");
        System.out.println("Continue to Main Menu? Press:\n 1 for yes or\n 2 to end the program.");
        while (true){
            try {
                Scanner in = new Scanner(System.in);
                int choice5 = in.nextInt();
                while (choice5 < 1 || choice5 > 2){
                    System.out.println("---------------------------");
                    System.out.println("Invalid Choice. Try Again");
                    choice5 = in.nextInt();
                }

                while (choice5 == 1 || choice5 == 2) {
                    if (choice5 == 1) {
                        newmethod(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                    }
                    else {
                        System.out.println("Program Ended. Thanks to visit Library");
                        System.out.println("-----------------------------------------------");
                        System.exit(0);
                    }
                }break;
            }
            catch (InputMismatchException e){
                System.out.println("""
                                    ------------------------------
                                    Invalid Input
                                    Choose only Integers.""");                                       
            }
        }
    }
    
    static void RequestBook(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Name a book You want to request for: ");
        String choice2 = input.nextLine();
        Request.add(choice2);
        CheckRequest(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                        Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor,
                        English, Englishauthor, Others, Othersauthor);
        
        System.out.println("""
                        Your request has been submitted successfully. 
                        You will soon be notified about the progress. """);
        System.out.println("-----------------------------------------------");
        System.out.println("Continue to Main Menu? \nPress 1 for yes and 2 for no: ");

    }
    
    static void CheckRequest(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {
        if (Request.isEmpty()){
            System.out.println("No Request so far.");
        }
        else if (!Request.isEmpty()) {
            System.out.println("You request(s): ");
            for (int i = 0; i < Request.size(); i++){
                System.out.println((i+1) + ". " + Request.get(i));
            }
        }

        System.out.println("Continue to Main Menu?\n Press 1 for Yes. and 2 to No.");
        while(true){
            try{
                Scanner in = new Scanner(System.in);
                int choice5 = in.nextInt();
                while (choice5 < 1 || choice5 > 2){
                    System.out.println("Invalid Choice. Try Again");
                    choice5 = in.nextInt();
                }
        
                while (choice5 == 1 || choice5 == 2) {
                    if (choice5 == 1) {
                        newmethod(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor,
                                English, Englishauthor, Others, Othersauthor);
                    }
                    else {
                        System.out.println("Program Ended. Thanks to visit Library");
                        System.out.println("-----------------------------------------------");
                        System.exit(0);
                    }
                }break;
            }
            catch(InputMismatchException e){
                System.out.println("""
                                   Invalid Input
                                   Put only Integers...""");
            }
        }        
        
    }
    
    static void DeleteBook(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor, 
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor) {
        
        System.out.println("""
                        From which catagory do you want to remove a book:
                          1.Computer
                          2.Biology
                          3.Maths
                          4.Chemistry
                          5.Physics
                          6.English
                          7.Others""");

        while (true){        
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Choose from 1 to 7: ");
                int choice2 = input.nextInt();
                
                while (choice2 < 1 || choice2 > 7){
                    System.out.println("---------------------------");
                    System.out.println("Invalid Input");
                    System.out.println("Choose only from 1 to 7: ");
                    choice2 = input.nextInt();
                }
                while (choice2 > 0 && choice2 < 8){
                    if (choice2 == 1) {
                        for (int i = 0; i < Computer.size(); i++) {
                            System.out.println((i+1) + ". " + Computer.get(i) + " by (" + Computerauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Computer.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Computer.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Computer.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Computer.size()+1)){
                                    Computer.remove((choice3-1));
                                    Computerauthor.remove((choice3-1));
                                    break;                              
                                }break;
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }                            
                        }break;
                    }

                    else if (choice2 == 2) {
                        for (int i = 0; i < Biology.size(); i++) {
                            System.out.println((i+1) + ". " + Biology.get(i) + " by (" + Biologyauthor.get(i) + ")"); 
                        }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Biology.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Biology.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Biology.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Biology.size()+1)){
                                    Biology.remove((choice3-1));
                                    Biologyauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   ----------------------------
                                                   Invalid input. 
                                                   Choose integers only.""");
                            }
                        }break;
                    }    

                    else if (choice2 == 3) {
                        for (int i = 0; i < Maths.size(); i++) {
                            System.out.println((i+1) + ". " + Maths.get(i) + " by (" + Mathsauthor.get(i) + ")");
                        }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Maths.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Maths.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Maths.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Maths.size()+1)){
                                    Maths.remove((choice3-1));
                                    Mathsauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   ------------------------------
                                                   Invalid Input
                                                   Choose integers only.""");                                  
                            }
                        }break;
                    }
                        

                    else if (choice2 == 4) {
                        for (int i = 0; i < Chemistry.size(); i++) {
                            System.out.println((i+1) + ". " + Chemistry.get(i) + " by (" + Chemistryauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                               
                                System.out.println("Choice from 1 to "+Chemistry.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Chemistry.size()){
                                    System.out.println("-----------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Chemistry.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Chemistry.size()+1)){
                                    Chemistry.remove((choice3-1));
                                    Chemistryauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");                                        
                            }
                        }break;
                    }

                    else if (choice2 == 5) {
                        for (int i = 0; i < Physics.size(); i++) {
                            System.out.println((i+1) + ". " + Physics.get(i) + " by (" + Physicsauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");                        
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+Physics.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Physics.size()){
                                    System.out.println("---------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Physics.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Physics.size()+1)){
                                    Physics.remove((choice3-1));
                                    Physicsauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }
                        }break;
                    }

                    else if (choice2 == 6) {
                        for (int i = 0; i < English.size(); i++) {
                            System.out.println((i+1) + ". " + English.get(i) + " by (" + Englishauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                                
                                System.out.println("Choice from 1 to "+English.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > English.size()){
                                    System.out.println("----------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + English.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (English.size()+1)){
                                    English.remove((choice3-1));
                                    Englishauthor.remove((choice3-1));
                                    break;   
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }
                        }break;
                    }

                    else {
                        for (int i = 0; i < Others.size(); i++) {
                            System.out.println((i+1) + ". " + Others.get(i) + " by (" + Othersauthor.get(i) + ")"); 
                            }
                        System.out.println("------------------------------------");
                        System.out.println("Which book do you want to remove: ");
                        while (true) {
                            try {
                                Scanner in = new Scanner(System.in);
                            
                                System.out.println("Choice from 1 to "+Others.size());
                                int choice3 = in.nextInt();

                                while (choice3 < 1 || choice3 > Others.size()){
                                    System.out.println("----------------------------");
                                    System.out.println("Invalid Input");
                                    System.out.println("Choose only from 1 to " + Others.size() + ": ");
                                    choice3 = in.nextInt();
                                }

                                while (choice3 > 0 && choice3 <  (Others.size()+1)){
                                    Others.remove((choice3-1));
                                    Othersauthor.remove((choice3-1));
                                    break;                  
                                }break;                                
                            }
                            catch (InputMismatchException e) {
                                System.out.println("""
                                                   -----------------------------
                                                    Invalid input. 
                                                    Choose integers only.""");
                            }
                        }break;  
                    }
                }
                System.out.println("Book removed Successfully");
                System.out.println("-----------------------------------------------"); 
                break;
            }    
            catch (InputMismatchException e){
                System.out.println("""
                                    Invalid input. 
                                    Choose integers only.""");
            }             
        }
            
        while (true) {       
            try{
                Scanner input = new Scanner(System.in); 
                System.out.println("Continue to Main Menu? \nPress 1 for yes and 2 for no: ");
                int choice3 = input.nextInt();

                while (choice3 < 1 || choice3 > 2){
                    System.out.println("---------------------------");
                    System.out.println("Invalid Choice. Try Again");
                    choice3 = input.nextInt();
                }

                while (choice3 == 1 || choice3 == 2) {
                    if (choice3 == 1) {
                        newmethod(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                    }
                    else {
                        System.out.println("Program Ended. Thanks to visit Library");
                        System.out.println("-----------------------------------------------");
                        System.exit(0);
                    }
                }break;
            }
            catch (InputMismatchException e){
                System.out.println("""
                                    Invalid input. 
                                    Choose integers only.""");               
            }
        }
    }
    
    static void newmethod(ArrayList<String> Request, ArrayList<String> Computer, ArrayList<String> Computerauthor,           
            ArrayList<String> Biology, ArrayList<String> Biologyauthor, ArrayList<String> Maths, 
            ArrayList<String> Mathsauthor, ArrayList<String> Chemistry, ArrayList<String> Chemistryauthor, 
            ArrayList<String> Physics, ArrayList<String> Physicsauthor, ArrayList<String> English, 
            ArrayList<String> Englishauthor, ArrayList<String> Others, ArrayList<String> Othersauthor){
        
        System.out.println("""
                            --------------------------------------- 
                                        (Menu)      
                              1. Display Books
                              2. Borrow a Book
                              3. Add a Book
                              4. Search about a Book
                              5. Request a new Book
                              6. Check your Requests
                              7. Remove a Book permanently
                              8. Exit the program
                            ---------------------------------------
                            Enter Your Choice between 1 and 8 to continue""");
        
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                int choice1 = input.nextInt();
        
                while (choice1 < 1 || choice1 > 8){
                    System.out.println("""
                                       Invalid Input
                                       Choose between 1 and 8.""");
                    choice1 = input.nextInt();
                }
        
                while (choice1 > 0 && choice1 < 9){
                    switch (choice1) {
                        case 1 -> {
                            DisplayBooks(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 2 -> {
                            BorrowBook(Request, Computer, Computerauthor, Biology, Biologyauthor, Maths, 
                                    Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 3 -> {
                            AddBook(Request, Computer, Computerauthor, Biology, Biologyauthor, Maths, 
                                    Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 4 -> {
                            SearchBook(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 5 -> {
                            RequestBook(Request, Computer, Computerauthor, Biology, Biologyauthor,                 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor,
                                    English, Englishauthor, Others, Othersauthor);
                        }
                        
                        case 6 -> {
                            CheckRequest(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);                        
                        }
                        
                        case 7 -> {
                            DeleteBook(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
                            
                        case 8 -> {
                            System.out.println("Program Ended. Thanks to visit the Library");
                            System.out.println("--------------------------------------------");
                            System.exit(0);
                        }         
                    } 
                }
            }
            catch(InputMismatchException e){
                System.out.println("""
                                   Invalid Input
                                   Choose only Integers.""");
            }
        }        
    }
    
    public static void main(String[] args) {
        ArrayList<String> Computer = new ArrayList<>();
        Computer.add("Java");
        Computer.add("Python");
        Computer.add("C++");
        Computer.add("Coding");
        Computer.add("Programming");
        Computer.add("Software");        
        ArrayList<String> Computerauthor = new ArrayList<>();
        Computerauthor.add("Kethy Seira");
        Computerauthor.add("Al Sweigart");
        Computerauthor.add("Stenly B");
        Computerauthor.add("Robart Martin");
        Computerauthor.add("Andy Hunt");
        Computerauthor.add("Ralph Johnson");
 
        ArrayList<String> Biology = new ArrayList<>();
        Biology.add("Pharmacy");
        Biology.add("MBBS");
        Biology.add("Physiology");         
        Biology.add("Biochemistry");
        Biology.add("Anatomy");
        Biology.add("Pharmacology"); 
        ArrayList<String> Biologyauthor = new ArrayList<>();
        Biologyauthor.add("John Ray");
        Biologyauthor.add("Maithus");
        Biologyauthor.add("Charles Darwin");
        Biologyauthor.add("Lamark");
        Biologyauthor.add("Aristotle");
        Biologyauthor.add("Theophrastus");
        
        ArrayList<String> Maths = new ArrayList<>();
        Maths.add("The Dot & the Line");
        Maths.add("Anno's Mysterious Multiplying Jar");
        Maths.add("Grapes");
        Maths.add("Calculus");
        Maths.add("Algebra");
        Maths.add("Discrete Maths"); 
        ArrayList<String> Mathsauthor = new ArrayList<>();
        Mathsauthor.add("Sylvia Nasar");
        Mathsauthor.add("K.C. Cole");
        Mathsauthor.add("The Grapes of Math");
        Mathsauthor.add("Stanislas Dehaene");
        Mathsauthor.add("Reuben Hersh");
        Mathsauthor.add("Paul Hoffman");
        
        ArrayList<String> Chemistry = new ArrayList<>();
        Chemistry.add("Organic Chem");
        Chemistry.add("Inorganic Chem");
        Chemistry.add("Analytical Chem");
        Chemistry.add("A Biography of Water");
        Chemistry.add("Physical Chem");
        Chemistry.add("Quantum Chem");
        ArrayList<String> Chemistryauthor = new ArrayList<>();
        Chemistryauthor.add("Rober C");
        Chemistryauthor.add("Steven Farmar");
        Chemistryauthor.add("Peter Atkins");
        Chemistryauthor.add("Arun Bahl");
        Chemistryauthor.add("Jonathan");
        Chemistryauthor.add("Clayden");
        
        ArrayList<String> Physics = new ArrayList<>();
        Physics.add("Classical Mechanics");
        Physics.add("Thermodynamics");
        Physics.add("Electrical Circuits");
        Physics.add("Nuclear Physics");
        Physics.add("Einstein's Theory");
        Physics.add("Relativity");      
        ArrayList<String> Physicsauthor = new ArrayList<>();
        Physicsauthor.add("Einstein");
        Physicsauthor.add("Maxwell");
        Physicsauthor.add("Tegmark");
        Physicsauthor.add("Timothy");
        Physicsauthor.add("Pedro Ferreira");
        Physicsauthor.add("Al-Khalilli");
        
        ArrayList<String> English = new ArrayList<>();
        English.add("Stylistics");
        English.add("Grammar");
        English.add("Modern English");
        English.add("US Eng vs UK Eng");
        English.add("Vocabulary");
        English.add("Linguistics");
        ArrayList<String> Englishauthor = new ArrayList<>();
        Englishauthor.add("William Shakespeare");
        Englishauthor.add("George Elliot");
        Englishauthor.add("Charlotte");
        Englishauthor.add("Virginia Woolf");
        Englishauthor.add("Geoffrey");
        Englishauthor.add("Orwell");
        
        ArrayList<String> Others = new ArrayList<>();
        Others.add("Imran Khan");
        Others.add("Politics");
        Others.add("Prophet PBUH");
        Others.add("Mughal Empire");
        Others.add("Use of Good Tongue");
        Others.add("Technical Education");    
        ArrayList<String> Othersauthor = new ArrayList<>();
        Othersauthor.add("Mukhtar Azeem");
        Othersauthor.add("General Muhammad");
        Othersauthor.add("Hafiz Ahmad");
        Othersauthor.add("Mirza Ghalib");
        Othersauthor.add("Charles Dickens");
        Othersauthor.add("Austen");
        
        ArrayList<String> Request = new ArrayList<>();

        System.out.println("""
                            ---------------------------------------
                            Welcome to Hussain Library
                            --------------------------------------- 
                                        (Menu)      
                              1. Display Books
                              2. Borrow a Book
                              3. Add a Book
                              4. Search about a Book
                              5. Request a new Book
                              6. Check your Requests
                              7. Remove a Book permanently
                              8. Exit the program
                            ---------------------------------------
                            Enter Your Choice between 1 and 8 to continue""");
        
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                int choice1 = input.nextInt();
        
                while (choice1 < 1 || choice1 > 7){
                    System.out.println("""
                                       Invalid Input
                                       Choose between 1 and 8.""");
                    choice1 = input.nextInt();
                }
        
                while (choice1 > 0 && choice1 < 9){
                    switch (choice1) {
                        case 1 -> {
                            DisplayBooks(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 2 -> {
                            BorrowBook(Request, Computer, Computerauthor, Biology, Biologyauthor, Maths, 
                                    Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 3 -> {
                            AddBook(Request, Computer, Computerauthor, Biology, Biologyauthor, Maths, 
                                    Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 4 -> {
                            SearchBook(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 5 -> {
                            RequestBook(Request, Computer, Computerauthor, Biology, Biologyauthor,                 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor,
                                    English, Englishauthor, Others, Othersauthor);
                        }
                        
                        case 6 -> {
                            CheckRequest(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor,
                                    English, Englishauthor, Others, Othersauthor);
                        }
            
                        case 7 -> {
                            DeleteBook(Request, Computer, Computerauthor, Biology, Biologyauthor, 
                                    Maths, Mathsauthor, Chemistry, Chemistryauthor, Physics, Physicsauthor, 
                                    English, Englishauthor, Others, Othersauthor);
                        }
                            
                        case 8 -> {
                            System.out.println("Program Ended. Thanks to visit the Library");
                            System.out.println("--------------------------------------------");
                            System.exit(0);
                        }         
                    } 
                }
            }
            catch(InputMismatchException e){
                System.out.println("""
                                   Invalid Input
                                   Choose only Integers.""");
            }
        }
    }
}