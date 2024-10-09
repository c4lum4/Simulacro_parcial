package DM;

import Conjunto.ConjuntoLD;
import Conjunto.ConjuntoTDA;

public class DM_IMPL {
    int[][] valores;
    int[] claves;
    int indice;

    public void incializarDiccionario(){
        claves = new int[100];
        valores = new int[100][100];
        indice = 0;
    }
    public void agregar(int clave , int valor){
        int pos = buscarClave(clave);
        if(pos == -1){
            claves[indice] = clave;
            valores[indice][0] = valor;
            indice ++;
        }else{
            int j = 0;
            while (valores[pos][j]!= 0) {
                j++;
            }
            valores[pos][j] = valor;
        }

    }
    public void eliminarClave(int clave) {
        int pos = buscarClave(clave);
        if (pos != -1) {
            claves[pos] = claves[indice - 1];
            valores[pos] = valores[indice - 1];
            indice--;
        }
    }
    public void eliminarValor(int clave, int valor) {
        int pos = buscarClave(clave);
        if (pos != -1) {
            int j = 0;
            while (j < valores[pos].length && valores[pos][j] != valor) {
                j++;
            }
            if (j < valores[pos].length) {
                valores[pos][j] = 0; // Elimina el valor.
            }
        }
    }
    public ConjuntoTDA claves() {
        ConjuntoTDA conjunto = new ConjuntoLD();
        conjunto.InicializarConjunto();
        for (int i = 0; i < indice; i++) {
            conjunto.Agregar(claves[i]);
        }
        return conjunto;
    }
    public ConjuntoTDA valores(int clave) {
        ConjuntoTDA conjunto = new ConjuntoLD();
        conjunto.InicializarConjunto();
        int pos = buscarClave(clave);
        if (pos != -1) {
            for (int i = 0; i < valores[pos].length; i++) {
                if (valores[pos][i] != 0) {
                    conjunto.Agregar(valores[pos][i]);
                }
            }
        }
        return conjunto;
    }



    private int buscarClave(int clave){
        for(int i = 0; i < indice; i++){
            if(claves[i] == clave){
                return i;
            }
        }
        return -1;
    }
}