/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */

import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import view.user.UserLogin;

/**
 * main -- main class to run system
 * @author Isurunath
 */
public class main {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ParseException {
        UserLogin login = new UserLogin();
        login.setExtendedState(JFrame.MAXIMIZED_BOTH);
        login.setVisible(true);
    }
}
