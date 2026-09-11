a=[1,2,3,4,5]
b=(
    1,
    2,
    3,
    4,
    5
)
c={1,2,3,3,4,5}
d={"a": a, "b": b, "c": c}
print( "List: ", a)
print( "Tuple: ", b)
print( "Set: ", c)
print( "Dictionary: ", d)
# ALL IMP DIFFRENCE B/N LIST TUPLE SET AND DICTIONARY
#- List: It is a collection of items which is ordered and changeable. Allows duplicate members.
#- Tuple: It is a collection of items which is ordered and unchangeable. Allows duplicate members.
#- Set: It is a collection of items which is unordered and unindexed. No duplicate members. 
#- Dictionary: It is a collection of key-value pairs which is unordered and changeable. No duplicate keys.
# - more diffrence b/n list and tuple is that list is mutable and tuple is immutable.
#- extra: List and tuple can be indexed and sliced, while set and dictionary cannot be indexed or sliced.
#-bonus: List and tuple can contain any type of data, while set and dictionary can only contain hashable types (i.e., immutable types).
#-prefinally: List and tuple can be nested, while set and dictionary cannot be nested.
#-final: List and tuple can be concatenated, while set and dictionary cannot be concatenated.
#--- lambda function ----
#defining a lambda function to add two numbers
add = lambda x, y: x + y 
print( "Sum: ", add(5, 10))
# defination fo lambda function 
#- A lambda function is a small anonymous function that can take any number of arguments, but can only have one expression. It is defined using the keyword 'lambda' followed by the arguments, a colon, and the expression. Lambda functions are often used for short, simple operations that can be defined in a single line of code.
#- feature of python 
#  readiblity - python code is easy to read and understand, making it a great choice for beginners and experienced programmers alike.
#- simplicity - Python has a simple and clean syntax that allows developers to express concepts in fewer lines of code compared to other programming languages.
# - dynimic typing - Python is dynamically typed, meaning that you don't need to declare the type of a variable when you create it. The interpreter infers the type at runtime.
#larg standerd library - Python comes with a large standard library that provides modules and functions for various tasks, such as file I/O, regular expressions, and web development.
# object-oriented programming - Python supports object-oriented programming (OOP) paradigms, allowing developers to create classes and objects to model real-world entities and their behaviors.    
#-cross-platform compatibility - Python is a cross-platform language, meaning that code written on one operating system can run on another with little or no modification.
#-indentation - Python uses indentation to define blocks of code, which enforces a consistent coding style and improves code readability.
#-diffrence beetween break continu and pass statement
#- break statement is used to exit a loop prematurely when a certain condition is met. It immediately terminates the loop and transfers control to the next statement after the loop.
#- continue statement is used to skip the current iteration of a loop and move on to the    next iteration. It does not terminate the loop, but rather skips the remaining code in the current iteration and proceeds to the next iteration.
#- pass statement is a null operation that does nothing. It is used as a placeholder in situations where a statement is syntactically required but no action is needed. It allows the code to run without errors, but does not affect the flow of the program.          
add=lambda x,y: x + y
print("sum",add(5,10))


