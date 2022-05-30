public class UserAlreadyExistExseption extends Exception {

    private String details;

    public UserAlreadyExistExseption (String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return  details;
    }
}
