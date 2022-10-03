package profilecard;

import cardlist.CardList;

public class Id {
        private static int id;
    public static int getId(){
        if(CardList.getInstance().getList().isEmpty()){
            id = 0;
        }
        else {
            int lastIndex = CardList.getInstance().getList().size() - 1;
            id = CardList.getInstance().getList().get(lastIndex).getId() + 1;
        }
        return id;
    }
}
