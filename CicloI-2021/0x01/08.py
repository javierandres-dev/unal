""" El número de contagiados de Covid-19 en el país de NuncaLandia se duplica
cada día. Hacer un programa que diga el número total de personas que se han
contagiado cuando pasen D días a partir de hoy, si el número de contagiados
actuales es C. """


def get_total(D, C):
    print('en {} días, se han contagiado {} personas'.format(D, (C * 2) * D))


get_total(1, 1)
get_total(7, 1)
get_total(30, 1)
get_total(30, 2)
