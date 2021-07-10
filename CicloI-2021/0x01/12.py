""" Dado un carácter, construya un programa en Python para determinar si el
carácter es un dígito o no. """


def isDigit(char):
    if len(char) > 1:
        print('Debe ingresar un solo caracter')
        return
    code = ord(char)
    if code > 47 and code < 58:
        print('El carácter {} es un dígito'.format(char))
    else:
        print('El carácter {} no es un dígito'.format(char))


isDigit('01')
isDigit('0')
isDigit('a')
