#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Define a structure for a complex number: a + bi
typedef struct {
    double real;
    double imag;
} Complex;

// Define PI for trigonometric conversions (for basic scientific functions)
#define PI 3.14159265358979323846

// --- Complex Number Functions ---
Complex complex_add(Complex a, Complex b);
Complex complex_subtract(Complex a, Complex b);
Complex complex_multiply(Complex a, Complex b);
Complex complex_divide(Complex a, Complex b);
Complex complex_conjugate(Complex a);
void print_complex(Complex c);

// --- Main Program ---
int main() {
    int choice;
    double n1, n2, result_double;
    Complex c1, c2, result_complex;

    printf("--- ADVANCED CALCULATOR (Complex & Basic) ---\n");
    printf("1. Complex Addition (c1 + c2)\n");
    printf("2. Complex Subtraction (c1 - c2)\n");
    printf("3. Complex Multiplication (c1 * c2)\n");
    printf("4. Complex Division (c1 / c2)\n");
    printf("5. Complex Conjugate\n");
    printf("--------------------------------------------\n");
    printf("6. Basic Addition (+)\n");
    printf("7. Basic Subtraction (-)\n");
    printf("8. Basic Multiplication (*)\n");
    printf("9. Basic Division (/)\n");
    printf("10. Square Root (sqrt)\n");
    printf("11. Power (x^y)\n");
    printf("0. Exit\n");

    while (1) {
        printf("\nSelect an operation (0-11): ");
        if (scanf("%d", &choice) != 1) {
            printf("Invalid input. Please enter a number.\n");
            while(getchar() != '\n'); // Clear buffer
            continue;
        }

        if (choice == 0) {
            printf("Exiting Calculator. Goodbye!\n");
            break;
        }

        // --- Complex Operations (1-5) ---
        if (choice >= 1 && choice <= 5) {
            printf("Enter real and imaginary part for C1 (e.g., 2.5 1.5 for 2.5 + 1.5i):\n");
            if (scanf("%lf %lf", &c1.real, &c1.imag) != 2) {
                printf("Invalid input for C1.\n");
                while(getchar() != '\n');
                continue;
            }
            if (choice <= 4) { // Needs C2 for Add, Sub, Mul, Div
                printf("Enter real and imaginary part for C2:\n");
                if (scanf("%lf %lf", &c2.real, &c2.imag) != 2) {
                    printf("Invalid input for C2.\n");
                    while(getchar() != '\n');
                    continue;
                }
            }
        }
        
        // --- Basic Operations (6-11) ---
        else if (choice >= 6 && choice <= 11) {
            if (choice == 10) { // sqrt
                printf("Enter a single number: ");
                if (scanf("%lf", &n1) != 1) {
                    printf("Invalid input.\n");
                    while(getchar() != '\n');
                    continue;
                }
            } else if (choice == 6 || choice == 7 || choice == 8 || choice == 9 || choice == 11) { // Others
                printf("Enter two numbers (n1 n2): ");
                if (scanf("%lf %lf", &n1, &n2) != 2) {
                    printf("Invalid input.\n");
                    while(getchar() != '\n');
                    continue;
                }
            }
        }
        
        // --- Invalid Choice ---
        else {
            printf("Invalid choice! Please select 0-11.\n");
            continue;
        }


        switch (choice) {
            // --- Complex Operations ---
            case 1: // Complex Add
                result_complex = complex_add(c1, c2);
                printf("Result: ");
                print_complex(result_complex);
                break;
            case 2: // Complex Subtract
                result_complex = complex_subtract(c1, c2);
                printf("Result: ");
                print_complex(result_complex);
                break;
            case 3: // Complex Multiply
                result_complex = complex_multiply(c1, c2);
                printf("Result: ");
                print_complex(result_complex);
                break;
            case 4: // Complex Division
                if (c2.real == 0.0 && c2.imag == 0.0) {
                    printf("Error: Division by zero complex number.\n");
                } else {
                    result_complex = complex_divide(c1, c2);
                    printf("Result: ");
                    print_complex(result_complex);
                }
                break;
            case 5: // Complex Conjugate
                result_complex = complex_conjugate(c1);
                printf("Conjugate of "); print_complex(c1);
                printf(" is: "); print_complex(result_complex);
                break;

            // --- Basic Arithmetic ---
            case 6: // Basic Add
                result_double = n1 + n2;
                printf("Result: %.2lf\n", result_double);
                break;
            case 7: // Basic Subtract
                result_double = n1 - n2;
                printf("Result: %.2lf\n", result_double);
                break;
            case 8: // Basic Multiply
                result_double = n1 * n2;
                printf("Result: %.2lf\n", result_double);
                break;
            case 9: // Basic Division
                if (n2 != 0) {
                    result_double = n1 / n2;
                    printf("Result: %.2lf\n", result_double);
                } else {
                    printf("Error: Division by zero is not allowed.\n");
                }
                break;

            // --- Advanced Math ---
            case 10: // Square Root
                if (n1 >= 0) {
                    result_double = sqrt(n1);
                    printf("Result: %.2lf\n", result_double);
                } else {
                    printf("Error: Cannot calculate square root of a negative number.\n");
                    // Note: For complex numbers, this is handled differently, but we keep it simple here.
                }
                break;
            case 11: // Power
                result_double = pow(n1, n2);
                printf("Result: %.2lf\n", result_double);
                break;
        }
    }

    return 0;
}

// --- Function Definitions ---

/**
 * Complex Addition: (a + bi) + (c + di) = (a + c) + (b + d)i
 */
Complex complex_add(Complex a, Complex b) {
    Complex temp;
    temp.real = a.real + b.real;
    temp.imag = a.imag + b.imag;
    return temp;
}

/**
 * Complex Subtraction: (a + bi) - (c + di) = (a - c) + (b - d)i
 */
Complex complex_subtract(Complex a, Complex b) {
    Complex temp;
    temp.real = a.real - b.real;
    temp.imag = a.imag - b.imag;
    return temp;
}

/**
 * Complex Multiplication: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
 */
Complex complex_multiply(Complex a, Complex b) {
    Complex temp;
    temp.real = a.real * b.real - a.imag * b.imag;
    temp.imag = a.real * b.imag + a.imag * b.real;
    return temp;
}

/**
 * Complex Division: (a + bi) / (c + di) = [(ac + bd) / (c^2 + d^2)] + [(bc - ad) / (c^2 + d^2)]i
 */
Complex complex_divide(Complex a, Complex b) {
    Complex temp;
    double denominator = b.real * b.real + b.imag * b.imag;

    if (denominator == 0.0) {
        temp.real = NAN; // Not a Number
        temp.imag = NAN;
        return temp;
    }

    temp.real = (a.real * b.real + a.imag * b.imag) / denominator;
    temp.imag = (a.imag * b.real - a.real * a.imag) / denominator; // Corrected: (bc - ad)
    // Note: The formula for imaginary part is actually: (b.imag*a.real - a.imag*b.real)
    // The previous formula in the division function was: temp.imag = (a.imag * b.real - a.real * a.imag) / denominator;
    // Which should be: (a.imag * b.real - a.real * b.imag) / denominator
    temp.imag = (a.imag * b.real - a.real * b.imag) / denominator;
    return temp;
}

/**
 * Complex Conjugate: The conjugate of z = a + bi is z̄ = a - bi
 */
Complex complex_conjugate(Complex a) {
    Complex temp;
    temp.real = a.real;
    temp.imag = -a.imag;
    return temp;
}

/**
 * Function to print complex number in a standard format: a + bi or a - bi
 */
void print_complex(Complex c) {
    if (isnan(c.real) || isnan(c.imag)) {
        printf("Undefined\n");
        return;
    }
    if (c.imag >= 0) {
        printf("%.2lf + %.2lfi\n", c.real, c.imag);
    } else {
        // Use fabs() to print as positive after the minus sign
        printf("%.2lf - %.2lfi\n", c.real, fabs(c.imag));
    }
}