Algoritmo sin_titulo
	
	Definir nombres como cadena
	definir contador Como Entero
	Dimension nombres[10]
	contador<-1
	
	Mientras contador<=10 Hacer
		Escribir "Escribir el nombre No. ", contador 
		Leer nombres[contador]
		contador<-contador+1
	Fin Mientras
	//para imprimir los nombres ingresados
	contador<-1
	Escribir "Nombres ingresados:"
	Mientras contador<=10 Hacer
		Escribir "Nombre No", contador,":", nombres[contador]
		contador<-contador+1
	Fin Mientras
FinAlgoritmo
