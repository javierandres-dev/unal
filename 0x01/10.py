""" Dado un número entero, determinar si ese número corresponde al código
ASCII de una vocal minúscula.  Ayuda: utilice la función chr(<número>) de
Python que retorna el carácter ASCII correspondiente al número entero en el
cual se evalúe la función. """


def vowelLowerASCII(n):
    if n < 0 or n > 255:
        print('"{}" está fuera del rango del código ASCII'.format(n))
    else:
        vowel = None
        if n == 97 or n == 101 or n == 105 or n == 111 or n == 117:
            vowel = chr(n)
        else:
            print(
                '"{}" no corresponde al código ASCII de una vocal minúscula'.format(n))
        if vowel:
            print(
                '{} corresponde al código ASCII de la vocal minúscula: {}'.format(n, vowel))


vowelLowerASCII(-1)
vowelLowerASCII(65)
vowelLowerASCII(97)
vowelLowerASCII(101)
vowelLowerASCII(105)
vowelLowerASCII(111)
vowelLowerASCII(117)
vowelLowerASCII(122)
vowelLowerASCII(256)
