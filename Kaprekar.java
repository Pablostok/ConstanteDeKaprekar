import java.util.ArrayList;
import java.util.List;

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

    List<String> numeromenor = new ArrayList<String>();

    int auxL = 0, numero_menor_int = 0, numero_mayor_int = 0;
    String auxlista = "";

    //-------------------------------------------------------------Llenado numeromenor (Ordenado menor-mayor)
    String numero_menor = "";
    int leidoCopia = listaCopia.size();

    for(int i = 0; i <= leido - 1; i++){
      for(int k = 0; k <= leidoCopia - 1; k++){
        leidoCopia = listaCopia.size();
        numero_menor = listaCopia.get(0);
        numero_menor_int = Integer.parseInt(numero_menor);
        auxlista = listaCopia.get(k);
        auxL = Integer.parseInt(auxlista);

        if (auxL < numero_menor_int){
          numero_menor_int = auxL;
        }
      }
      numeromenor.add(Integer.toString(numero_menor_int));
      listaCopia.remove(Integer.toString(numero_menor_int));
    }
    //-------------------------------------------------------------
    
    //Llenado de listaCopia
    for(int i = 0; i <= leido - 1; i++){
      listaCopia.add(numero.get(i));
    }
    
    //-------------------------------------------------------------Llenado numeromayor (Ordenado mayor-menor)
    String numero_mayor = "";
    leidoCopia = listaCopia.size();

    for(int i = 0; i <= leido - 1; i++){
      for(int k = 0; k <= leidoCopia - 1; k++){
        leidoCopia = listaCopia.size();
        numero_mayor = listaCopia.get(0);
        numero_mayor_int = Integer.parseInt(numero_mayor);
        auxlista = listaCopia.get(k);
        auxL = Integer.parseInt(auxlista);

        if (auxL > numero_mayor_int){
          numero_mayor_int = auxL;
        }
      }
      numeromayor.add(Integer.toString(numero_mayor_int));
      listaCopia.remove(Integer.toString(numero_mayor_int));
    }
    //-------------------------------------------------------------

    //-------------------------------------------------------------Llenado nuevos String para los números mayor y menor
    String num = "", num_mayor = "", num_menor = "";
    
    for(int i = 0; i <= leido - 1; i++){
      num = num + numero.get(i);
      num_menor = num_menor + numeromenor.get(i);
      num_mayor = num_mayor + numeromayor.get(i);
    }
    //-------------------------------------------------------------

    //-------------------------------------------------------------Pasado de los String a los Int para realizar operación
    int num_ = Integer.parseInt(num), nummenor = Integer.parseInt(num_menor), nummayor = Integer.parseInt(num_mayor);
    int numdiferencia = nummayor - nummenor;
    
    System.out.println(num_);
    System.out.println(nummayor);
    System.out.println(nummenor);
    System.out.println(numdiferencia);
    //-------------------------------------------------------------
  }
}
