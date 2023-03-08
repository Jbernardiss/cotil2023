
def countLetters(textBody):

    lettersCount = {}

    for letter in textBody:
        letter = letter.lower()

        if letter not in lettersCount.keys():
            lettersCount[letter] = 1
        elif letter in lettersCount.keys():
            lettersCount[letter] += 1

    return lettersCount

def countWords(textBody):

    words = textBody.split(" ")
    wordsCount = {}

    for word in words:
        word = word.replace(",", " ")
        word = word.replace(".", " ")
        word = word.strip()
        word = word.lower()

        if word not in wordsCount.keys():
            wordsCount[word] = 1
        elif word in wordsCount.keys():
            wordsCount[word] += 1
        
    return wordsCount

f = open("./abc.txt", "r")
fContent = f.read()

lettersCount = countLetters(fContent)
wordsCount = countWords(fContent)

for letter, count in lettersCount.items():
    print(f"'{letter}': {count}")


for word, count in wordsCount.items():
    print(f"'{word}': {count}")
