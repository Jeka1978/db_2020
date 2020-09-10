package real_spring.screen_saver;

import heroes.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

import static heroes.RandomUtil.getIntBetween;

/**
 * @author Evgeny Borisov
 */
@Component
public class ColorFrame extends JFrame {

    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {

        color = getColorBean();
        setLocation(getIntBetween(0,1400),getIntBetween(0,900));
        getContentPane().setBackground(color);
        repaint();
    }

    @Lookup
    protected Color getColorBean() {
        return null;
    }


}
