lista_numeros = []
lista_salida = []



ruta = '/home/pablostok/Documentos/FicherosKaprekar/'

with open(ruta + "entrada.txt", 'r') as reader:
    for line in reader:
        lista_numeros.append(line)

leido = len(lista_numeros)

def algoritmo(numero):
    numprincipal = numero

    cont = 0

    numdiferencia = 0

    while numdiferencia != 6174:
        numero = [str(numero[0]), str(numero[1]), str(numero[2]), str(numero[3])]

        listaCopia = numero[:]
        listAux = []

        numeromenor = sorted(numero)

        for i in range(len(numero)):
            aux = 0
            aux = max(listaCopia)
            listAux.append(aux)
            listaCopia.remove(aux)

        num = ""
        nummenor = ""
        nummayor = ""

        for i in range(len(numero)):
            num = num + numero[i]
            nummenor = nummenor + numeromenor[i]
            nummayor = nummayor + listAux[i]

        num = int(num)
        nummenor = int(nummenor)
        nummayor = int(nummayor)

        numdiferencia = nummayor - nummenor
        numero = str(numdiferencia)

        if len(numero) != 4:
            numero = "0" + numero

        cont = cont + 1

    valor_fichero = "El número de iteraciones para el número " + numprincipal + " es: " + str(cont)

    print(valor_fichero)

    lista_salida.append(valor_fichero)

for i in range(0, leido):
    algoritmo(lista_numeros[i])


salida = open(ruta + "salida.txt", "a")

for i in range(0, leido):
    salida.write(lista_salida[i] + "\n")

salida.close()