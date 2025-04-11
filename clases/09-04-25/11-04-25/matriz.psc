Proceso sin_titulo
	
	Definir matriz como entero
	Dimension matriz[3,3]
	
	Escribir "Digitar los datos de la matriz"
	
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Para j<-1 Hasta 3 Con Paso 1 Hacer
			Escribir "Elemento [",i,"][",j,"]"
			Leer matriz[i,j]
		Fin Para
	Fin Para
	Escribir " "
	Escribir "Matriz ingresada"
	Escribir " "
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir ""
		Para j<-1 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j],""
		Fin Para
	Fin Para
FinProceso
