# clojure-30-seconds-of-code

### Lists
* [`Palindrome`](#palindrome)

### palindrome
returns true if a list is a palindrome and false otherwise

```clojure 
(defn palindrome?
  [coll]
  (= coll (reverse coll)))
```

