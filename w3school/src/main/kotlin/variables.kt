fun main() {
    var name = "John" // String (text)
    val birthyear = 1975 // Int (number)

    println(name)
    println(birthyear)

    // Explicit data type declaration
    var name2: String = "Jane"
    val birthyear2: Int = 1973

    println(name2)
    println(birthyear2)

    // `val` keyword = immutable, cannot be changed/reassigned
    // `var` keyword = mutable, can be changed
    // `val` is useful for storing the same value like PI
    val pi = 3.14159
    println(pi)

    // Display variables: combining both text and a variable using `+`
    println("Hello " + name)

    // Display variables: combining multiple variables using `+`
    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
    println(fullName)

    // Display variables: combining numeric values with math operator
    val x = 5
    val y = 6
    println(x + y) // Print the values of x + y

    /*
     Variable names: General rule
     - Names can contain letters, digits, underscores, and dollar signs
     - Names should start with a letter
     - Names can also being with $ and _ (but we will not use it in this tutorial)
     - Names are case-sensitive ("myVar" and "myvar" are different variables)
     - Names should start with a lowercase letter and it cannot contain whitespace
     - Reserved words (like Kotlin keywords, such as var or String) cannot be used as names

     camelCase variables
     - firstName and lastName
     - good practice for easier read when you have a variable name with different words in it.
     */

}