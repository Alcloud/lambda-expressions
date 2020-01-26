class Math {
    static int executor(Operation operation, int input) {
        return operation.execute(input);
    }

    Operation odd() {
        return (var) -> var % 2;
    }

    Operation prime() {
        return (var) -> {
            if (var == 1) return 1;

            for (int i = 2; i < var / 2 + 1; i++) {
                if ((var % i) == 0) return 1;
            }
            return 0;
        };
    }

    Operation palindrome() {
        Operation operation = (var) -> {
            String expression = "" + var;
            boolean isPalindrome = true;

            for (int i = 0; i < expression.length() / 2; i++) {
                if (expression.charAt(i) != expression.charAt(expression.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome ? 0 : 1;
        };
        return operation;
    }
} 