""" Imprimir los números pares en forma descendente hasta 2 que son menores o
iguales a un número natural n ≥ 2 dado. """


def evens(n):
    for number in range(n, 1, -1):
        if number % 2 == 0:
            print(number)


evens(10)
evens(100)
