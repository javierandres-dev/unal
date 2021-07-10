""" Si pido prestados P cantidad de pesos para pagarlos en dos meses, si el
interés del préstamo es del 3%. ¿Cuánto se debe pagar al final del segundo mes
si el interés es compuesto mensualmente?. """


def get_pay(P, M):
    rate = 0.03
    interest = (rate * P) * M
    pay = P + interest
    print(pay)


get_pay(1000000, 2)
