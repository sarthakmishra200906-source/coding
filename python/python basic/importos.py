import os
# specify the directry 
directory_path='/' 
# list all files and directory in specified path 
contents = os.listdir(directory_path)
# print each file and directory name
for item in contents:
    print(item)