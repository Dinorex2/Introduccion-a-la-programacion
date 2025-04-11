Proceso sin_titulo
	
	Definir filas, columnas como entero
	Definir matriz como entero
	Definir suma, cantida como entero
	
	
	Escribir "Digite las filas de la matriz"
	leer filas
	Escribir "Digite las columnas de la matriz"
	Leer columnas 
	Dimension matriz[filas,columnas]
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Para j<-1 Hasta columnas Con Paso 1 Hacer
			Escribir "Elemento [",i,"][",j,"]"
			Leer matriz[i,j]
			suma<-suma+matriz[i,j]
		Fin Para
	Fin Para
	Escribir ""
	Escribir "Matriz ingresada"
	Escribir ""
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Escribir ""
		Para j<-1 Hasta columnas Con Paso 1 Hacer
			Escribir sin saltar matriz[i,j], " "
		Fin Para
	Fin Para
	cantidad<-filas*columnas
	promedio<-suma/cantidad
	Escribir ""
	Escribir "La suma de los elementos de la matriz es ", suma
	Escribir "El promedio es de: ", promedio

FinProceso
