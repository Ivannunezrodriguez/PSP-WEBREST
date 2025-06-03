package prueba;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)   //permite que la anotación @Autor esté disponible en tiempo de ejecución.
public @interface Autor {
    String nombre() default "Telefónica";
    String direccion() default "Distrito Telefónica";
}
