import java.util.ArrayList;
import java.util.Locale;

public class Database {
    private ArrayList<User> userDatabase = new ArrayList<>();

    public void addUserToDatabase(User user) throws UserAlreadyExistExseption{
        if (userDatabase.contains(user)){
            throw new UserAlreadyExistExseption("This person is already on the base");
        }
        else {
            userDatabase.add(user);
            System.out.println(user.getFirstName() + " - added to database");
        }
    }

    public void removeUserFromDatabase(User user) throws UserAlreadyExistExseption{
        if (userDatabase.contains(user)){
            userDatabase.remove(user);
            System.out.println(user.getFirstName() + " - removed from database");
        }
        else {
            throw new UserAlreadyExistExseption("This person is not in the database");
        }
    }

    public ArrayList<User> getUsersByCity(City city){
        ArrayList<User> userInCity = new ArrayList<>();
        for (User user: userDatabase){
            if (user.getCity().equals(city)){
                userInCity.add(user);
            }
        }
        return userInCity;
    }

    public ArrayList<User> getUsersByFirstName(String firstName){
        ArrayList<User> userFirstName = new ArrayList<>();
        firstName = firstName.toLowerCase(Locale.ROOT);
        for (User user: userDatabase){
            if (user.getFirstName().toLowerCase(Locale.ROOT).contains(firstName)){
                userFirstName.add(user);
            }
        }
        return userFirstName;
    }

    public ArrayList<User> getUsersByLastName(String lastName){
        ArrayList<User> userLastName = new ArrayList<>();
        lastName = lastName.toLowerCase(Locale.ROOT);
        for (User user: userDatabase){
            if (user.getLastName().toLowerCase(Locale.ROOT).contains(lastName)){
                userLastName.add(user);
            }
        }
        return userLastName;
    }

    public ArrayList<User> getUsersByAge(int startAge, int endAge){
        ArrayList<User> userAge = new ArrayList<>();
        for (User user: userDatabase){
            if (user.getAge() >= startAge && user.getAge() <= endAge){
                userAge.add(user);
            }
        }
        return userAge;
    }
}
