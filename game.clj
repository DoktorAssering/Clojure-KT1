(defn info []
  (do
    (println "\nHello, this is a game in which the program will guess the hidden number in the range you specify! Good luck! ^)\n\n")
    (println "\nThere is a list of commands: ")
    (println "\n(start n m) --- n - number MIN in range, m - number MAX in range\n")
    (println "\n(guess-my-number) --- The program will offer one number randomly generated from your radius of numbers from min to max\n")
    (println "\n(smaller) --- A hint for the program to bring it closer to the desired number. Can be increased to +6 to the original number.\n")
    (println "\n(bigger) --- A hint for the program to bring it closer to the desired number. Can be reduced to -6 to the original number.\n")
    "----------------------------"))

(defn start [n m]
  (def ^:dynamic min-range n)
  (def ^:dynamic max-range m)
  (def ^:dynamic secret-number (rand-int (+ m 1)))
  (do
    (println "\nI wished for a number: " secret-number)
    (println "\nI'm ready...\n")
    "----------------------------"))

(def global-var (atom 0))

(defn guess-my-number []
  (let [new-guess (rand-int (+ min-range max-range))]
    (do
      (reset! global-var new-guess)
      (println "\nI guess this number: " new-guess "\n")
      "----------------------------")))

(defn smaller []
  (let [decrease-by (rand-int 6)
        new-guess (- @global-var (inc decrease-by))]
    (if (= new-guess secret-number)
      (do
        (println "\nThe program guessed the number: " new-guess)
        (println "\nAnd again programs show their advantage over humans!\n")
        "----------------------------")
      (do
        (alter-var-root #'max-range (constantly new-guess))
        (println "\nThe new guess is:" new-guess)
        (println "\nIt's less. try again.\n")
        (reset! global-var new-guess)
        "----------------------------"))))

(defn bigger []
  (let [increase-by (rand-int 6)
        new-guess (+ @global-var (inc increase-by))]
    (if (= new-guess secret-number)
      (do
        (println "\nThe program guessed the number: " new-guess)
        (println "\nAnd again programs show their advantage over humans!\n")
        "----------------------------")
      (do
        (alter-var-root #'min-range (constantly new-guess))
        (println "\nThe new guess is:" new-guess)
        (println "\nThis is bigger. try again.\n")
        (reset! global-var new-guess)
        "----------------------------"))))

(info)