public class Libro {
    // Atributos (Privados para proteger la información)
    private String titulo;
    private String autor;
    private int paginas;
    private String resumen;
    private boolean disponible;

    // Constructor: Se ejecuta al crear el objeto (new Libro)
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.resumen = "Sin resumen disponible.";
        this.disponible = true; // Por defecto, un libro nuevo está disponible
    }

    // Métodos para interactuar con el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Has tomado prestado: " + titulo);
        } else {
            System.out.println("Lo siento, " + titulo + " ya está prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Has devuelto: " + titulo + ". ¡Gracias!");
    }

    public void fichaLibro() {
        System.out.println("----- FICHA DEL LIBRO -----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        System.out.println("---------------------------");
    }

    // Getters y Setters (Necesarios para acceder a datos privados)
    public String getTitulo() { return titulo; }
    public void setResumen(String resumen) { this.resumen = resumen; }
}