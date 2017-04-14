/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package utility;

import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * Validations -- All project form validation are handle in here
 * @author Isurunath
 */
public class Validations {

    /**
     * Validate Objects
     * @param e
     * @return true or false 
     */
    public static boolean Validate(Object e){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(e);
        String Er = null;

        if(!constraintViolations.isEmpty()){
            for(ConstraintViolation<Object> error : constraintViolations){
                Er = error.getMessage();
                //System.out.println(error.getPropertyPath()+"::"+error.getMessage());
                //.showMessageDialog(null, error.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, Er, "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
    
    /**
     * Check weather value exist before adding to table
     * @param id
     * @param table
     * @return 
     */
    public static boolean checkExist(String id, DefaultTableModel table){
        String value;
        for(int i=0;i<table.getRowCount();i++){
            value = table.getValueAt(i, 0).toString();
            if(value.equals(id)){
                JOptionPane.showMessageDialog(null,"Already Added","ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true; 
    }
    
    
    private static boolean checkInt(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean checkDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void validateInt(JTextField txt) {
        try {
            String s = txt.getText();
            while (!checkInt(s)) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }

        } catch (Exception e) {
        }
    }

    public static void validateInt(JTextField txt, int length) {
        try {
            String s = txt.getText();
            while (!checkInt(s)) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }
            if (s.length() > length) {
                String s1 = s.substring(0, length);
                txt.setText(s1);
            }
        } catch (Exception e) {
        }
    }

    public static void validateDouble(JTextField txt) {
        try {
            String s = txt.getText();
            while (!checkDouble(s)) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }

        } catch (Exception e) {
        }
    }

    private static boolean checkString(String s) {
        try {
            Long.parseLong(s);
            return false;
        } catch (Exception ex) {
            return true;
        }
    }

    public static void validateString(JTextField txt) {
        try {
            String s = txt.getText();

            while (!checkString(s.substring(s.length() - 1, s.length()))) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }

        } catch (Exception e) {
        }
    }


    public static void validateString(JTextField txt,int length) {
        try {
            String s = txt.getText();

            while (!checkString(s.substring(s.length() - 1, s.length()))) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }

            if (s.length() > length) {
                String s1 = s.substring(0, length);
                txt.setText(s1);
            }

        } catch (Exception e) {
        }
    }

    public static void validateString(JTextArea txt) {
        try {
            String s = txt.getText();

            while (!checkString(s.substring(s.length() - 1, s.length()))) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }

        } catch (Exception e) {
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}

    

