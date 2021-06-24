""" Recibir un tablero de triqui y determinar si existe un ganador o no """


def checkBoard(matrix):
    # check row
    for row in matrix:
        winner = True
        first_item = row[0]
        for item in row:
            # print(item)
            if item != first_item:
                winner = False
                break
        if winner:
            print('Si, existe un ganador - línea horizontal')
            return
    # check column
    for column in range(0, 3):
        winner = True
        for item in range(0, 3):
            # print(item)
            first_item = matrix[item][column]
            if first_item != matrix[0][column]:
                winner = False
                break
        if winner:
            print('Si, existe un ganador - línea vertical')
            return
    # check diagonal \
    for i in range(0, 3):
        winner = True
        first_item = matrix[i][i]
        if first_item != matrix[0][0]:
            winner = False
            break
        if winner:
            print('Si, existe un ganador - línea diagonal \\')
            return
    # check diagonal /
    if not winner:
        print('No existe un ganador')


#checkBoard([['1', '2', '3'], ['4', '5', '6'], ['7', '8', '9']])
checkBoard([['o', '-', '-'], ['x', 'x', 'x'], ['-', '-', 'o']])
checkBoard([['-', 'x', '-'], ['-', 'x', '-'], ['-', 'x', '-']])
checkBoard([['x', '-', '-'], ['-', 'x', '-'], ['-', '-', 'x']])
checkBoard([['-', '-', 'x'], ['-', 'x', '-'], ['x', '-', '-']])
