marks={
    "sarthak": 100,
    "shubham": 90,
    "satyarth": 80,
    0: "ram",
}
print(marks.keys()) # to get all the keys of the dictionary
print(marks.values()) # to get all the values of the dictionary
marks.update({"sarthak": 95}) # to update the value of sarthak
print(marks["sarthak"])
marks.update({"satyam": 85}) # to update the value of satyam
print(marks)
print(marks["satyam"])
marks.get("satyam") # to get the value of satyam
print(marks.get("satyam"))
marks.get("satyam1") # to get the value of satyam1 which is not present in the dictionary
print(marks.get("satyam1")) # it will return None