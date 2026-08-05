class demo:
    a = 4


o = demo()
o.a = 0
# dose it change class atribute a?
print(demo.a)  # it will print 4 because we have changed the value of a in object o not in class demo
print(o.a)  # it will print 0 because we have changed the value of a in object o not in class demo
print(demo.a)  # it will print 4 because we have changed the value of a in object o not in class demo
