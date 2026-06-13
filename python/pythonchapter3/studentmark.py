student=[]
for i in range(1,6):
    name=input("enter the name of student: ")
    mark=int(input("enter the mark of student: "))
    student.append((name,mark))

# Sort students by marks in descending order
student.sort(key=lambda x: x[1], reverse=True)
print(student)