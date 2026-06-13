import pyttsx3
engine = pyttsx3.init()
list1=["Apple","Orange",1,3,4]
engine.say("The list is ")
for item in list1:
    engine.say(str(item))
engine.runAndWait()
# sort the list (convert items to strings for a consistent comparison)
list1.sort(key=lambda x: str(x).lower())
print(list1)
list1.reverse()
print(list1)
list1.append("Banana")
list1.index("Banana")
print(list1)
list1.pop(2)  # removes the item at index 2
print(list1)