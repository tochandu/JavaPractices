# JavaPractices
Java Practices on Hacker Rank

**Example1 -- java-regex**

Write a class called MyRegex which 
will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

Regex for IP Address
- \d represents digits in regular expressions, same as [0-9]
- \d{1, 2} catches any one or two-digit number
- (0|1)\d{2} catches any three-digit number starting with 0 or 1.
- 2[0-4]\d catches numbers between 200 and 249.
- 25[0-5] catches numbers between 250 and 255.

[Regex Tutorial](https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285)

****--------------------------------------------------------------****

**Example2 -- java-regex**

In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?

To solve this challenge, complete the following three lines:

Write a RegEx that will match any repeated word.
Complete the second compile argument so that the compiled RegEx is case-insensitive.
Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive.
<br><br>Note: This challenge uses a custom checker; you will fail the challenge if you modify anything other than the three locations that the comments direct you to complete. To restore the editor's original stub code, create a new buffer by clicking on the branch icon in the top left of the editor.

Regex For remove duplicate words from sentence.

- \b performs a "whole words only"
- \w+ matches a word character (alphanumeric character plus underscore)
- ?: using ?: we disable the capturing group 
- \W+ \w also present their negations with \W
- using \1 it matches the same text that was matched by the first capturing group
- '+' Match 1 or more of the preceding token

[Regex Tutorial](https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285)

****--------------------------------------------------------------****

**Example3 -- Valid Username Regular Expression**

You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .

- ^ represents the starting of the string
- [A-Za-z0-9] represents whether everything is either alphabetical or digit
- $ represents the ending of the string
- \w matches any word character (Alphanumeric and underscore)

****--------------------------------------------------------------****

**Example4 -- Tag Content Extractor**

In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
Tags can be nested, but content between nested tags is considered not valid. For example, in "<h1><a>contents</a>invalid</h1>", contents is valid but invalid is not valid.
Tags can consist of any printable characters.

<(.+)>([^<>]+)(<\/1>)

- < matches the character < with index (case sensitive)

1st Capturing Group (.+)

- . matches any character (except for line terminators)
- + matches the previous token between one and unlimited times, as many times as possible, giving back as needed (greedy)
- > matches the character > with literally (case sensitive)

2nd Capturing Group ([^<>]+)

Match a single character not present in the list below [^<>]
- + matches the previous token between one and unlimited times, as many times as possible, giving back as needed (greedy)

- <> matches a single character in the list <> (case sensitive)

3rd Capturing Group (<\/1>)
- < matches the character < with index 6010 (3C16 or 748) literally (case sensitive)
- \/ matches the character / with index 4710 (2F16 or 578) literally (case sensitive)
- 1> matches the characters 1> literally (case sensitive)

****--------------------------------------------------------------****

**Example5 -- Java BigDecimal**

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).
Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

****--------------------------------------------------------------****
**Example6 -- Java Primality Test**

A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13 .
Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

****--------------------------------------------------------------****
**Example7 -- java biginteger**

In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.

****--------------------------------------------------------------****
**Example8 -- java 1d array introduction**



****--------------------------------------------------------------****
**MakingAnagrams -- Count Anagrams any String after deleting chars**
A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
The student decides on an encryption scheme that involves two large strings. The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.
Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
 