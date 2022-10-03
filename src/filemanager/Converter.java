package filemanager;

import profilecard.Card;
import profilecard.Person;


public class Converter {
    public Card convertToCard(String line){
        String[] list =  line.split("\\|");
        int id = Integer.parseInt(list[0].replace("ID: ",""));
        String fullName = list[1].replace("Name: ", "");
        String firstName = fullName.split(" ")[0];
        String secondName = fullName.split(" ")[1];
        int age = Integer.parseInt(list[2].replace("Age: ",""));
        String phoneNumber = list[3].replace("Phone: ", "");
        Person person = new Person(firstName,secondName,age,phoneNumber);
        Card card = new Card();
        card.setPerson(person);
        card.setId(id);
        return card;
    }
}
