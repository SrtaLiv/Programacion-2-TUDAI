package Practicos.Practico9.SistemasArchivosYo2025;

public class Consigna {

    /**
     * Sistema de Archivos
     * Un Sistema de Archivos debe organizar y manipular: archivos, directorios, links y archivos
     * comprimidos. Los archivos se definen por un nombre, una fecha de creación y un tamaño.
     * Los directorios tienen un nombre, una fecha de creación y además contienen un conjunto de
     * archivos y un conjunto de subdirectorios. El tamaño de un directorio está dado por el tamaño
     * de sus sub-directorios, sus archivos, sus links y sus archivos comprimidos. Los links son
     * vínculos a otro archivo o directorio y tienen un nombre, una fecha de creación y su tamaño en
     * disco es siempre igual a 1Kb. Los archivos comprimidos son un tipo particular de archivo el
     * cual contiene otros archivos y/o directorios en formato comprimido según una tasa de
     * compresión dada (El tamaño de un archivo comprimido es el tamaño de todo lo contenido
     * dividido el factor de compresión), tiene un nombre y una fecha de creación.
     *
     * El sistema debe permitir realizar búsquedas de cualquiera de sus elementos según diferentes
     * criterios (simples y compuestos ), por ejemplo: 1
     * ● Todos los elementos cuyo nombre contenga la palabra “parcial”.
     * ● Todos los elementos que se hayan modificado luego del 15-10-2020.
     * ● Todos los elementos que fueron creados antes del 15-03-2020 y cuyo nombre sea
     * igual a “parcial”.
     * ● Cualquier combinación lógica (and, or y not) de búsquedas simples.
     * Aclaración sobre las búsquedas. Un archivo comprimido será incluido en el resultado de la
     * búsqueda, si alguno de los elementos que contiene en su interior cumple con el criterio de la
     * búsqueda (se agrega el archivo comprimido al resultado, pero no los elementos que contiene).
     * Un link cumple con el criterio de búsqueda por sí mismo, sin tener en cuenta el elemento que
     * apunta.
     * A la hora de realizar una búsqueda, el usuario puede especificar también un criterio de orden
     * en el que quiere que se retornen los elementos resultantes. Por ejemplo, ordenados
     * ascendentemente por fecha de creación y luego por nombre, ordenados descendentemente por
     * tamaño, luego por fecha de creación y finalmente por nombre descendente, entre otros
     * posibles criterios de ordenamiento.
     */
}
