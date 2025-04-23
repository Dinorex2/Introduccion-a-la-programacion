Algoritmo sin_titulo
	
	Definir respuesta Como Caracter
	Definir nota Como Real
	Definir ca,cr Como Entero
	Definir nombre como cadena
	Dimension nombre[25]
	ca<-0
	cr<-0
	
	
	Repetir
		Escribir "Ingrese el nombre del estudiante"
		Leer nombre[25]
		Escribir "Ingrese la nota del estudiante"
		leer nota
		Si nota>=60 Entonces
			ca<-ca+1
		SiNo
			cr<-cr+1
		Fin Si
		Escribir "Desea continuar S/N"
		Leer respuesta
		
	Hasta Que respuesta='N' o respuesta='n'
	Escribir "Cantidad de aprobados: ", ca
	Escribir "Cantidad de reprobados: ",cr
	
FinAlgoritmo
