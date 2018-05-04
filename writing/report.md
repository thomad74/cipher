# Report by Dillon Thoma, Ben Watto, Robert Samuel, and Jordan Wilson

## Design
For this assignment, we wanted to make a program that focused on the art and
science of sending and decoding secret messages. To do this we investigated two
different forms of cryptography. The first was a form of Caesar Cipher, which
shifts each letter by an amount given by the key. The second type was a Vigenere
cipher, which uses a word as a key to determine the shift. We used similar set
ups as previous labs, but we altered it for strings. Following this we added
algorithms to perform these functions on a string. We designed this program to
be able to cipher through a string two different ways, and compare the results
later in the experiment. The two different cipher methods were quite similar, and
both required a single for loop in their implementation. We also designed our
strings that we were encrypting in a humorous way related to Computer Science,
to add even more fun to what we had creating this project already!

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
respectively. For the test cases in ResultsTable, we implemented four different
tests that would make sure it was working properly. The first was to ensure that
the ResultsTable was not empty, or null. This involved the assertTrue method to
prove that the ResultsTable did not equal (!=) null. Second, we implemented a test
case that shows that our ResultsTable contains a ratio in it. We did this by
using the addResult method to add the results of the experiment to the table, and
the assertEquals method to make sure the table was the same as what it was expected
to be. The third and fourth test cases made sure that the ResultsTable had at
least two rows, and that that table did not crash with two rows in it. This was
achieved and implemented similarly to the second test case, by using the addResult
and assertEquals methods, respectively. To make sure it did not crash, we needed
to also add the assertTrue method like in the first test case, and make sure it
did not equal null when we used the toString method for our table. We implemented
tests to make sure the actual output from our algorithms was equal to the expected.
To do this we used the assertEquals method. For the CaesarCipher, if the input was
A and we had a shift of 1 then the output would be B. We did this for the first
three letters of the alphabet to make sure the algorithm wasn't coincidentally
correct. Another step we took was for the VigenereCipher. The test cases were
more difficult for this because it involved the use of a key and the test cases
are only correct if the Key String remains the same. We used a similar method to
create this test suite, which was finding what we expected the output to be for
the first three letters of the alphabet and set it equal to the actual. If true
the test cases would pass and it would show us that our algorithms are correct.

## Evaluation
To evaluate, we started with trial and error to see what needed to be changed
for each algorithm.
