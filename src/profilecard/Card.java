package profilecard;

public class Card {
    Person person;
    int id;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String result = "ID: " + getId() + " " + person.toString();
        return result;
    }
}
