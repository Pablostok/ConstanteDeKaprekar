var numero = "3962";

function kaprekar(numero){

  var numero_copia = numero;
  var cont = 0;
  var numdiferencia = 0;
  
  do{
  
    var numero = ["string de numero[0]", "string de numero[1]", "string de numero[2]", "string de numero[3]"];
    
    var listaCopia = "copia de lista numero";
    var listaAux = [];
    
    var numeromenor = numero.sort;
    
    for (var i = 0; i <= numero.length; i++){
      var aux = 0;
      aux = "maximo de listaCopia";
      listAux.add(aux);
      listaCopia.delete(aux);
    }
    
    var num = "";
    var nummenor = "";
    var nummayor = "";
    
    for(var i = 0; i <= numero.length; i++){
      num = num + numero[i];
      nummenor = nummenor + numeromenor[i];
      nummayor = nummayor + listAux[i];
    }
    
    num = num.parseInt;
    nummenor = nummenor.parseInt;
    nummayor = nummayor.parseInt;
    
    numdiferencia = nummayor - nummenor;
    numero = numdiferencia.parseInt;
    
    if(numero.length != 4){
      numero = "0" + numero;
    }
    
    cont = cont + 1;
  }while(numdiferencia != 6174);
  
  console.log("El número de iteraciones para el número " + numero_copia + " es: " + cont.toString);
}
