package prueba;
//import prueba.Autor;
public class Principal {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException
    {
        Coche miCoche = new Coche("Ford", "Fiesta");
        System.out.println(miCoche);
// Accediendo a los datos de la anotación del método.
        Autor a1 = miCoche.getClass().getMethod("acelerar").getAnnotation(Autor.class);
        System.out.println("Nombre autor: " + a1.nombre());
        System.out.println("Dirección autor: " + a1.direccion());
// Accediendo a los datos de la anotación de la clase.
        Autor a2 = miCoche.getClass().getAnnotation(Autor.class);
        System.out.println("Nombre autor: " + a2.nombre());
        System.out.println("Dirección autor: " + a2.direccion());
    }
}