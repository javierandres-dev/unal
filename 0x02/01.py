""" Carlos, Andres y Juan son 3 amigos, cuyas transacciones del año se ven
reflejadas en el siguiente cronograma:

- Enero: Se anuncia la nueva criptomoneda MisionTicCoin, expertos están a la
expectativa de su evolución.
- Febrero: Juan se entera de esta nueva criptomoneda, y decide invertir todo su
dinero (en dólares).
- Marzo: Andrés y Carlos se burlan de Juan por invertir todo su dinero.
- Abril: Carlos sospecha que a Juan le irá bien, entonces decide invertir 4
dólares a espaldas de Andrés
- Mayo: El conocido empresario Elon Musk menciona a MisionTicCoin en su cuenta
de twitter, se espera que se valorice en el mercado.
- Junio: Andrés se entera que Carlos invirtió dinero sin decirle, así que para
vengarse le raya el carro.
- Julio: Andrés ve a Juan con un apartamento nuevo, así que decide invertir
cinco veces lo que invierta Juan.
- Agosto: Para pagarle el arreglo del carro, Andrés y Carlos llegan a un
acuerdo de que todo lo que invierta Carlos será descontado de lo que invierta
Andrés.
- Septiembre: Carlos ve a Juan de vacaciones en Europa, así que decide invertir
el doble de lo que invierta Andrés
- Octubre: Juan cree que es momento de dejar de invertir dólares en esta
criptomoneda, así que se retira.
- Noviembre: Andrés y Carlos se burlan de Juan por querer dejar de invertir en
su mejor momento.
- Diciembre: Se anuncia que China ha bloqueado a MisionTicCoin, por lo cual su
precio se desploma.

La mamá de Juan está preocupada, así que lo contrata a usted para que diseñe un algoritmo que, dada la cantidad de dólares invertidos por Andrés, calcule en qué categoría de inversión se encuentra su hijo.

Dinero invertido / Categoría de inversión
Entre 0 y 20 dólares / uno
Entre 21 y 30 dólares / dos
Entre 31 y 50 dólares / tres
Más de 50 dolares / cuatro

Nota: Tenga en cuenta que solo interesa el valor en dólares, sin contar
centavos. """
from math import ceil
usdInvestAndres = int(input())
usdInvestCarlos = 4 + (usdInvestAndres * 2)
usdInvestJuan = ceil(usdInvestAndres / 5 * 3)
print(usdInvestAndres, usdInvestCarlos, usdInvestJuan)
if usdInvestJuan > 50:
    category = 'cuatro'
if usdInvestJuan > 30 and usdInvestJuan < 50:
    category = 'tres'
if usdInvestJuan > 20 and usdInvestJuan < 30:
    category = 'dos'
if usdInvestJuan < 20:
    category = 'uno'
print(category)
