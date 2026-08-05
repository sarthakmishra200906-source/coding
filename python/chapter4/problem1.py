words={
    "madad":"help",
    "kursi":"chair",
    "pankha":"fan"
}
word=input("enter the word in hindi: ")
# print(words[word]) # to get the meaning of the word entered by the user, if the word is not found in the dictionary it will throw an error
print(words.get(word, "Word not found in the dictionary"))# to get the meaning of the word entered by the user, if the word is not found in the dictionary it will return "Word not found in the dictionary"