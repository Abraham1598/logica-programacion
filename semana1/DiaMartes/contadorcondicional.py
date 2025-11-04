contador = 0

while True:
    numero = int(input("Ingrese un numero (negativo para salir): "))
    if numero < 0:
        breakcontador += 1
        print("Cantidad de numeros positivos ingresados:", contador)