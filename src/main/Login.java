package src.main;


import javax.swing.*;
import java.awt.*;

public class Login {

    JFrame loginView;
    JButton adminButton, librarianButton;

    Login(){

        loginView = new JFrame();
        loginView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginView.setLayout( new GridBagLayout() );


        adminButton = new JButton("Admin Login");
        adminButton.setPreferredSize(new Dimension(300,200));
        adminButton.setFont(new Font("Arial", Font.PLAIN, 40));

        librarianButton = new JButton("Librarian Login");
        librarianButton.setPreferredSize(new Dimension(300,200));
        librarianButton.setFont(new Font("Arial", Font.PLAIN, 40));

        loginView.add(adminButton, new GridBagConstraints());
        loginView.add(librarianButton, new GridBagConstraints());
        loginView.pack();
        loginView.setSize(500,600);

        loginView.setVisible(true);
    }
}
