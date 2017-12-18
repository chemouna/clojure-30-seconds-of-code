(ns clojure-30-seconds-of-code.mathgcd)

(defn gcd
  "Calculate gcd (using Euclid's algorithm)"
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(gcd 3 6)
(gcd 4 11)
(gcd 1224 25552)
