package ru.bogdanov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailInvocationHandler.class)
public @interface CheckEmail {

    String value() default "xyz.com";

    String message() default "email must end xyz.com";

    // для разбивки аннотаций на группы
    Class<?>[] groups() default {};

    // метаданные клиентов
    Class<? extends Payload>[] payload() default {};

}
