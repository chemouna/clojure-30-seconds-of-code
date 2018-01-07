(ns clojure-30-seconds-of-code.repeatedsquaring)

;; fast exponentiation using repeated squaring technique
(defn fast-exp-iter [b n a]
  (cond (= n 0) a
        (even? n) (fast-exp-iter (* b b) (/ n 2) a)
        :else (fast-exp-iter b (- n 1) (* a b))))

(defn fast-exp [b n]
  (fast-exp-iter b n 1))

(fast-exp 2 3)
