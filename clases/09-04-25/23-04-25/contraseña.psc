Algoritmo sin_titulo
	
	Definir clave como cadena
	Definir contador Como Entero
	contador<-0
	Repetir
	Escribir "Ingrese la clave"
	Leer clave
	Si clave=="eureka" Entonces
		Escribir "Bienvenido al sistema"
	SiNo
		Escribir "Clave incorrecta intentelo de nuevo"
		contador<-contador+1
	Fin Si
	Si contador==3 Entonces
		Escribir "Has agotado tus intentos, vuelva mas tarde"
	Fin Si
	Hasta Que contador=3
FinAlgoritmo
