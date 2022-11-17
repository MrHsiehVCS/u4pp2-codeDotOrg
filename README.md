# u4pp1

In this programming project, you will be detecting which years are leap years, writing some math helper functions, and creating a helper class for reading user input.

## PART A - LeapYear.java

For **PART A**, you need to create the `public static` method `isLeapYear(int year)` in a class called `LeapYear`. A `year` is a leap year based on the following rules:

1. Everything before 1582 is not a leap year
2. Every year between 1582 and now that is exactly divisible by four is a leap year.
   - Years that are evenly divisible by 100 are not leap years unless they are evenly divisible by 400
   - - Example: 1700, 1800, and 1900 are not leap years
   - - Example: 1600 and 2000 are leap years

Your function should `return true` if the argument is a leap year and `false` if the year is not a leap year.

## PART B - `MyMath.java`

For **Part B** you are going to create the class `MyMath`. This class simulates some of the methods of the `Math` class. You are not permitted to use the `Math` class at all (pretend it doesn't exist). You will need to complete:

- `static int abs(int x)` which returns the absolute value of the parameter.
- `static double abs(double x)` which returns the absolute value of the parameter.
- `static double pow(double base, int exponent)` which raises the base to the power of the exponent. You can assume that the exponent is greater than or equal to 0.
- `static int perfectSqrt(int x)` which returns the square root of x if there is a whole number that is a square root. It returns -1 otherwise.

You may include any other `private` methods and instance variables you think applicable. You should have nothing else that is `public` other than what is listed above.

## PART C - InputHelper.java

Isn't it annoying to keep writing the same code to check if someone's input is what we want? We'll make a helper class that does that for us. 

You will create the `InputHelper` class that has the following `public` methods:

- `InputHelper(Scanner scanner)` - a constructor which takes in a scanner that is used to read the input
- `public boolean getYesNoInput(String prompt)` - takes in a prompt, asks the player the prompt. Everytime the player does not answer something that starts with a `y`, `Y`, `n`, or `N`, it tell the player that their input is invalid, and asks them the prompt again. Loops until proper input is given, at which point, it returns a `true` for yes and `false` for no.
- `public int getIntegerInput(String prompt, int min, int max)` - does the same thing as `getYesNoInput`, except for a few differences: Repeatedly prompts until a proper integer input is given. The integer must be larger than or equal to `min`, and less than or equal to `max`.

You will use these functions in the second half of the unit project :)

## Grading Rubric

- Proper formatting/indentation: 2 points
- Correctly JavaDoc'ed all Code: 2 points
- Has no public members other than those specified: 2 points
- Pass all LeapYear test cases (`mvn package`): 3 pts
- Pass all MyMath test cases: 3 pts
- InputHelper functionality (tested manually): 3 pts

Total: 15 points
