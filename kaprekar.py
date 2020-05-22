numero = ["3", "9", "6", "2"]
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