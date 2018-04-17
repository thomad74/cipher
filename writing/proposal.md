#Cryptography and Cryptanalysis: The Test of Efficiency
##Proposal by Team 7 (Jordan Wilson, Ben Watto, Robert Samuel, and Dillon Thoma)
###Abstract:
For this project, we selected cryptography and cryptanalysis. Our goal is to implement
a cipher using Caesar and Vigenere algorithms. We will read from an input file to
send a secret message and it will be decoded after it is received. We will create
and write test cases to monitor with correctness of our writing. Then, we will run
a campaign of doubling experiments to measure the worst case time complexity.

### Main Idea:
Our main idea for this project is to create a program that can encode messages
that are read in from a user. These messages will be encoded using Caesar and
Vigenere ciphers. The encoded messages can be sent to others than decoded. To
evaluate our program we are going to use a doubling experiment. We will also be
analyzing the efficiency of our program based on the empirical and analytic data
we receive.

### Initial Listing of Task:
The first step for this program would be to research some similar programs we
have completed earlier this year to get some ideas. Next we would implement for
loops and iterators for each individual scenario that the user will face throughout.
Next we will test the efficiency of the program through test cases and doubling
experiments, such as the equals method and various others.

### Plan:
Our plan for this project is to use a similar method of implementation created in
previous labs. This combination of methods will be similar to the `ArrayList`
class of lab 9 and shift methods used in various other labs. First we will encode
the message, which is the Array List. Then we will send the message through each
type of cypher and decode them. Then in our test cases we will check to make sure
the actual output is equal to our expected output. The last part of our program
will test the efficiency of each algorithm and finally we will evaluate the results
and create a report.
