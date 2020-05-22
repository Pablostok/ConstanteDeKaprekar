numero = "3962"

def algoritmo(numero):
	numero = [str(numero[0]), str(numero[1]), str(numero[2]), str(numero[3])]

	listaCopia = numero[:]
	listAux = []

	numeromenor = sorted(numero)

	for i in range(len(numero)):
		aux = 0
		aux = max(listaCopia)
		listAux.append(aux)
		listaCopia.remove(aux)

	print(listAux)

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

	print(num)
	print(nummayor)
	print(nummenor)
	print(numdiferencia)

algoritmo(numero)