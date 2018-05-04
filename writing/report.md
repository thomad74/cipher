# Report by Dillon Thoma, Ben Watto, Robert Samuel, and Jordan Wilson

## Design
For this assignment, we wanted to make a program that focused on the art and
science of sending and decoding secret messages. To do this we investigated two
different forms of cryptography. The first was a form of Caesar Cipher, which
shifts each letter by an amount given by the key. The second type was a Vigenere
cipher, which uses a word as a key to determine the shift. We used similar set
ups as previous labs, but we altered it for strings. Following this we added
algorithms to perform these functions on a string.

## Implementation
In order to implement each algorithm, we used for loops to iterate through and
perform the cipher. The single for loops in each cipher made the algorithm
quite fast, and allowed us to be efficient in our performance of both Caesar and
Vigenere Ciphers, respectively. We also tried different cases as well as symbols
and spaces in the message that was being encrypted. To do this, we had to keep
changing our implementations of the algorithms continuously, which took a lot
of time to make sure we had the correct algorithm implementation for the correct
input we were trying to encrypt. In VigenereCipher specifically, we changed the
String key multiple times to see how the encryption would be affected. For example,
we started with the word fortnite as the key, looked at the output, and then changed
the key to something like pizza, and looked at how the output was affected. We
also implemented a results table which performs a doubling experiment to evaluate
the worst-case time complexity of each Cipher. Our data shows that both ciphers
are very fast, and similar in this fashion because they both are implemented with
only one for loop. However, we had trouble figuring out what variable was supposed
to be put into the cipher.cipher() method, because we kept getting a converting
variables error. Overall, we implemented many different things and tried a lot of
different algorithms, and ultimately ended up with two different types of cipher.

##Testing
We implemented JUnit test suites for ResultsTable, CaesarCipher, and VigenereCipher,
respectively.

## Evaluation
To evaluate, we started with trial and error to see what needed to be changed
for each algorithm.
