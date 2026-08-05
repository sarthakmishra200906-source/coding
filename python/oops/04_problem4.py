class calculator:
    def __init__(self,n):
        self.n = n
    
    def square(self):
        print(f"The square of {self.n} is {self.n*self.n}")
    def cube(self):
        print(f"The cube of {self.n} is {self.n*self.n*self.n}")
    def squareroot(self):
        print(f"The squareroot of {self.n} is {self.n**0.5}")
    @staticmethod
    def hello():
        print("Hello, I am a static method. I don't have access to the instance or class attributes.")

a = calculator(5)
a.square()
a.cube()
a.squareroot()
a.hello()  # Calling the static method using the instance