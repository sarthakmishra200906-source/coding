#include <stdio.h>
#include <string.h>
#include <ctype.h>

char infix[100], operator[50], postfix[100];
int top_operator = -1;
int top_postfix = -1;

// Function to define operator precedence
int precedence(char ch) {
    if (ch == '+' || ch == '-') return 1;
    if (ch == '*' || ch == '/' || ch == '%') return 2;
    return 0;
}

void push_operator(char ch) {
    operator[++top_operator] = ch;
}

char pop_operator() {
    return operator[top_operator--];
}

void push_postfix(char ch) {
    postfix[++top_postfix] = ch;
}

int main() {
    printf("Enter Infix expression: ");
    scanf("%s", infix);

    for (int i = 0; infix[i] != '\0'; i++) {
        char symbol = infix[i];

        // 1. If it's an operand, add it to postfix
        if (isalnum(symbol)) {
            push_postfix(symbol);
        } 
        // 2. If it's '(', push to operator stack
        else if (symbol == '(') {
            push_operator(symbol);
        } 
        // 3. If it's ')', pop until '(' is found
        else if (symbol == ')') {
            while (top_operator != -1 && operator[top_operator] != '(') {
                push_postfix(pop_operator());
            }
            pop_operator(); // Remove '(' from stack
        } 
        // 4. If it's an operator
        else {
            while (top_operator != -1 && precedence(operator[top_operator]) >= precedence(symbol)) {
                push_postfix(pop_operator());
            }
            push_operator(symbol);
        }
    }

    // 5. Pop any remaining operators
    while (top_operator != -1) {
        push_postfix(pop_operator());
    }

    postfix[++top_postfix] = '\0'; // Null terminate the string
    printf("Postfix expression: %s\n", postfix);

    return 0;
}