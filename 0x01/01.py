""" Un granjero tiene cincuenta animales entre conejos y gallinas.  Si la
cantidad de patas de los animales es ciento cuarenta, ¿Cuántos conejos y
cuántas gallinas tiene el granjero? """


def howMany(animals, legs):
    totalPairLegs = legs // 2
    rabbits = totalPairLegs - animals
    hens = animals - rabbits
    print('El granjero tiene ', rabbits, ' conejos y ', hens, ' gallinas')

howMany(50, 140)# 20 30
howMany(50, 134)# 17 33
howMany(59, 172)# 27 32
howMany(60, 190)# 35 25
