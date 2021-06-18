""" Diseñe una función que calcule la cantidad de carne de aves en kilos si se
tienen N gallinas, M gallos y K pollitos cada uno pesando 6 kilos, 7 kilos y 1
kilo respectivamente. """


def get_amount(N, M, K):
    chickens = N * 6
    roosters = M * 7
    chicks = K * 1
    total = chickens + roosters + chicks
    print('Total de carne: {} kilos'.format(total))


get_amount(1, 1, 1)
get_amount(10, 10, 10)
