package src.main;


import javax.swing.*;
import java.awt.*;

public class Login {

    JFrame loginView;
    JButton adminButton, librarianButton;

    Login(){

        loginView = new JFrame();
        loginView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginView.setLayout(new BorderLayout());

        adminButton = new JButton("Admin Login");

        librarianButton = new JButton("Librarian Login");


        loginView.add(adminButton, BorderLayout.SOUTH);
        loginView.add(librarianButton, BorderLayout.CENTER);
        loginView.setVisible(true);
    }
}
