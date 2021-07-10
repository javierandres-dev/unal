""" Dada una cadena de longitud 1, determine si el código ASCII de primera
letra de la cadena es par o no. Ayuda: utilice la función ord(<carácter>) de
Python que retorna el código ASCII de una cadena de longitud 1. """


def evenOrOdd(char):
    if len(char) > 1:
        print('Debe ingresar un solo caracter')
        return
    code = ord(char)
    if code > 64 and code < 91 or code > 96 and code < 123:
        isNumber = None
        if code % 2 == 0:
            isNumber = 'par'
        else:
            isNumber = 'impar'
        print('El código ASCII de la letra {} es {}, es un número {}'.format(
            char, code,  isNumber))
    else:
        print('"{}" no es una letra, debe ingresar una letra'.format(char))


evenOrOdd('ja')
evenOrOdd('0')
evenOrOdd('^')
evenOrOdd('J')
evenOrOdd('a')
evenOrOdd('V')
evenOrOdd('i')
