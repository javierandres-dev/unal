""" Imprimir un listado con los números impares desde 1 hasta 999 y
seguidamente otro listado con los números pares desde 2 hasta 1000. """


def numbers_list():
    odd_list = []
    even_list = []
    for number in range(1, 1001):
        if number % 2 == 0:
            even_list.append(number)
        else:
            odd_list.append(number)
    print('lista de impares:', odd_list, '\n\n', 'lista de pares:', even_list)


numbers_list()
