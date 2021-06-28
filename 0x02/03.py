""" LE NOIR
Marcela y Patricia están discutiendo ya que Marcela cree que Patricia siempre
pide lo mismo cuando salen a comer.  Para demostrarle que no, Patricia le pide
a usted que desarrolle un programa que analice los platos que haya ordenado
anteriormente, teniendo en cuenta que el menú del restaurante Le Noir es:
Arroz, Res, Ajiaco, Sancocho, Fruta, Pollo, Cerdo, Mojarra, Pasta
Entrada:
- Una línea con el listado de todos los platos que ha ordenado Patricia en el
orden en el que los pidió
Salida:
- En la primera línea se debe imprimir cada plato que haya pedido Patricia, en
orden.
- En la segunda línea se debe imprimir cuántas veces Patricia ordenó el mismo
plato consecutivamente.
"""


def order_history(input):
    dishes = input.split(' ')
    names = []
    amounts = []
    previous = -1
    for i in range(0, len(dishes)):
        if i > 0:
            if dishes[i] == names[previous]:
                amount += 1
                amounts[previous] = str(amount)
                continue
            else:
                names.append(dishes[i])
                amount = 1
                amounts.append(str(amount))
        else:
            names.append(dishes[i])
            amount = 1
            amounts.append(str(amount))
        previous += 1
    print(' '.join(names))
    print(' '.join(amounts))


order_history('arroz arroz res cerdo cerdo cerdo pollo')
# arroz res cerdo pollo 2 1 3 1

order_history('pollo pollo pollo pasta res sancocho sancocho sancocho arroz arroz arroz arroz res res res res mojarra mojarra mojarra res res ajiaco')
# pollo pasta res sancocho arroz res mojarra res ajiaco 3 1 1 3 4 4 3 2 1
order_history('mojarra fruta mojarra sancocho sancocho fruta')
# mojarra fruta mojarra sancocho fruta 1 1 1 2 1
