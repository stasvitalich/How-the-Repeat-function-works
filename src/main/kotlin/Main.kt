// Find how many "D", "C", "B" and "A" grades the students have got
// after the last Computer Science test.
// There are n students in the class. The program gets the n number as input and then
// gets the grades one by one.
// The program should output four numbers in a single line, representing the grades from "D" to "A".
// Numbers represent the following grades: 2 is "D", 3 is "C", 4 is "B", and 5 is "A".

fun main() {
    println("Please, write how many students in the class:")
    val nStudents = readln().toInt() // Create variable for amount of students
    var sumA = 0 // Create variable to calculate how many "A" grades students have got.
    var sumB = 0 // Create variable to calculate how many "B" grades students have got.
    var sumC = 0 // Create variable to calculate how many "C" grades students have got.
    var sumD = 0 // Create variable to calculate how many "D" grades students have got.

    println("Please, write students' grades from 2 to 5: ")
    repeat(nStudents) {// Quantity of students equals quantity of grades. That's why we use "repeat" here.
        var grade = readln().toInt()
        if (grade == 2) { // If student's grade equals 2,
            sumD += 1     // we increase the score counter "D" by 1
        }
        if (grade == 3) {
            sumC += 1
        }
        if (grade == 4) {
            sumB += 1
        }
        if (grade == 5) {
            sumA += 1
        }
    }

    print("$sumD ") // Print the result of our calculations.
    print("$sumC ")
    print("$sumB ")
    print("$sumA")

    // This approach allows us to keep the necessary variables in the visibility zone.
}