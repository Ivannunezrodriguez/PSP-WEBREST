package anotar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define la anotación
@Target(ElementType.METHOD)  // Aplica a métodos
@Retention(RetentionPolicy.RUNTIME)  // Disponible en tiempo de ejecución
public @interface Mianotacion {
    String valor() default "Por defecto";
    int numero() default 1;
}
