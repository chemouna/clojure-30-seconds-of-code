# clojure-30-seconds-of-code

## Table of Contents

### Math
* [`gcd`](#gcd)
* [`Euler's totient function phi(m)`](#euler-totient-function)
* [`Happy Numbers`](#happy-numbers)

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

### Euler totient function
the number of positive integers r (1 <= r < m) that are coprime to m.
```clojure
(defn coprime?
  [n m]
  (== (gcd n m) 1))

(defn totient
  [n]
  (->> n
       (range 1)
       (filter (partial coprime? n))
       (count)))
```

### Happy Numbers 
Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process
until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers

```clojure
(defn happy?
  [n]
  (loop [n n, seen #{}]
    (cond
      (= n 1) true
      (seen n) false
     :else
     (recur
      (->> (str n)
           (map #(Character/digit % 10))
           (map #(* % %))
           (reduce +))
       (conj seen n)))))
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


