package anotar;

import java.lang.reflect.Method;

public class ProcesadorAnotaciones {
    public static void main(String[] args) throws Exception {
        Method metodo = Miclase.class.getMethod("miMetodo");
        if (metodo.isAnnotationPresent(Mianotacion.class)) {
            Mianotacion anotacion = metodo.getAnnotation(Mianotacion.class);
            System.out.println("Valor: " + anotacion.valor());
            System.out.println("Número: " + anotacion.numero());
        }
    }
}