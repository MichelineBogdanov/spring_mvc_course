package ru.bogdanov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// необходимо реализовать интерфейс ConstraintValidator (@Constraint(validatedBy = CheckEmailInvocationHandler.class))
// <A extends Annotation, T> A - аннотация, T - тип данных к которому будем применять валидацию
public class CheckEmailInvocationHandler implements ConstraintValidator<CheckEmail, String> {

    private String endOfEmail;

    // тут получаем условие проверки
    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    // логика проверки
    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
