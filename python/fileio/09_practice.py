with open("log.txt") as f:
  content=f.read()
with open("this_copy.txt","w")as f:
    f.write(content)
