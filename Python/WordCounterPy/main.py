wordCount = 0
characterCount = 0
string = ""

print("Paste the paragraph/text you'd like to count.")

s = str(input())

for i in s:
    if characterCount == 0 and s[0] != ' ':
        wordCount = 1

    if s[characterCount] == ' ':
        wordCount += 1

    characterCount += 1

print("\n Character Count is - " + str(characterCount) + " / " + "Word Count is - " + str(wordCount))
