(ns clojure-30-seconds-of-code.listpalindrome)

(defn palindrome?
  [coll]
  (= coll (reverse coll)))

(palindrome? [1 2 2 1])
(palindrome? [1 2 3 5 6 4])
