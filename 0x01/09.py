""" Una tienda tiene las siguientes promociones
- Si un cliente lleva más de 5 productos del mismo tipo le realizan un descuento
del 5%.
- Si lleva más de 10 productos del mismo tipo le realizan un descuento del 10%.
- Si lleva más de 20 productos del mismo tipo le realizan un descuento del 20%.
Construya un programa que dado el número de productos y el precio de cada
producto determine el valor a pagar por el cliente. """


def pay(n_products, price_product):
    total = n_products * price_product
    if n_products > 20:
        total = total - (total * 0.2)
    elif n_products > 10:
        total = total - (total * 0.1)
    elif n_products > 5:
        total = total - (total * 0.05)
    print(int(total))


pay(4, 10000)  # 40000
pay(8, 10000)  # 76000
pay(15, 10000)  # 135000
pay(25, 10000)  # 200000
