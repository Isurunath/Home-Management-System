package utility;

import java.lang.annotation.*;
import javax.validation.*;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GroupNameComboBoxValidator.class)
@Documented

/**
 *
 * @author Nimanthika
 */
public @interface GroupNameRequired {
    
    String value = "Please select the group";

    String message() default "Please select the group";

    Class<?>[]groups() default {};

    Class<? extends Payload>[]payload() default {};
}
