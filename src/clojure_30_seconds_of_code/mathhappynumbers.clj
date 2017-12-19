(ns clojure-30-seconds-of-code.mathhappynumbers)

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
