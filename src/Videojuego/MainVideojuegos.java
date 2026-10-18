package Videojuego;

public class MainVideojuegos {
    static void main() {
        videojuego p1= new videojuego();
        videojuego p2= new videojuego();

        p1.precio= 256;
        p1.nombre= "celular";
        p1.categoria= "movil";

        p2.precio= 670;
        p2.nombre= "compu";
        p2.categoria= "pc";

        p1.mostrarinformacion();
        p2.mostrarinformacion();
    }
}
