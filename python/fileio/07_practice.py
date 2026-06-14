word=["Donkey","bad","ugly","stupid","dumb"]
with open("file.txt","r") as f:
    content=f.read()
    newContent=content
    for w in word:
        newContent=newContent.replace(w,"#"*len(w)).replace(w.lower(),"#"*len(w)).replace(w.upper(),"#"*len(w))
    with open("file.txt","w") as f:
        f.write(newContent)
