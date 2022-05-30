import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        User user1 = new User("Володя","Бурак",40,City.LONDON);
        User user2 = new User("Коля","Вечер",30,City.SEUL);
        User user3 = new User("Илья","Макаров",40,City.MINSK);

        Database database = new Database();

        try {
            database.addUserToDatabase(user1);
            database.addUserToDatabase(user2);
            database.addUserToDatabase(user3);
            database.addUserToDatabase(user1);
        } catch (UserAlreadyExistExseption e) {
            e.printStackTrace();
        }

//        try {
//            database.removeUserFromDatabase(user1);
//            database.removeUserFromDatabase(user2);
//            database.removeUserFromDatabase(user3);
//            database.removeUserFromDatabase(user3);
//        } catch (UserAlreadyExistExseption e) {
//            e.printStackTrace();
//        }

        System.out.println(database.getUsersByCity(City.LONDON));
        System.out.println(database.getUsersByFirstName("Коля"));
        System.out.println(database.getUsersByLastName("Вечер"));
        System.out.println(database.getUsersByAge(20,30));

    }
}
