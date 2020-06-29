# Repeated-Dna-Sequences
Function to find all the 10-letter-long sequences that occur more than once in a DNA molecule.

This function uses a HashSet to store all the sequences of DNA and uses a for loop to iterate over the string
containing the DNA combination. This function takes a string of DNA combination as input, and returns a list of 
strings to the user. 

The time complexity of this program is O(n), where n is the length of the string because we have to iterate over
the whole length of the string. 

The space complexity of this program is O(n) as well because we have to create a HashSet to store all unique DNA
combinations, and a list to store all repeated combinations.
