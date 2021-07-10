""" Dadas tres longitudes positivas, determinar si con esas longitudes se puede
construir un tríangulo. """
from math import sqrt


def built_triangle(a, b, c):
    try:
        p = (a + b + c) / 2
        area = sqrt(p * (p - a) * (p - b) * (p - c))
        print('Si, se puede contruir un tríangulo con area de:', area)
    except ValueError:
        print('No es posible contruir un tríangulo con las 3 longitudes dadas')


built_triangle(6, 7, 8)
built_triangle(6, 0, 8)
