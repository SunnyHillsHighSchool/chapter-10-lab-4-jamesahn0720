# Chapter-10-Lab-4
Lab Goal :   The lab was designed to teach you how to use arrays to simplify solving more complex problems. 

Lab Description :   In this program, you are to create a Roman Numeral class to handle roman numeral operations.

Files: RumanNumeral.java
       Main.java

How to convert a Roman Numeral to a standard base ten number : :  Locate the first individual roman number in the roman number string.  Sum up the numeric value of the individual number.  Chop of the individual roman numeral from the string and continue the process if the string has more numbers left.

How to convert a standard base ten number to a Roman Numeral : :  Find the first Roman numeral less than the number.   Add the roman numeral to a string.  Subtract the value of the Roman Numeral from the number.   Repeat this until the original number is less than the current Roman Numeral.   Move to the next Roman Numeral in the list and repeat the process.

algorithm help

basic logic to convert an int to roman

loop through the array of numbers
   while orig num >= curr number
       add roman to string


Sample Data : 
10
100
1000
2500
1500
23
38
49
LXXVII 
XLIX
XX
XXXVIII	



Sample Output : 
10 is X

100 is C

1000 is M

2500 is MMD

1500 is MD

23 is XXIII

38 is XXXVIII

49 is XLIX

LXXVII is 77

XLIX is 49

XX is 20

XXXVIII is 38
