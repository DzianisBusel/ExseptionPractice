public class User {

    private String firstName;
    private String lastName;
    private int age;
    private City city;

    public User(String firstName, String lastName, int age, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User: " +
                "firstName = " + firstName  +
                ", lastName = " + lastName  +
                ", age = " + age +
                ", city = " + city;
    }
}
