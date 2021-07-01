""" CONCIERTOS
Steven quiere asistir a unos cuantos conciertos en el 2022, sin embargo solo
algunos de estos se harán en Colombia. Por lo cual Steven desea saber a qué
conciertos puede asistir y cuánto dinero debe ahorrar.
Entrada:
- Una primera línea con la información de los conciertos que se harán en 2022,
con el nombre de la banda y el precio de la entrada. (en formato diccionario
JSON)
- Una segunda línea con los conciertos, a los cuales quiere ir Steven,
separados por espacio
Salida:
- En la primera línea se debe imprimir la cantidad que Steven debe ahorrar para
ir a los conciertos
- En la segunda línea se debe imprimir todos los conciertos a los cuales Steven
puede ir. (Si no se puede ir a ningún concierto, se debe imprimir una linea en
blanco) """


def my_concerts(all, want):
    i_want = want.split(' ')
    target = []
    save_money = 0
    for concert in i_want:
        if all.get(concert) != None:
            target.append(concert)
            save_money += all[concert]
    if len(target) > 0:
        print(save_money)
        print(' '.join(target))
    else:
        print(0)
        print('')


my_concerts({"Bizarap": 69254, "DuaLipa": 96696, "Duki": 91246,
             "Priestess": 98951}, 'JBalvin LosPetitFellas Duki')
my_concerts({"JBalvin": 60221, "EdMaverick": 3626, "TheDo": 34485},
            'Priestess MO BadBunny JBalvin TheDo')
my_concerts({"KevinKaarl": 74238, "DuaLipa": 38302, "MO": 82659,
             "JBalvin": 19564}, 'Duki TheDo LosPetitFellas')
"""
import json
all = input()
concerts = json.loads(all)
want = input()
i_want = want.split(' ')
target = []
save_money = 0
for concert in i_want:
    if concerts.get(concert) != None:
        target.append(concert)
        save_money += concerts[concert]
if len(target) > 0:
    print(save_money)
    print(' '.join(target))
else:
    print(0)
    print('')
"""
