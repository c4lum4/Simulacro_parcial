package Pila;

public class Pila_IMPL implements PilaTDA{
    int[] elementos;
    int indice;

    public void inicializarPila(){
        elementos = new int[100];
        indice = 0;
    }
    public void apilar(int x){
        elementos[indice] = x;
        indice ++;
    }
    public void desapilar(){
        if(!pilaVacia()){
            indice --;
        }
    }
    public int tope(){
        return elementos[indice -1];
    }
    public boolean pilaVacia(){
        return indice == 0;
    }
}