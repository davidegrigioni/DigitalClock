package cc.davyy.digitalclock.gui;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockGUI extends JFrame {

    private final JLabel timeLabel;

    public ClockGUI() {
        setTitle("Digital Clock");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Sans Serif", Font.BOLD, 40));
        add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        updateClock();
    }

    private void updateClock() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        timeLabel.setText(formatter.format(date));
    }

}