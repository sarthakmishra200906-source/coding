f= open("myfile.txt")
c=f.read()
if("twinkel" in c):
    print("twinkel is present in the file")
else:
    print("twinkel is not present in the file")
f.close()