palabra = input("Ingrese una palabra: ")
invertida =""
i = len(palabra) - 1

while i >= 0:
    invertida += palabra[i]
    i -= 1  

    print("La palabra invertida es:", invertida)                        