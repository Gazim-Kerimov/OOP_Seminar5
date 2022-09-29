package profilecard;

import cardlist.CardList;
import filemanager.FileManager;

import java.io.IOException;

public class CardManager implements UserInput{
    CardCreator creator;
    Finder finder;
    FileManager fileManager;
    private static CardManager instance;
    private CardManager() throws IOException {
        creator = new CardCreator();
        finder = new Finder();
        fileManager = new FileManager();
    }
    public static CardManager getInstance() throws IOException {
        if(instance == null){
            instance = new CardManager();
        }
        return instance;
    }
    public void start() throws IOException {
        while(true){
            System.out.println("1 - добавление нового контакта \n" +
                               "2 - поиск контакта в справочнике \n" +
                               "3 - импорт/экспорт справочника в файл \n" +
                               "4 - показать весь справочник \n" +
                               "5 - выход из программы");
            String userChoice = reader.readLine();
            if (userChoice.equals("5")){
                break;
            }
            switch (userChoice){
                case "1":
                    creator.createNewCard();
                    break;
                case "2":
                    finder.find();
                    break;
                case "3":
                    fileManager.manage();
                    break;
                case "4":
                    CardList.getInstance().showAll();
                    break;
                default:
                    System.out.println("Введен некорректный запрос. Попробуйте снова");
                    break;
            }
        }
    }


}
