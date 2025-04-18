public class User {
    String userID;
    String name;

    public User (String userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    public String toString (){
        return "User ID: "+ userID+ ", Name: "+ name;
    }
}
