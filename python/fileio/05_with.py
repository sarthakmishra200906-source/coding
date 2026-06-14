f= open("file.txt")
print(f.read())
f.close()
# the same can be written using with statement like this :
with open("file.txt") as f:
    print(f.read())
    # we don't need to write f.close() because with statement automatically closes the file after the block of code is executed.
    # you dont have to explectly close the file 
    
