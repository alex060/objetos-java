public class Cafetera {
    private String modelo;
    private int capacidadMaxima; // 1000 ml
    private int cantidadAguaActual;
    private boolean tieneCapsula;

    public Cafetera(String modelo) {
        this.modelo = modelo;
        this.capacidadMaxima = 1000;
        this.cantidadAguaActual = 0; // Empieza vacía
        this.tieneCapsula = false;   // Sin cápsula
    }

    public void echarAgua(int cantidad) {
        if (cantidadAguaActual + cantidad > capacidadMaxima) {
            cantidadAguaActual = capacidadMaxima;
            System.out.println("Depósito lleno al máximo (1000ml).");
        } else {
            cantidadAguaActual += cantidad;
            System.out.println("Agua añadida. Nivel actual: " + cantidadAguaActual + "ml.");
        }
    }

    public void ponerCapsula() {
        this.tieneCapsula = true;
        System.out.println("Cápsula insertada correctamente.");
    }

    public void hacerCafe() {
        // Necesitamos al menos 200ml para un café estándar
        if (cantidadAguaActual < 200) {
            System.out.println("Falta Agua");
        } else if (!tieneCapsula) {
            System.out.println("Falta capsula");
        } else {
            cantidadAguaActual -= 200;
            tieneCapsula = false; // La cápsula se gasta
            System.out.println("¡Café listo! Disfruta tu " + modelo);
        }
    }
}
