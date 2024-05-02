# Clojure-KT1
### :fire: Example playing my console game!

---

PS C:\NewSemester\Clojure> clj
Clojure 1.11.2
user=> (load-file "game.clj") 

Hello, this is a game in which the program will guess the hidden number in the range you specify! Good luck! ^)



There is a list of commands: 

(start n m) --- n - number MIN in range, m - number MAX in range


(guess-my-number) --- The program will offer one number randomly generated from your radius of numbers from min to max       


(smaller) --- A hint for the program to bring it closer to the desired number. Can be increased to +6 to the original number.


(bigger) --- A hint for the program to bring it closer to the desired number. Can be reduced to -6 to the original number.   

"----------------------------"
user=> (start 1 100) 

I wished for a number:  94    

I'm ready...

"----------------------------"
user=> (guess-my-number) 

I guess this number:  16 

"----------------------------"
user=> (bigger)          

The new guess is: 18

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 24

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 29

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 35

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 41

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 43

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 48

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 51

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 54

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 60

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 66

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 68

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 69

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 70

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 74

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 79

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 85

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 89

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 90

This is bigger. try again.

"----------------------------"
user=> (bigger)

The new guess is: 96

This is bigger. try again.

"----------------------------"
user=> (smaller)

The new guess is: 90

It's less. try again.

"----------------------------"
user=> (bigger)

The new guess is: 91

This is bigger. try again.

"----------------------------"
user=> (bigger)

The program guessed the number:  94

And again programs show their advantage over humans!

"----------------------------"