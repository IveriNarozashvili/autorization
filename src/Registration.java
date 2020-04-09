

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws Exception {
        List<User> users = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        User user = new User();
        System.out.println("Your nick:");
        user.setNick(in.nextLine());
        System.out.println("Your password:");
        user.setPassword(in.nextLine());

        System.out.println("You have been registration!");
        System.out.println("Nick: " + user.getNick());
        System.out.println("Password: " + user.getPassword());
        users.add(user);

        user = new User();
        System.out.println("Your nick:");
        user.setNick(in.nextLine());
        System.out.println("Your password:");
        user.setPassword(in.nextLine());
        for (User u : users) {
            if (u.equals(user)) {
                System.out.println("Вы авторизованы");
            }
        }
    }
}


