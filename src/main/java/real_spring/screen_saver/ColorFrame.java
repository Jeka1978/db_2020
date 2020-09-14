package real_spring.screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

import static heroes.RandomUtil.getIntBetween;

/**
 * @author Evgeny Borisov
 */

public class ColorFrame extends JFrame {

    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {
        setLocation(getIntBetween(0, 1400), getIntBetween(0, 900));
        getContentPane().setBackground(color);
        repaint();
    }



}
