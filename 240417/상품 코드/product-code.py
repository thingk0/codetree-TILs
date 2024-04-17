class Product:
    def __init__(self, name = 'codetree', code = 50):
        self.name = name
        self.code = code
        print(f'product {code} is {name}')

Product()
Product(*input().split())