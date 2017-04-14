/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import javax.validation.*;

/**
 *
 * @author Nimanthika
 */
public class  SecQuesComboBoxValidator implements ConstraintValidator<SecQuestionRequired, String> {

    private String value;

    @Override
    public void initialize(SecQuestionRequired arg0) {
        this.value = arg0.value;
    }

    @Override
    public boolean isValid(String question, ConstraintValidatorContext arg1) {
        if(question.equalsIgnoreCase(value)){
            return false;
        }
        return true;
    }
}
