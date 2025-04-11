Proceso sin_titulo
	
	Definir dia, mes, year como entero
	Definir month como cadena
	
	Escribir "Por favor digite el dia"
	Leer dia	
	
	Mientras mes<1 o mes>12 Hacer
		Escribir "Por favor digite el mes"
		Leer mes
	Fin Mientras
	Escribir "Por favor digite el año"
	Leer year
	Segun mes Hacer
		1:
			month<-"Enero"
		2:
			month<-"Febrero"
		3:
			month<-"Marzo"
		4:
			month<-"Abril"
		5:
			month<-"Mayo"
		6:
			month<-"Jinio"
		7:
			month<-"Julio"
		8:
			month<-"Agosto"
		9:
			month<-"Septiembre"
		10:
			month<-"Octubre"
		11:
			month<-"Noviembre"
		12:
			month<-"Diciembre"
		De Otro Modo:
			
	Fin Segun
	year<-year+1900
	
	Escribir "Fecha introducida: ",dia," de ",month," de ",year
	
FinProceso
