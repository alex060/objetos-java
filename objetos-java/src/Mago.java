public class Mago {
    private String nombre;
    private int vida;
    private int energia;
    private int poder;

    public Mago(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
        this.vida = 100;
        this.energia = 50;
    }

    public void lanzarHechizo(Mago objetivo) {
        if (this.energia >= 10) {
            this.energia -= 10;
            // Aplicamos el daño al objeto 'objetivo'
            objetivo.recibirDanio(this.poder);
            System.out.println("[" + this.nombre + "] lanza hechizo a [" + objetivo.getNombre() + "] y le hace " + this.poder + " de daño");
        } else {
            System.out.println("[" + this.nombre + "] está agotado y no puede realizar el ataque");
        }
    }

    // Método auxiliar para que el mago atacado baje su vida
    public void recibirDanio(int danio) {
        this.vida -= danio;
        if (this.vida < 0) this.vida = 0;
    }

    public void meditar() {
        this.energia += 20;
        if (this.energia > 50) this.energia = 50;
        System.out.println(nombre + " ha meditado. Energía restaurada.");
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    // Getters básicos
    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
}