# -Untrodden-Labs
Two problem statement given by  Untrodden Labs

--------------## Problem 1 ##------------------------
Star Tree Structure
Q. Make a function in any language of your choice, where user will give an input ‘n’ and it will display the star tree structure.
E.g. function tree(n)
 
tree(5)
Output:
_ _ * _ _
_ * _ * _
_ * * * _
* * _ * *
* * * * *
 
tree(6)
Output:
_ _ _ * _ _ _
_ _ * _ * _ _
_ _ * * * _ _
_ * * _ * * _
_ * * * * * _
* * * _ * * *

Solution:
folder named "prob1" contains java file download it then run the following commands in the terminal or command prompt. System should have jdk1.7 or above and respective jre.
Command to run solution file in Java:
Command 1: javac Tree.java
Command 2: java Tree

---------------## Problem 2 ## ---------------------
Write a for loop of (1..100) in nodejs having a random sleep loop and displaying the numbers in increasing order
(1..100)
 
//nodejs v4.2.6
 
for (i=1; i<=100; i++) {
    setTimeout(function(i) {
        console.log(i);
    }.bind(this, i), Math.random()*1000);
}
 
Above function will show random numbers on console. Use Promise or Async or any other package or method with timeout such that output is as below
Output: 
1
2
3
4
5
So on
 
Solution: 
Updated function is uploaded with file name "prob2.js". My function used promise to do the given task.
