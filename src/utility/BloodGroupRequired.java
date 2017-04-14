package utility;

import java.lang.annotation.*;
import javax.validation.*;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BloodGroupComboBoxValidator.class)
@Documented

/**
 *
 * @author Nimanthika
 */
public @interface BloodGroupRequired {
    
    String value = "Please select the blood group";

    String message() default "Please select the blood group";

    Class<?>[]groups() default {};

    Class<? extends Payload>[]payload() default {};
}
