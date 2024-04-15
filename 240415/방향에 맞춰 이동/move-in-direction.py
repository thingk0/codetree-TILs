directions = {
    'N': (0, 1),
    'S': (0, -1),
    'E': (1, 0),
    'W': (-1, 0)
}

def update_coordinates(coordinates, direction, distance):
    if direction in directions:
        dx, dy = directions[direction]
        coordinates[0] += dx * distance
        coordinates[1] += dy * distance

N = int(input())
coordinates = [0, 0]

for _ in range(N):
    direction, distance = input().split()
    update_coordinates(coordinates, direction, int(distance))

print(coordinates[0], coordinates[1])