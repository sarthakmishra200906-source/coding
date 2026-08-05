def rem(l, word):
    # Build a new list instead of changing the original list.
    n = []

    # Replace every occurrence of the target text in each item.
    for item in l:
        n.append(item.replace(word, ""))

    return n

 # Sample data to test the function.
l = ["sarthak", "soham", "matyarth", "satyarth", "satyarth"]
print(rem(l,"th"))