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

    int aux = 0, auxL = 0;
    String auxlista = "", auxstr = "";

    //-------------------------------------------------------------Llenado numeromenor (Ordenado menor-mayor)
    for(int i = 0; i <= leido - 1; i++){
      auxlista = listaCopia.get(i);
      auxL = Integer.parseInt(auxlista);

      if(auxL < aux){
          aux = auxL;
      }
    }

    for(int i = 0; i <= leido - 1; i++){ 
      auxstr= Integer.toString(aux);
      numeromenor.add(auxstr);
      listaCopia.remove(auxstr);
    }
    //-------------------------------------------------------------

    
    //-------------------------------------------------------------Llenado numeromayor (Ordenado mayor-menor)
    for(int i = 0; i <= leido - 1; i++){
      auxlista = listaCopia.get(i);
      auxL = Integer.parseInt(auxlista);

      if(auxL > aux){
          aux = auxL;
      }
    }

    for(int i = 0; i <= leido - 1; i++){ 
      auxstr= Integer.toString(aux);
      numeromayor.add(auxstr);
      listaCopia.remove(auxstr);
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
