package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {


    public ColorFrame(final int counter) throws HeadlessException {
        super("MY FRAME");
        initContent(new int[]{1});
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initContent(final int[] counter) {
        JButton button = new JButton("click me");

        button.addActionListener(e -> {
            getContentPane().setBackground(Color.RED);
            System.out.println(counter[0]++);
        });



        this.getContentPane().add(button, BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        new ColorFrame(2);
    }

}
