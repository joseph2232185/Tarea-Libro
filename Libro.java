public class Libro {
    // Atributos
    String titulo;
    String autor;
    double precio;
    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.precio = 0.0;
    }

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }

    // Método para actualizar el precio del libro
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("Precio actualizado a $" + nuevoPrecio);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();

        Libro libro2 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 25.99);

        libro2.mostrarDetalles();
        libro2.actualizarPrecio(29.99);
    }
}