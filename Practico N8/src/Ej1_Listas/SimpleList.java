package Ej1_Listas;

import java.util.List;
import java.util.Objects;

public interface SimpleList {
    int size(); //Cantidad de elementos
    boolean isEmpty(); //true si la lista no contiene elementos, false si tiene
    boolean contains(Object element); //true si la lista contiene al objeto
    void add(int index, Object element); //Agrega objeto al final de la lista

    /* Object add(int index, Object element);
    Agrega el objeto element en la posición index pasada como parámetro.
    Se realizan los corrimientos necesarios con los elementos posteriores
    a dicha posición. Si la posición index no existe retorna null, caso
    contrario retorna el mismo objeto agregado.*/

    Object set(int index, Object element);
    /*
    Similar al método anterior, pero se sobreescribe el elemento existente
    en la posición index. El elemento que anteriormente ocupaba la
    posición index es retornado al usuario. Si la posición index no existe
    retorna null.
     */

    boolean remove(int index); //elimina objeto de la posicion index y lo retorna
    //al usuario. Si no existe retorna null

    void addAll(List otherList); /*
    Agrega todos los elementos de la lista otherList pasada como parametro
    al final de la lista que recibe el mensaje.
    */

    void clear(); //Elimina todos los objetos de la lista

    Object get(int index); //Retorna objeto almacenado en posicion index.
    //Si no existe retorna null

    int indexOf(Object element); /*Retorna la posicion (indice) en la que se
    encuentra el objeto element pasado como parametro. Si el obj no existe
    retorna -1.*/

}
