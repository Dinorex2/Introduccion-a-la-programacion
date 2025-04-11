Proceso sin_titulo
	
	Definir filas, columnas como entero
	Definir matris como entero
	
	Escribir "Digite las filas de la matriz"
	leer filas
	Escribir "Digite las columnas de la matriz"
	Leer columnas 
	Dimension matriz[filas,columnas]
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Para j<-1 Hasta columnas Con Paso 1 Hacer
			Escribir "Elemento [",i,"][",j,"]"
			Leer matriz[i,j]
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
	
FinProceso
