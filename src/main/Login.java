package src.main;


import javax.swing.*;
import java.awt.*;

public class Login {

    JFrame loginView;
    JButton adminButton, librarianButton;

    Login(){

        loginView = new JFrame();
        loginView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginView.getContentPane().setLayout(new BoxLayout(loginView.getContentPane(), BoxLayout.Y_AXIS));

        adminButton = new JButton("Admin Login");
        adminButton.setPreferredSize(new Dimension(300,200));

        librarianButton = new JButton("Librarian Login");
        librarianButton.setPreferredSize(new Dimension(300,200));


        loginView.add(adminButton);
        loginView.add(librarianButton);
        loginView.pack();
        loginView.setSize(500,600);

        loginView.setVisible(true);
    }
}
