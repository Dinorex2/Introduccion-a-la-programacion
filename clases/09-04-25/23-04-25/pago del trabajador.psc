Algoritmo sin_titulo
	
	Definir opcion Como Entero
	Definir nombre como cadena
	definir horas Como real
	Definir Cantidad_horas Como Entero
	
	Repetir
		Limpiar Pantalla

	
	Escribir ""
	Escribir "PROGRAMA QUE CALCULA EL PAGO DE UN TRABAJADOR"
	Escribir "     SEGUN SU TIEMPO DE TRABAJO     "
	Escribir "   1. Turno Diurno"
	Escribir "   2. Turno nocturno"
	Escribir "   3. Salir"
	Escribir " "
	Escribir "Digite una opcion (1-3)"
	Leer opcion
	Segun opcion Hacer
		1:
			Escribir "REGISTRO DE EMPLEADOS DEL TURNO DIURNO"
			Escribir " "
			Escribir "Digite el nombre de el trabajador"
			Leer nombre
			Escribir "Digite la cantidad de horas trabajadas"
			Leer Cantidad_horas
			salario<-Cantidad_horas*100
			Si Cantidad_horas<15 Entonces
				Escribir "Pase por la oficina para su carta de despido"
				Escribir "Ha incumplido con el contrato al acumular menos de 15 horas de trabajo"
			SiNo
				Escribir "Es un honor que sea parte de nuestra empresa felicidades"
			Fin Si
			Escribir "Total al pagar al Sr ", nombre,", Salario C$", salario, Cordobas
			Escribir "Este trabajador pertenece al turno Diurno"
		2:
			Escribir "REGISTRO DE EMPLEADOS DEL TURNO NOCTURNO"
			Escribir " "
			Escribir "Digite el nombre de el trabajador"
			Leer nombre
			Escribir "Digite la cantidad de horas trabajadas"
			Leer Cantidad_horas
			salario<-Cantidad_horas*150
			Si Cantidad_horas<15 Entonces
				Escribir "Pase por la oficina para su carta de despido"
				Escribir "Ha incumplido con el contrato al acumular menos de 15 horas de trabajo"
			SiNo
				Escribir "Es un honor que sea parte de nuestra empresa felicidades"
			Fin Si
			Escribir "Total al pagar al Sr ", nombre,", Salario C$", salario, Cordobas
			Escribir "Este trabajador pertenece al turno Nocturno"
		3:
			
		De Otro Modo:

	Fin Segun
	Hasta Que opcion=3
FinAlgoritmo
