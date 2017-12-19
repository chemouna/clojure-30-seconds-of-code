(ns clojure-30-seconds-of-code.mathtotient
  (:require
   [clojure-30-seconds-of-code.mathgcd :refer :all]))

(defn coprime?
  [n m]
  (== (gcd n m) 1))

(defn totient
  [n]
  (->> n
       (range 1)
       (filter (partial coprime? n))
       (count)))

