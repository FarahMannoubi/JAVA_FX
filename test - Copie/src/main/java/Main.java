
import models.User;
import services.UserService;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        UserService ps = new UserService();

        try {
            ps.ajouter(new User( "Foulen", "Ben Foulen",24));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        try {
            ps.modifier(new User(1, "Test", "Test", 24));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            System.out.println(ps.recuperer());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }



}
