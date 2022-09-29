package cardlist;
import java.util.ArrayList;

public class CardList {
    ArrayList<String> cardList;
    private static CardList instance;
    private CardList(){
        cardList = new ArrayList<>();
    }
    public static CardList getInstance(){
        if(instance == null){
            instance = new CardList();
        }
        return instance;
    }
    public void addCard(String card){
        cardList.add(card);
    }
    public void getInfoByName(String name){
        int tempId = -1;
        for (int i = 0; i < cardList.size(); i++) {
            String tempCard = cardList.get(i);
            if(tempCard.contains("Name: " + name)){
                tempId = i;
            }
        }
        if(tempId == -1){
            System.out.println("Данного пользователя нет в списке контактов");
        }
        else System.out.println(cardList.get(tempId));
    }
    public void getInfoById(int id){
        int tempId = -1;
        for (int i = 0; i < cardList.size(); i++) {
            String tempCard = cardList.get(i);
            if(tempCard.contains("ID: " + id)){
                tempId = i;
            }
        }
        if(tempId == -1){
            System.out.println("Данного пользователя нет в списке контактов");
        }
        else System.out.println(cardList.get(tempId));
    }
    public void showAll(){
        for (int i = 0; i < cardList.size(); i++) {
            System.out.println(cardList.get(i));
        }
    }
    public ArrayList<String> getList(){
        return cardList;
    }


}
