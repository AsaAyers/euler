(defn by [x] #(= 0 (mod % x)))

(defn by [x] (partial mod x))

(defn by3or5 [x]
  (or
   ((by 3) x)
   ((by 5) x)))

(println
 (reduce +
         (filter by3or5 (range 1000))))
