import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Kaprekar {
  public static void main(String args[]) {

    List<String> numero = new ArrayList<String>();
    numero.add("3");
    numero.add("6");
    numero.add("9");
    numero.add("2");

    int leido = numero.size();
    
    List<String> listaCopia = new ArrayList<String>();
    //Llenado de listaCopia
    for(int i = 0; i <= leido - 1; i++){
      listaCopia.add(numero.get(i));
    }

    List<String> numeromayor = new ArrayList<String>();
    List<Integer> numeromayor_int = new ArrayList<Integer>();

    List<String> numeromenor = new ArrayList<String>();
    List<Integer> numeromenor_int = new ArrayList<Integer>();

    //-------------------------------------------------------------numeromenor (Ordenado menor-mayor)

    //Llenado de numeromenor
    for(int i = 0; i <= leido - 1; i++){
      numeromenor.add(numero.get(i));
    }
    //Llenado de numeromenor_int
    for(int i = 0; i <= leido - 1; i++){
      int aux = Integer.parseInt(numero.get(i));
      numeromenor_int.add(aux);
    }
    //Ordenado
    Collections.sort(numeromenor_int);
    //-------------------------------------------------------------
    
    //-------------------------------------------------------------numeromayor (Ordenado mayor-menor)

    //Llenado de numeromayor
    for(int i = 0; i <= leido - 1; i++){
      numeromayor.add(numero.get(i));
    }
    //Llenado de numeromayor_int
    for(int i = 0; i <= leido - 1; i++){
      int aux = Integer.parseInt(numero.get(i));
      numeromayor_int.add(aux);
    }
    //Ordenado
    numeromayor_int.sort(Collections.reverseOrder());
    //-------------------------------------------------------------

    //-------------------------------------------------------------Llenado nuevos String para los números mayor y menor
    String nummayor = "", nummenor = "", num = "";
    
    for(int i = 0; i <= leido - 1; i++){
      num = num + numero.get(i);
      nummenor = nummenor + Integer.toString(numeromenor_int.get(i));
      nummayor = nummayor + Integer.toString(numeromayor_int.get(i));
    }
    //-------------------------------------------------------------

    //-------------------------------------------------------------Pasado de los String a los Int para realizar operación
    int num_mayor = Integer.parseInt(nummayor), num_menor = Integer.parseInt(nummenor);
    int numdiferencia = num_mayor - num_menor;
    
    System.out.println("El número principal es: " + num);
    System.out.println("El número mayor es:     " + Integer.toString(num_mayor));
    System.out.println("El número menor es:     " + Integer.toString(num_menor));
    System.out.println("La diferencia es:       " + Integer.toString(numdiferencia));
    //-------------------------------------------------------------
  }
}
