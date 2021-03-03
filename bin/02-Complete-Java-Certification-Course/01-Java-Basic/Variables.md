## Variables

-  In the Java programming language, the terms "field" and "variable" are both used; this is a common source of confusion among new developers, since both often seem to refer to the same thing.

### Variable Types

1. <b>Instance Variables (Non-Static Fields):</b> 
Objects store their individual states in "non-	     static fields", that is, fields declared without the static keyword. `Non-static fields` are also known as `instance variables` because their `values are unique to each instance of a class` (to each object, in other words); the currentSpeed of one bicycle is independent from the currentSpeed of another.</br>
</br>
- <b>Class Variables (Static Fields):</b> A `class variable` is any field declared with the `static modifier`; this tells the compiler that there is `exactly one copy of this variable in existence`, regardless of `how many times the class has been instantiated`. A field defining the number of gears for a particular kind of bicycle could be marked as static since conceptually the same number of gears will apply to all instances. The code `static int numGears = 6;` would create such a static field. Additionally, the keyword `final` could be added to indicate that the number of gears will never change.
</br>
</br>
- <b>Local Variables:</b> Similar to how an object stores its state in fields, `a method will often store its temporary state in local variables.` The syntax for declaring a local variable is similar to declaring a field (for example, int count = 0;). There is no special keyword designating a variable as local; that determination comes entirely from the location in which the variable is declared — which is between the opening and closing braces of a method. As such, local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class.
</br>
</br>
- <b>Parameters:</b> Recall that the signature for the main method is `public static void main(String[] args)`. Here, the `args` variable is the `parameter` to this method. `The important thing to remember is that parameters are always classified as "variables" not "fields".` 

---

### Naming

The rules and conventions for naming your variables can be summarized as follows:

* Variable names are `case-sensitive`. 


* A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits, `beginning with a letter, the dollar sign "$", or the underscore character "_".` 


* Subsequent characters may be letters, digits, dollar signs, or underscore characters.


* Conventions (and common sense) apply to this rule as well. When choosing a name for your variables, use full words instead of cryptic abbreviations. 


* If the name you choose consists of `only one word`, spell that word in all `lowercase letters`. 


* If it consists of `more than one word`, `capitalize the first letter of each subsequent word`. The names gearRatio and `currentGear` are prime examples of this convention. 


* If your variable stores a constant value, such as `static final int NUM_GEARS = 6,` the convention changes slightly, capitalizing every letter and separating subsequent words with the underscore character. By convention, the underscore character is never used elsewhere.
