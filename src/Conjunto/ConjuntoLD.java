package Conjunto;

public class ConjuntoLD implements ConjuntoTDA{
    int[] elementos;
    int cantidad;

    public void InicializarConjunto(){
        elementos = new int[100];
        cantidad = 0;
    }
    public void Agregar(int x){
        if(!this.Pertenece(x)){
            elementos[cantidad] = x;
            cantidad ++;
        }
    }
    public void Sacar(int x){
        int i = 0;
        while(i < cantidad && elementos[i] != x){
            i++;
        }
        if (i < cantidad){
            elementos[i] = elementos[cantidad-1];
            cantidad--;
        }
    }
    public boolean ConjuntoVacio(){
        return cantidad == 0;
    }
    public int Elegir(){
        return elementos[cantidad -1];
    }
    public boolean Pertenece(int x){
        int i = 0;
        while (i < cantidad && elementos[i] != x) {
            i++;
        }
        return(i<cantidad);
    }
    public ConjuntoTDA diferencia(ConjuntoTDA otro){
        ConjuntoLD resultado = new ConjuntoLD();
        resultado.InicializarConjunto();

        for(int i = 0; i < cantidad; i++){
            if(!otro.Pertenece(elementos[i])){
                resultado.Agregar(elementos[i]);
            }
        }
        return resultado;
    }
    public int Suma(){
        int total = 0;
        for(int i = 0; i < cantidad; i++){
            total += elementos[i];
        }
        return total;
    }
    public void Vaciar(){
        cantidad = 0;
    }

    
}
