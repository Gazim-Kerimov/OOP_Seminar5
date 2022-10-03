package cardlist;
import profilecard.Card;

import java.util.ArrayList;

public class CardList {
    ArrayList<Card> cardList;
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
    public void addCard(Card card){
        cardList.add(card);
    }
    public void getInfoByName(String name){
        int tempId = -1;
        for (int i = 0; i < cardList.size(); i++) {
            String tempCard = cardList.get(i).toString();
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
            String tempCard = cardList.get(i).toString();
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
        if(cardList.isEmpty()) System.out.println("Список пуст");
        else {
            for (int i = 0; i < cardList.size(); i++) {
                System.out.println(cardList.get(i));
            }
        }
    }
    public ArrayList<Card> getList(){
        return cardList;
    }


}
