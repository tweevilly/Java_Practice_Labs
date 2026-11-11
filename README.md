# Java Practice Labs

Java exercises from my coursework, organized by topic in the order I learned them. Each lab is its own folder, so labs that share a class name (like `LabProgram`) never collide, and every folder can be compiled on its own.

## How it is organized

```
NN_topic/
└── NN_lab_name/
    └── ClassName.java      # file name always matches the public class
```

- **Topic folders** are numbered in curriculum order: basics, conditionals, loops, arrays, methods, classes.
- **Lab folders** are numbered within their topic and named in `snake_case`. The number is a suggested reading order, not a grade.
- A `zyBooks` tag in a lab's first comment line is the section number from the course material.
- `notes/` holds my short reference notes on ArrayList, type conversions, and classes.

## Running a lab

Every lab reads from standard input, so type the input after starting it. Use the **Main class** column below.

```bash
cd 03_loops/04_print_seats
javac *.java
java NestedLoops
```

## Labs

### 01 Basics and strings

| # | Lab | Main class | What it does |
|---|-----|------------|--------------|
| 01 | [Output pattern](01_basics_and_strings/01_output_pattern) | `LabProgram` | Prints a fixed 5-character-wide letter pattern with output statements. |
| 02 | [Arithmetic and iteration](01_basics_and_strings/02_arithmetic_and_iteration) | `LabProgram` | Reads two integers and prints three successive products, each multiplying the previous result by the multiplier. |
| 03 | [Wedding tables](01_basics_and_strings/03_wedding_tables) | `LabProgram` | Calculates how many full tables of 10 are needed for the expected number of guests. |
| 04 | [Formatted name, age, and salary](01_basics_and_strings/04_formatted_name_age_salary) | `LabProgram` | Reads a full name, age, and salary on separate lines and prints a formatted message. |
| 05 | [Name initials](01_basics_and_strings/05_name_initials) | `LabProgram` | Formats a full name as "lastInitial., firstName middleInitial." (the middle name is optional). |
| 06 | [Name format (zyBooks 3.26)](01_basics_and_strings/06_name_format) | `LabProgram` | Reformats "first [middle] last" as "last, F.M.". |
| 07 | [Login name (zyBooks 3.27)](01_basics_and_strings/07_login_name) | `LabProgram` | Builds a login name from the first six letters of the first name, the first letter of the last name, an underscore, and the last digit of a number. |
| 08 | [Palindrome](01_basics_and_strings/08_palindrome) | `LabProgram` | Reports whether a word or phrase reads the same forward and backward, ignoring case and non-alphanumeric characters. |

### 02 Conditionals

| # | Lab | Main class | What it does |
|---|-----|------------|--------------|
| 01 | [Smallest of three](02_conditionals/01_smallest_of_three) | `LabProgram` | Reads three integers and prints the smallest. |
| 02 | [Alphabetical order](02_conditionals/02_alphabetical_order_chars) | `LabProgram` | Reads three lowercase characters and prints them in alphabetical order. |
| 03 | [Digit sum divisible by 3](02_conditionals/03_digit_sum_divisible_by_3) | `LabProgram` | Reads three digits and reports whether their sum is divisible by 3; prints "Invalid input!" for a negative digit. |
| 04 | [Leap year](02_conditionals/04_leap_year) | `LabProgram` | Determines whether a year is a leap year using the Gregorian calendar rules. |
| 05 | [Exact change](02_conditionals/05_exact_change) | `LabProgram` | Converts an amount in pennies into the fewest coins (dollars, quarters, dimes, nickels, pennies), using singular and plural coin names. |
| 06 | [Interstate highway numbers](02_conditionals/06_interstate_highway_numbers) | `LabProgram` | Classifies a highway number as primary or auxiliary, names the primary highway an auxiliary route serves, and reports whether a primary highway runs north/south or east/west. |

### 03 Loops

| # | Lab | Main class | What it does |
|---|-----|------------|--------------|
| 01 | [Read next input](03_loops/01_read_next_input) | `ResultCalculator` | Loops until a negative number is read, printing "win" or "lose" for each value (win when divisible by 3). |
| 02 | [Sum and smallest](03_loops/02_sum_and_smallest) | `LabProgram` | Reads non-negative integers until a negative one, then prints the smallest value and the sum. |
| 03 | [Is all digits](03_loops/03_is_all_digits) | `LabProgram` | Prints Yes if every character of the input string is a digit 0-9, otherwise No. |
| 04 | [Print seats](03_loops/04_print_seats) | `NestedLoops` | Prints every seat label in a theater (1A, 1B, 2A, ...) with nested loops. |
| 05 | [Nested loop histogram (zyBooks 4.7.2)](03_loops/05_nested_loop_histogram) | `IntHistogram` | Prints an asterisk histogram for each integer entered, until a negative number is entered. |
| 06 | [Greatest common divisor](03_loops/06_greatest_common_divisor) | `GCDCalc` | Computes the GCD of two positive integers with Euclid's algorithm. |
| 07 | [Hailstone sequence](03_loops/07_hailstone_sequence) | `LabProgram` | Prints the hailstone sequence for an integer, ten values per line separated by tabs. |
| 08 | [Break and continue](03_loops/08_break_and_continue) | `BreakAndContinue` | Demonstrates break and continue inside nested loops. |
| 09 | [Simon Says](03_loops/09_simon_says) | `SimonSays` | Simon Says memory game: works with a 10-character sequence of R, G, B, and Y. |

### 04 Arrays and ArrayLists

| # | Lab | Main class | What it does |
|---|-----|------------|--------------|
| 01 | [Average of three doubles](04_arrays_and_arraylists/01_average_of_three_doubles) | `LabProgram` | Stores three doubles in an array and prints their average. |
| 02 | [2D array min and max](04_arrays_and_arraylists/02_array_2d_min_max) | `ArraysKeyValue` | Finds the minimum and maximum values in a 2D array (milesTracker). |
| 03 | [Matrix multiplication](04_arrays_and_arraylists/03_matrix_multiplication) | `LabProgram` | Multiplies a 1xN matrix by an NxN matrix and prints the 1xN result. |
| 04 | [Array statistics](04_arrays_and_arraylists/04_array_statistics) | `LabProgram` | Prints the minimum, maximum, mean, median, mode, and whether an array is a palindrome. |
| 05 | [Is array sorted](04_arrays_and_arraylists/05_is_array_sorted) | `LabProgram` | Prints yes if a list is sorted in ascending order between two given positions, otherwise no. |
| 06 | [Nth from end](04_arrays_and_arraylists/06_nth_from_end) | `LabProgram` | Prints the Nth number from the end of a list; a negative input ends the list and supplies N. |
| 07 | [Values below a threshold (zyBooks 5.15)](04_arrays_and_arraylists/07_values_below_threshold) | `LabProgram` | Prints every integer in a list that is less than or equal to a threshold value. |
| 08 | [Normalize a list (zyBooks 5.16)](04_arrays_and_arraylists/08_normalize_list) | `LabProgram` | Divides every value in a list by the largest value. |
| 09 | [Word frequencies (arrays) (zyBooks 5.17)](04_arrays_and_arraylists/09_word_frequencies_array) | `LabProgram` | Reads a list of words and prints each word with how many times it appears. |
| 10 | [Words containing a character (zyBooks 5.18)](04_arrays_and_arraylists/10_words_containing_character) | `LabProgram` | Prints every word in a list that contains a given character. |
| 11 | [ArrayList nth element (zyBooks 7.14.1)](04_arrays_and_arraylists/11_arraylist_nth_element) | `MostPopularOS` | Uses ArrayList.get() to print the Nth most popular operating system. |

### 05 Methods

| # | Lab | Main class | What it does |
|---|-----|------------|--------------|
| 01 | [Volume of a pyramid (zyBooks 6.1.3)](05_methods/01_volume_of_pyramid) | `CalcPyramidVolume` | pyramidVolume(): volume of a pyramid with a rectangular base. |
| 02 | [Returns and voids (zyBooks 6.1.4)](05_methods/02_returns_and_voids) | `ValueCalculator` | calculateVal(): returns the first parameter minus twice the second. |
| 03 | [Print methods (zyBooks 6.2.3)](05_methods/03_print_methods_capital) | `Capital` | Print methods that output a country's capital. |
| 04 | [Method stubs (zyBooks 6.3.2)](05_methods/04_method_stubs_statistics) | `MthdStubsStatistics` | Stubs that print "FIXME: Finish methodName()" and return -1. |
| 05 | [Least common multiple (zyBooks 6.6.2)](05_methods/05_least_common_multiple) | `LeastCommonMultiple` | findLCM() and helpers keep main() short while computing a least common multiple. |
| 06 | [Inspect values (zyBooks 6.6.2)](05_methods/06_inspect_vals) | `ValueInspector` | inspectVals(Scanner): returns true if no value before -1 is between 900 and 1000. |
| 07 | [Step counter](05_methods/07_step_counter) | `LabProgram` | feetToSteps(): converts feet walked to steps at 2.5 feet per step. |
| 08 | [Acronyms](05_methods/08_acronyms) | `LabProgram` | createAcronym(): builds an acronym from the words that start with an uppercase letter. |
| 09 | [Count characters](05_methods/09_count_characters) | `LabProgram` | calcNumCharacters(): counts how many times a character appears in a string. |
| 10 | [Remove non-alphabetic characters](05_methods/10_remove_non_alphabetic) | `LabProgram` | removeNonAlpha(): strips every non-alphabetic character from a string. |
| 11 | [Swap adjacent pairs (zyBooks 6.26)](05_methods/11_swap_adjacent_pairs) | `LabProgram` | swapValues(): swaps array elements at indices 0 and 1, and at indices 2 and 3. |
| 12 | [Flip a coin (zyBooks 6.27.1)](05_methods/12_flip_a_coin) | `LabProgram` | coinFlip(Random): returns Heads or Tails; main prints the requested number of flips. |
| 13 | [Random show results](05_methods/13_random_show_results) | `LabProgram` | showResults(Random): returns "true" or "false" from a random 0 or 1. |
| 14 | [Sort an array (zyBooks 6.28)](05_methods/14_sort_an_array) | `LabProgram` | sortArray(): sorts an integer array. |
| 15 | [Word frequencies (methods) (zyBooks 6.29)](05_methods/15_word_frequencies_methods) | `LabProgram` | getWordFrequency(): counts case-insensitive occurrences of a word in an array. |
| 16 | [Fibonacci sequence (zyBooks 6.30)](05_methods/16_fibonacci_sequence) | `LabProgram` | Computes values of the Fibonacci sequence (0, 1, 1, 2, 3, ...). |
| 17 | [Convert to binary](05_methods/17_convert_to_binary) | `LabProgram` | intToReverseBinary() and stringReverse() together print an integer in binary. |
| 18 | [Convert to binary (single method)](05_methods/18_convert_to_binary_single_method) | `LabProgram` | Variant that builds the binary string in the correct order, so stringReverse() is not needed. |
| 19 | [Contact list](05_methods/19_contact_list) | `LabProgram` | Parses comma-separated name/phone pairs into two arrays and looks up a number by name; prints None if not found. |
| 20 | [Carpet sales (zyBooks 13.18)](05_methods/20_carpet_sales) | `LabProgram` | Computes carpet, labor, tax, and total cost for each room order, plus total sales. |

### 06 Classes and objects

| # | Lab | Main class | What it does |
|---|-----|------------|--------------|
| 01 | [Simple car](06_classes_and_objects/01_simple_car) | `LabProgram` | SimpleCar class that drives forward and in reverse; LabProgram reads the miles and reports the result. |
| 02 | [Calculator](06_classes_and_objects/02_calculator) | `LabProgram` | Calculator class with add, subtract, multiply, divide, and clear on a private value field. |
| 03 | [Random values](06_classes_and_objects/03_random_values) | `LabProgram` | RandomNumbers class that sets three instance variables to random numbers within a given range. |
| 04 | [Consecutive heads](06_classes_and_objects/04_consecutive_heads) | `LabProgram` | GVCoin class plus a method that flips until a goal number of consecutive heads is reached. |
| 05 | [Car value](06_classes_and_objects/05_car_value) | `CarValue` | Car class with purchase-price getter/setter and printInfo(), plus a CarValue driver. |
| 06 | [Vending machine](06_classes_and_objects/06_vending_machine) | `LabProgram` | VendingMachine class that simulates purchasing drinks, restocking bottles, and checking inventory. |
| 07 | [Nutritional info](06_classes_and_objects/07_nutritional_info) | `NutritionalInfo` | FoodItem class with constructors and nutrition calculations, plus a driver. |
| 08 | [Artwork label](06_classes_and_objects/08_artwork_label) | `ArtworkLabel` | Artist and Artwork classes with constructors, getters, and printInfo(); ArtworkLabel builds a label from them. |
| 09 | [Courses](06_classes_and_objects/09_courses) | `LabProgram` | Course class (an ArrayList of Student objects), a Student class, and a LabProgram driver. |
| 10 | [Soccer team (zyBooks 7.6.1)](06_classes_and_objects/10_soccer_team) | `SoccerTeamPrinter` | SoccerTeam and TeamPerson classes with a SoccerTeamPrinter driver. |
| 11 | [Customer age](06_classes_and_objects/11_customer_age) | `CustomerAge` | Customer class with setName()/setAge(); CustomerAge reads input and sets two customer objects. |
| 12 | [Debt ratio](06_classes_and_objects/12_debt_ratio) | `DebtMeasure` | Debt class with private fields, setDR(), and getDR(); DebtMeasure reads totals and prints the ratio. |
| 13 | [Pet info](06_classes_and_objects/13_pet_info) | `PetInfo` | Pet class with fields, constructors, getters, and setters; PetInfo prints the pet details. |
| 14 | [Duck override](06_classes_and_objects/14_duck_override) | `DuckInfo` | RubberDuck and MallardDuck extend Duck and override getBehavior(). |
| 15 | [Grocery ArrayList](06_classes_and_objects/15_grocery_arraylist) | `CustomerInfo` | Customer keeps an ArrayList of Grocery objects; CustomerInfo reads input and prints the list. |

## Reference notes

- [`notes/arraylist.md`](notes/arraylist.md): ArrayList declaration, import, and core methods
- [`notes/type_conversions.md`](notes/type_conversions.md): wrapper classes and autoboxing
- [`notes/classes_and_instance_methods.md`](notes/classes_and_instance_methods.md): instantiation and instance methods

## Bigger Java project

See [Web-Based_Inventory_Application](https://github.com/tweevilly/Web-Based_Inventory_Application) (Spring Boot, Thymeleaf, Spring Data JPA).
