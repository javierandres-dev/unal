""" PepitoComunica
Pepito ama viajar, visitar países nuevos, probar nuevas comidas y conocer
diferentes culturas. Por lo tanto con los conocimientos adquiridos en MisionTic
Ciclo 1 decide crear un programa con múltiples características que le ayuden
con sus viajes

Información importante:
- Cada país se identificara con un ID (un número)
- Todos los países están en un continente  (europa, américa, oceanía, áfrica o
asia)
- Para saber el continente de un país se debe acceder, con el ID del país, a la
posición en  el listado de continentes.

Ejemplo:
para el listado de continentes [europa, asia, europa, africa,africa], sabemos
que: el país con ID 0 es de europa, el país con ID 1 es de asia, el país con ID
2 es de europa, etc

El programa tendrá las siguientes características:
1. Listar continentes
- Se debe crear una función llamada “continentes” que dada la información de los
países que ha visitado Pepito retorne cuáles continentes conoce.
2. Consultar
- Se debe crear una función llamada “consultar” que reciba los países que ha
visitado Pepito, con su información y un continente de búsqueda. Para que
retorne los países que ha visitado Pepito de ese continente
3. Comprar
- Una agencia de viajes le ofrece a Pepito un listado de países que puede
visitar. Se necesita una función llamada “comprar” que reciba los destinos
ofrecidos por la tienda y los países visitados por Pepito para que retorne
cuáles países Pepito no ha visitado y sean ofrecidos por la agencia de viajes.
4. Intercambiar
- Pepito desea intercambiar información de países con su mejor amigo Carlos, pero con la condición de que si Carlos le da información de un país que no
conozca Pepito, él debe hacer lo mismo con otro país.
- Se debe crear una función llamada “intercambiar” que reciba los países
visitados por Pepito y por Carlos. Y que retorne de cuántos países se puede
intercambiar información.

Requerimientos técnicos:
- Cada característica de la tienda virtual debe ser una función en python.
- Todas las funciones deben estar en una librería llamada viajes.py
- Este reto no tiene inputs de entrada ni prints de salida, ya que se evalúa
que las funciones retornen el valor indicado. """


def continentes(countries):
    known = []
    for el in countries:
        if el not in known:
            known.append(el)
    return known


def consultar(countries, continents, continent):
    visited = []
    for el in countries:
        if continents[el] == continent:
            visited.append(el)
    return visited


def comprar(offered, visited):
    not_visited = []
    for el in offered:
        try:
            visited.index(el)
        except ValueError:
            not_visited.append(el)
    return not_visited


def intercambiar(a, b):
    r1 = comprar(a, b)
    r2 = comprar(b, a)
    if len(r1) < len(r2):
        return len(r1)
    else:
        return len(r2)
