(defn fib
  ([] (fib 1 2))
  ([a, b] (cons a (lazy-seq (fib b (+ a b))))))

(println
 (reduce +
         (filter even?
      ; I want the numbers less than 4-million, but since I'm using partial I have
      ; to flip it and keep the numbers that 4-million is bigger than
                 (take-while (partial > 4000000) (fib)))))
