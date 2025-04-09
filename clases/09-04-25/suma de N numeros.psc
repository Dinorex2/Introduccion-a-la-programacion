Algoritmo sin_titulo
	
	Definir numero, suma Como Entero
	Definir contador Como Entero
	contador<-0
	suma<-0
	Escribir "Suma de N numeros, digite 0 para finalizar"
	Escribir "Digite el numero"
	leer numero
	suma<-numero
	Mientras numero<>0 Hacer
		Escribir "Digite el numero"
		leer numero
		suma<-suma+numero
		contador<-contador+1
	Fin Mientras
	Escribir "La suma de los numeros es ", suma
	Escribir "El promedio es: ",(suma/contador)
FinAlgoritmo
