""" Mi mamá me manda a comprar P panes a $ 300 cada uno, M bolsas de leche a
$3300 cada una y H huevos a $ 350 cada uno. Hacer un programa que me diga las
vueltas (o lo que quedo debiendo) cuando me da un billete de B pesos. """


def get_balance(P, M, H, B):
    bread = 300
    milk = 300
    egg = 350
    balance = B - ((P * bread) + (M * milk) + (H * egg))
    if balance > -1:
        print('Vueltas:', balance)
    else:
        print('Debe:', balance)


get_balance(1, 1, 1, 1000)
get_balance(10, 10, 10, 1000)
get_balance(10, 20, 30, 20000)
