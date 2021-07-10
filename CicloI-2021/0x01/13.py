""" Dado un número real x, construya una función que permita determinar si el
número es positivo, negativo o cero. Para cada caso de debe imprimir el texto
que se especifica a continuación:
- Positivo: “El número x es positivo”
- Negativo: “El número x es negativo”
- Cero (0): “El número x es el neutro para la suma” """


def pos_neg_zero(x):
    if x > 0:
        print('El número {} es positivo'.format(x))
    elif x < 0:
        print('El número {} es negativo'.format(x))
    else:
        print('El número {} es el neutro para la suma'.format(x))


pos_neg_zero(-1)
pos_neg_zero(0)
pos_neg_zero(1)
