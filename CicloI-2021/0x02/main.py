import viajes
print(viajes.continentes(
    ['europa', 'asia', 'america', 'america', 'asia', 'asia']))

print(viajes.consultar([0, 2, 4], ['africa', 'asia',
                                   'europa', 'europa', 'africa', 'africa'], 'africa'))

print(viajes.comprar([3, 5, 6, 7, 9], [4, 5, 8, 9]))

print(viajes.intercambiar([3, 5, 6, 7], [1, 4, 5, 8, 9]))
