package Conjunto;

public interface ConjuntoTDA {
    void InicializarConjunto();
    void Agregar(int x);
    void Sacar(int x);
    boolean ConjuntoVacio();
    int Elegir();
    boolean Pertenece(int x);
    ConjuntoTDA diferencia(ConjuntoTDA otro);
    int Suma();
    void Vaciar();
}
