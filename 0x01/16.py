""" Recibir un tablero de triqui y determinar si existe un ganador o no """


def checkRows(matrix):  # ─
    for row in matrix:
        winner = True
        first_item = row[0]
        for item in row:
            # print(item)
            if item != first_item:
                winner = False
                break
        if winner:
            return True
    return False


def checkColumns(matrix):  # |
    for column in range(0, 3):
        winner = True
        for item in range(0, 3):
            # print(item)
            first_item = matrix[item][column]
            if first_item != matrix[0][column]:
                winner = False
                break
        if winner:
            return True
    return False


def checkFirstDiagonal(matrix):  # \
    for i in range(0, 3):
        winner = True
        first_item = matrix[0][0]
        item = matrix[i][i]
        # print(first_item)
        # print(item)
        if first_item != item:
            winner = False
            break
    if winner:
        return True
    return False


def checkSecondDiagonal(matrix):  # /
    j = 2
    for i in range(0, 3):
        winner = True
        first_item = matrix[0][2]
        item = matrix[i][j]
        # print(first_item)
        # print(item)
        if first_item != item:
            winner = False
            break
        j -= 1
    if winner:
        return True
    return False


def checkBoard(matrix):
    if checkRows(matrix):
        print('Si, existe un ganador - línea horizontal ─')
    elif checkColumns(matrix):
        print('Si, existe un ganador - línea vertical |')
    elif checkFirstDiagonal(matrix):
        print('Si, existe un ganador - línea diagonal \\')
    elif checkSecondDiagonal(matrix):
        print('Si, existe un ganador - línea diagonal /')
    else:
        print('No existe un ganador')


#checkBoard([['1', '2', '3'], ['4', '5', '6'], ['7', '8', '9']])
checkBoard([['o', '-', '-'], ['x', 'x', 'x'], ['-', '-', 'o']])
checkBoard([['-', 'x', '-'], ['-', 'x', '-'], ['-', 'x', '-']])
checkBoard([['x', '-', '-'], ['-', 'x', '-'], ['-', '-', 'x']])
checkBoard([['-', '-', 'x'], ['-', 'x', '-'], ['x', '-', '-']])
checkBoard([['x', 'o', 'x'], ['x', 'o', 'x'], ['o', 'x', 'o']])
checkBoard([['o', 'x', 'o'], ['o', 'x', 'o'], ['x', 'o', 'x']])
checkBoard([['o', 'x', 'x'], ['o', 'o', 'x'], ['x', 'o', 'x']])
checkBoard([['x', 'o', 'o'], ['', 'x', ''], ['x', 'o', 'x']])
