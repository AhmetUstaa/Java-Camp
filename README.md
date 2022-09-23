# About Repository

This repository contains Java Bootcamp documentation like lesson codes, assignments, and final project. Also i will **try** to give to you extra tips about java programming language informations on a weekly basis. 

    - Publisher : https://www.kodlama.io
    - Youtube Channel : https://www.youtube.com/channel/UCRjiquPh4mjPNoOV9eCilXQ
    - Instructor : https://www.linkedin.com/in/engindemirog/
    - Bootcamp Date : 09/14/2022
    
    
    
# Extra tips about week 1 works on lesson and homework;

> In the Java programming language, variable names are written as **camelCase**.

> **(i++)** means to every single action **increase** to (i) by 1. As you might have guessed **(i--)** means about **decreasing** by 1.

> You have to be careful about this scenario. You have to write code like this **System.out.println(variableName)** when you try to print any variable. Not like this **System.out.println("variableName")**. If you want to try, try if you dare.

> Java is a **Case Sensitive** language. Which means *variable = "a"* different between *variable = "A"*.

> Reusability is an important method in programming. 

> Variable names should be clear for readability when performing reverse engineering activities. Abbreviations should be avoided.

> Some information about **Data Types**.

|Data Type| 	Size 	|Description|Example|Notes|
|---------|-------------|-----------|-------|-----|
|byte| 	1 byte |	Stores whole numbers from -128 to 127|byte number = 127;||
|short| 	2 bytes 	|Stores whole numbers from -32,768 to 32,767|short number = 32767; ||
|int| 	4 bytes 	|Stores whole numbers from -2,147,483,648 to 2,147,483,647|int number = 1881;||
|long 	|8 bytes 	|Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|long tcIdNumber = 12345678910|Best practice it should be the String|
|float 	|4 bytes 	|Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits|float number = -0,05; ||
|double |	8 bytes 	|Stores fractional numbers. Sufficient for storing 15 decimal digits|long number = 0,01234567897894561;||
|boolean |	1 bit 	|Stores true or false values|boolean isThatTrue = true;||
|char 	|2 bytes 	|Stores a single character/letter or ASCII values|char value = 'J';|Should be '', ASCII|


> Should be use **==** when you want to **control** about equal **condition**, otherwise an equal symbol is to assign a value.

> About Defensive Programming;

    1- Never trust user datas and inputs. 
    2- Determine the data types. Double-check is necessary.
    3- When the developer changes, the way they work and their attention will not be the same. Have the written methods checked at each layer.
    4- Follow the SOLID rules. 
        - S ----> Single Responsibility
        - O ----> Open / Closed
        - L ----> Liskov's Substitution
        - I ----> Interface Segregation
        - D ----> Dependency Inversion

   [Also check about SOLID Software Development](https://gokhana.medium.com/solid-nedir-solid-yaz%C4%B1l%C4%B1m-prensipleri-nelerdir-40fb9450408e)
  
  > You can write codes like this when you want to give to user same output sometimes;
  
 	case 'B':
 	case 'C':

  > The **switch case** structure was created as an alternative to the if-else structure. Instead of creating long if else conditions, we can make a short program with the switch case structure. But we can't use switch case in conditions where there is a range, switch case checks the value directly.
  
  > * For Loop Definition;
  >     * for(int i = 1; i < 10; i++);
  >          * int i = 1 ---> counter definition
  >          * i < 10 ------> condition
  >          * i++ ---------> amount of the increase
  
  > While / Do-While Loop [ check about ](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw27LoopDemo.java)
  
  > String name -----> one string
  > String[] --------> single line array
  > String[][] ------> column +
  
  > Nested Loop [check about](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw210MultiDimensionalArrayDemo.java)
  
   |Method|Description|Example|
   |------|-----------|-------|
   |charAt()|The charAt() method returns the character at a specified index (position) in a string.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |concat()|The concat() method is used to merge two or more arrays. This method does not change the existing arrays, but instead returns a new array.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |startsWith()|The startsWith() method checks whether a string starts with the specified character(s).|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |endsWith()|The endsWith() method checks whether a string ends with the specified character(s).|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |getChars()|The Java String class getChars() method copies the content of this string into a specified char array.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |indexOf()|The indexOf() method returns the position of the first occurrence of specified character(s) in a string.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |lastIndexOf()|The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |replace()|The Java String class replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |substring()|The substring() method extracts a substring from the string and returns it.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |split()|The java string split() method splits this string against given regular expression and returns a char array.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |trim()|The trim() method removes whitespace from both ends of a string.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |toLower()|The toLowerCase() method converts a string to lower case letters.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   |toUpper()|The toUpperCase() method converts a string to upper case letters.|[check](https://github.com/AhmetUstaa/JavaCamp2022/blob/master/javaCampHomeworks2022/Week1Homework/Week1Homework/hw211StringsDemo.java)|
   
   
# Extra tips about week 2 works on lesson and homework;

to be continued...
   
   
    
    
    
