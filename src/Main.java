import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        Panel panel = new Panel();
        JButton button = new JButton("Color Chooser");
        JLabel label = new JLabel("Hello World");
        panel.setBackground(Color.WHITE);
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);

        System.out.println("Hello world!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button){
                    JColorChooser colorChooser = new JColorChooser();
                    Color color = JColorChooser.showDialog(null,"Pick a Color", Color.BLACK);
                    panel.setBackground(color);
                }
            }
        });



    }
}