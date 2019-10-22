package fr.shinco.main.frames;

import fr.shinco.main.panels.MainPanel;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainPanel mainPanel;

    public MainFrame(){
        this.setTitle("Algorithme Génétique");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel = new MainPanel());
        this.setVisible(true);
    }
}
