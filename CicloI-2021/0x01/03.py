""" Generar discurso político """
from random import randrange


def get_discourse():
    groups_words = [
        ['queridos', 'apreciados', 'distinguidos',
            'honorables', 'estimados', 'respetados'],
        ['compatriotas', 'conciudadanos', 'amigos',
            'coterraneos', 'copartidarios', 'electores'],
        ['en mi gobierno', 'con su apoyo', 'siendo elegido',
            'con su ayuda', 'si me siguen', 'durante mi mandato'],
        ['voy a derrotar', 'venceré', 'eliminaré',
            'acabaré', 'lucharé contra', 'combatiré'],
        ['la violencia y', 'la delincuencia y', 'la corrupción y',
            'la inflación y', 'la pobreza y', 'el desplazamiento y'],
        ['trabajaré por', 'garantizaré', 'protegeré',
            'velaré por', 'promoveré', 'defenderé'],
        ['la educación', 'el empleo', 'la seguridad',
            'la paz', 'la igualdad', 'la salud'],
        ['del país', 'de la ciudad',  'de la comunidad',
            'de la población', 'para toda la gente', 'de cada  colombiano']
    ]

    discourse = ''
    for group in groups_words:
        idx = randrange(0, len(group))
        discourse += group[idx] + ' '
    print(discourse)


get_discourse()
