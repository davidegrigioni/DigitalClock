package cc.davyy.digitalclock;

import cc.davyy.digitalclock.gui.ClockGUI;

import javax.swing.*;

public final class DigitalClock {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClockGUI().setVisible(true));
    }

}