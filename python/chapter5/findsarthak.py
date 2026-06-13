post = str(input("Enter the post: ")).lower()#this will convert the input to lowercase so that we can compare it with the keywords in lowercase.
if("sarthak" in post):#this will check if the keyword "sarthak" is present in the post or not.
    print("This post is about Sarthak.")
elif("is a son of sarita mishra" in post):#this will check if the keyword "is a son of sarita mishra" is present in the post or not.
    print("This post is about Sarthak.")
else:
    print("This post is not about Sarthak.")