package es.ieslosmontecillos;

/**
 * @author: Profesora
 * Devolver el elemento más grande de un Array
 * @param a array de int
 * @return elemento más grande de a
 */
public class MasGrande {
    public static int max(int[] a){
        if(a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede ser null o vacío");
        }
        int m = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > m)
                m = a[i];
        }
        return m;
    }
}
