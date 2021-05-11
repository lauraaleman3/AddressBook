package com.tts;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    //The diamond operators "<" and ">" specify which type of Objects the List will hold
    private List<Entry> listOfEntries;

    public AddressBook() {
        //initialize list of entries
        this.listOfEntries = new ArrayList<>();
    }

    public void add(Entry addressBookEntry) {
        //List.add adds a new Object to a List
        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(String email) {
        //List.remove(int index) removes a object at the given index

        listOfEntries.removeIf(e->e.getEmail().equals(email));

    }

    // To search for first name
    public void firstName(String fName) {

        this.listOfEntries.stream().filter(e->e.getfName().equals(fName)).forEach(System.out::println);
    }
    // To search for last name
    public void lastName(String lName) {

        this.listOfEntries.stream().filter(e->e.getlName().equals(lName)).forEach(System.out::println);
    }
    // To search for phone number
    public void phoneNumber(String phoneNum) {

        this.listOfEntries.stream().filter(e->e.getPhoneNum().equals(phoneNum)).forEach(System.out::println);
    }

// To search for email
    public void look(String email) {
        //List.get(int index) returns the object at the given index
        this.listOfEntries.stream().filter(e->e.getEmail().equals(email)).forEach(System.out::println);
    }


    public Entry[] viewAll() {
        //create a new array with the size of our list
        Entry[] result = new Entry[this.listOfEntries.size()];

        //List.toArray(Arr[] array) fills our array with data from the list
        this.listOfEntries.toArray(result);

        //return the filled array
        return result;
    }
    public void deleteAll(){
        this.listOfEntries.removeAll(listOfEntries);
    }
}