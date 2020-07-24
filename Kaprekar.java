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
    for(int i = 0; i <= leido; i++){
      listaCopia.add(numero.get(i));
    }

    List<String> listaAux = new ArrayList<String>();

    List<String> numeromenor = new ArrayList<String>();

    int aux = 0;

    //Ordenado numeromenor FALTA

    for(int i = 0; i <= leido; i++){
        String auxlista = listaCopia.get(i);
        int auxL = Integer.parseInt(auxlista);

        if(auxL > aux){
            aux = auxL;
        }

    }

    for(int i = 0; i <= leido; i++){ 
      listaAux.add(aux);
      listaCopia.remove(aux);
    }
    
    String num = "";
    String num_mayor = "";
    String num_menor = "";
    
    for(int i = 0; i <= leido; i++){
      num = num + numero.get(i);
      num_menor = num_menor + numeromenor.get(i);
      num_mayor = num_mayor + listaAux.get(i);
    }
    
    int num_ = Integer.parseInt(num);
    int nummenor = Integer.parseInt(num_menor);
    int nummayor = Integer.parseInt(num_mayor);
    
    int numdiferencia = nummayor - nummenor;
    
    System.out.println(num_);
    System.out.println(nummayor);
    System.out.println(nummenor);
    System.out.println(numdiferencia);
  }

}
