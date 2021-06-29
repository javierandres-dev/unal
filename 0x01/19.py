""" En 2022 el país A tendría una población de 25 millones de habitantes y el
país B de 18.9 millones. Las tasas de crecimiento anual de la población serán
de 2% y 3% respectivamente. Desarrollar un algoritmo para informar en que año
la población del país B superará a la de A. """


def get_growth(amount, rate):
    return amount + (amount * rate)


def printYear(population_a, population_b):
    growth_a = 0.02
    growth_b = 0.03
    year = 2023
    a = get_growth(population_a, growth_a)
    b = get_growth(population_b, growth_b)
    if a > b:
        a_overcome_b = True
        while a_overcome_b:
            year += 1
            a = get_growth(a, growth_a)
            b = get_growth(b, growth_b)
            if a < b:
                a_overcome_b = False
    print('En el año {} la población del país B superará a la de A'.format(year))


printYear(25, 18.9)
