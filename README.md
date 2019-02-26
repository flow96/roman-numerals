Coding Kata - Roman Numerals - Java
===
This kata contains a simple problem than can be used for start learning a new language like Java.

It already contains the src/main/test folders for writing the corresponding tests.
So you can use it directly for your testdriven approach.

### Things you should consider
**This excercie is not about solving the problem quickly nor about the fanciest solution.**

Write the cleanest code you can considering the following principles:
* Keep you solution simple and understandable -> KISS
* Avoid repeating yourself as much as possible (even between production and test classes) -> DRY

You should be able to answer the following questions afterwards:
1. What have you learned this time?
2. What would you try differently next time when doing the kata?
3. What part of your solution are you especially proud of?

### Problem description
Your task is to provide the possibility to convert any arabic number (like 1, 2, 20, 999, etc) into the corrsponding String of its roman numerals representation (like I, II, XX, CMXCIX, etc).

A smaller number in front of a larger number means subtraction, everything else means addition. For example, IV means 4, VI means 6.

You would not put more than one smaller number in front of a larger number to subtract. For example, IIV would not mean 3.

You must separate ones, tens, hundreds, and thousands as separate items. That means that 99 is XCIX (90+9), and not IC (100-1). Similarly, 999 cannot be IM and 1999 cannot be MIM.

|Symbol|Value|
|------|-----|
|I| 	The numeral one. II is two, III is three.|
|V| 	The numeral 5. IV is 4, VI is 6, VII is 7, VIII is 8.|
|X| 	The numeral 10. IX is 9, XI is 11, etc.|
|L| 	The numeral 50. XL would be 40.|
|C| 	The numeral 100. Think of Century having a hundred years. C is short for the Latin word Centum, but that's not very easy to remember.|
|D| 	The numeral 500.|
|M| 	The numeral 1000.|


### Downloading the kata
By cloning this repository using git
```
git clone https://github.com/tomthegump/roman-numerals
```
...or downloading it in as a zip file

#### IntelliJ IDEA
When using IDEA as your preferred IDE you can simply import from the build.gradle file.

#### Import into eclipse
Please download the buildship plugin for eclipse (make eclipse ready to import from gradle files) from here: http://projects.eclipse.org/projects/tools.buildship
...or follow the instrcutions for this plugin from Lars Vogel:
http://www.vogella.com/tutorials/EclipseGradle/article.html
# roman-numerals
