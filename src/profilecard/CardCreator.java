package profilecard;

import cardlist.CardList;
import java.io.IOException;

public class CardCreator implements UserInput{
    public void createNewCard() throws IOException {
        System.out.println("Введите имя нового контакта: ");
        String firstName = reader.readLine();
        System.out.println("Введите фамилию нового контакта: ");
        String secondName = reader.readLine();
        System.out.println("Введите возраст нового контакта: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Введите номер телефона: ");
        String phoneNumber = reader.readLine();
        Person person = new Person(firstName,secondName,age,phoneNumber);
        Card card = new Card();
        card.setPerson(person);
        card.setId(Id.getId());
        CardList.getInstance().addCard(card.toString());
        System.out.println("Довблена новая запись:\n" + card.toString());
    }

}
