package appLayer;

public class User {
    public boolean isValidUserCredentials(String sUserName, String sUserPassword) {
        if (sUserName.equals("adam") && sUserPassword.equals("1234"))
            return true;
        else return false;
    }
}
