""" Algoritmo para generar una letra de reguetón, en base a el abuelo
Melquiades (https://www.youtube.com/watch?v=6iOlB0QLy84)
- Una palabra al azar por cada grupo
- Cambiar la letra "r" por la letra "l" """
from random import randrange


def compose_reggaeton():
    groups = [
        ['mami', 'bebé', 'princess', 'mami'],
        ['yo quiero', 'yo puedo', 'yo vengo a', 'voy a'],
        ['encenderte', 'amarte', 'ligar', 'jugar'],
        ['suave', 'lento', 'rápido', 'fuerte'],
        ['hasta que salga el sol', 'toda la noche',
            'hasta el amanecer', 'todo el día'],
        ['sin anestesia', 'sin compromiso', 'feis to feis', 'sin miedo']
    ]
    lyric = ''
    for group in groups:
        idx = randrange(0, len(group))
        lyric += group[idx] + ' '
    lyric = lyric.replace('r', 'l')
    print(lyric)


compose_reggaeton()
