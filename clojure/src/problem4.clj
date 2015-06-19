
(defn palindrome?
  [input]
  (let [string (str input)]
    (= (clojure.string/join "" (reverse string)) string)))


(palindrome? "bob")
(palindrome? 8008)
(palindrome? "hello")
(palindrome? 1024)

(defn three-digits [] (range 999 100 -1))

(defn find-first [pred [head & tail]]
  (if (or (nil? head) (pred head))
    head
    (recur pred tail)))

(last (sort (filter palindrome?
                    (mapcat
                     (fn [x] (map (partial * x) (three-digits)))
                     (three-digits)))))
