package profilecard;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String phoneNumber;
    private Person(){
    }
    public Person(String firstName, String secondName, int age, String phoneNumber){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        String fullName = firstName + " " + secondName;
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        String result = "Name: " + getName() + " | Age: " + getAge() + " | Phone: " + getPhoneNumber();
        return result;
    }
}
