package ticket.booking.services;

import java.util.Objects;

public class UserServiceUtil {
    public static Boolean checkPassword(String p1, String p2){
        return Objects.equals(p1, p2);
    }
}
