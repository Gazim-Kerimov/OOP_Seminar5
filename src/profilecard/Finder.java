package profilecard;

import cardlist.CardList;
import java.io.IOException;

public class Finder implements UserInput{
    public void find() throws IOException {
        System.out.println("1 - поиск по имени и фамилии\n2 - поиск по ID\n3 - показать весь справочник" );
        String userChoice = reader.readLine();
        if(userChoice.equals("1")){
            System.out.println("Введите имя и фамилию контакта через пробел: ");
            String inputFullName = reader.readLine();
            CardList.getInstance().getInfoByName(inputFullName);
        }
        else if(userChoice.equals("2")){
            System.out.println("Введите ID контакта: ");
            int inputId = Integer.parseInt(reader.readLine());
            CardList.getInstance().getInfoById(inputId);
        }
        else if(userChoice.equals("3")){
            CardList.getInstance().showAll();
        }
        else System.out.println("Ошибка в запросе!");
    }
}
