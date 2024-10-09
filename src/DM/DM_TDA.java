package DM;
import Conjunto.*;

public interface DM_TDA {

    void incializarDiccionario();
    void agregar(int clave , int valor);
    void eliminarClave(int clave);
    void eliminarValor(int valor);
    ConjuntoTDA claves();
    ConjuntoTDA valores(int clave);
}