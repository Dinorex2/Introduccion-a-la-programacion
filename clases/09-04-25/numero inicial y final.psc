Algoritmo sin_titulo
	
	Definir numeroI, numeroF Como Entero
	Escribir "Ingrese su numero inicial"
	Leer numeroI
	Escribir "Ingrese su numero final"
	Leer numeroF
	
	
	Si numeroI>numeroF Entonces
		Escribir "El primero numero tiene que ser menor que el segundo"
	SiNo
		Si numeroI<numeroF Entonces
			Mientras numeroI<=numeroF Hacer
				Escribir numeroI
				numeroI<-numeroF+1
			Fin Mientras
		SiNo
			Escribir "Los numeros son iguales"
			Escribir "El ciclo no funciona con los numeros iguales "
		Fin Si
	Fin Si
	
	Mientras numeroI<=numeroF Hacer
		Escribir numeroI
		numeroI<-numeroF+1
	Fin Mientras
	
FinAlgoritmo
