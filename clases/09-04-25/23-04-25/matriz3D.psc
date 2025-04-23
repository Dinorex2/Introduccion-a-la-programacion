Algoritmo sin_titulo
	
	Definir matriz3D Como Entero
	Dimension matriz3D[2,2,2]
	
	Escribir "Digite los datos del arreglo tridimensional"
	Para i<-1 Hasta 2 Con Paso 1 Hacer
		Para j<-1 Hasta 2 Con Paso 1 Hacer
			Para k<-1 Hasta 2 Con Paso 1 Hacer
				Escribir "Elemento [",i,"][",j,"][",K,"]"
				Leer matriz3D[i,j,k]
			Fin Para
		Fin Para
	Fin Para
	Escribir "Matriz ingresada"
	Para i<-1 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para j<-1 Hasta 2 Con Paso 1 Hacer
			Escribir ""
			Para k<-1 Hasta 2 Con Paso 1 Hacer
				Escribir Sin Saltar matriz3D[i,j,k],""
			Fin Para
			
		Fin Para
	Fin Para
	
FinAlgoritmo
