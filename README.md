# clojure-30-seconds-of-code

## Table of Contents

### Math
* [`gcd`](#gcd)

### Lists
* [`Palindrome`](#palindrome)


[⬆ back to top](#table-of-contents)
## Math 

### gcd
returns the greatest common divisor between two numbers.
```clojure
(defn gcd
  "Calculate gcd (using Euclid's algorithm)"
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))
```

[⬆ back to top](#table-of-contents)
## Lists

### palindrome
returns true if a list is a palindrome and false otherwise

```clojure 
(defn palindrome?
  [coll]
  (= coll (reverse coll)))
```


