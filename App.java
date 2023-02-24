package MP1;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        GameZone gamezone = new GameZone();
        window.setBounds(100, 100, 700, 600);
        window.setTitle("BrickBreaker");
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(gamezone);

    }
}