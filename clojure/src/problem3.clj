
(defn max-potential-prime-factor [x]
  (let
   [max (int (Math/sqrt x))]
    (if (odd? max) max (dec max))))

(defn find-first [pred coll]
  (first (drop-while (comp not pred) coll)))

(defn potential-factors
  [num]
  (let
   [max (max-potential-prime-factor num)
    potential (range max 2 -2)]

    (if (> max 2)
      (lazy-cat potential [2])
      potential)))
(potential-factors 100)

(defn is-factor? [x y]
  (cons (partial = 0) mod)
  (= 0 (mod x y)))

(defn prime?
  [num]
  (println "prime?" num)

  (nil? (find-first #(and (is-factor? num %) (prime? %))
                    (potential-factors num))))

(defn max-prime-factor
  [num]
  (find-first #(and (is-factor? num %) (prime? %))
              (range (max-potential-prime-factor num) 3 -2)))

; 29
(println "max-prime-factor" 13195 (max-prime-factor 13195))

; 6857
(println "max-prime-factor" 600851475143 (max-prime-factor 600851475143))
