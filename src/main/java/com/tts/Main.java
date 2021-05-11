package com.tts;
import java.nio.charset.StandardCharsets;
import java.util.*;
import com.tts.AddressBook;



public class Main extends Entry {
    public static int entryInput;


    public static void main(String[] args) {
        AddressBook newAddy = new AddressBook();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        do {
// Main menu with options
            System.out.println("********************\n1) Add an entry\n" +
                    "2) Remove an entry\n" +
                    "3) Search for a specific entry\n" +
                    "4) Print Address Book\n" +
                    "5) Delete Book\n" +
                    "6) Quit\n" +
                    "Please choose what you'd like to do with the database:\n********************");
            entryInput = sc.nextInt();
// 1 Add Entry
            if (entryInput == 1) {
                Entry newEntry = new Entry();
                System.out.println("Enter first name: ");
                newEntry.setfName(sc.next());
                System.out.println("Enter last name: ");
                newEntry.setlName(sc.next());
                System.out.println("Enter email: ");
                newEntry.setEmail(sc.next());
                System.out.println("Enter phone number: ");
                newEntry.setPhoneNum(sc.next());
                newAddy.add(newEntry);
                System.out.println("Added entry!");


// 2 Delete option
            } else if (entryInput == 2) {
                System.out.println("Please enter the email you'd like to remove.");

                String input = sc.next();
//                System.out.println("Deleting the following entry:\n" + (newAddy.get(input)));
                newAddy.delete(input);


//                int deleteNumber = sc.nextInt();
//                System.out.println("Deleted the following entry:\n" +(newAddy.get(deleteNumber - 1)));
//                newAddy.delete(deleteNumber - 1);



// 3 Search option
            } else if (entryInput == 3) {
                System.out.println("***Searching***");
//                System.out.println("Please choose how you'd like to search the database: 3\n" +
//                        "1) First Name\n" +
//                        "2) Last Name\n" +
//                        "3) Phone Number\n" +
//                        "4) Email Adress\n ");
                System.out.println("Enter email: \n");
                String search = sc.next();
                System.out.println("Search Results: ");
                newAddy.look(search);


// 4 Print option
            } else if (entryInput == 4) {
                System.out.println("***Printing Address Book***");
                Entry[] listOfEntries = newAddy.viewAll();

                for (int i = 0; i < listOfEntries.length; i++) {
                    System.out.println(listOfEntries[i].toString());
                }

// 5 Delete option
            } else if (entryInput == 5) {
                System.out.println("***Deleting Book***");
//                newAddy = null;
                newAddy.deleteAll();
                System.out.println("Address book has been successfully cleared.");


            } else if(entryInput > 6 | entryInput < 1){
                System.out.println("***Invalid response, please try again.***");
            }

        }
// 6 Exit option
        while (entryInput != 6);
        System.out.println("Good Bye!");
    }

}