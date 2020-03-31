#lang racket
(define (fizzbuzz n)
  (continue n 1))

(define  (continue n m)
  (cond
     
   
    ((and (eq? (modulo m 3) 0) (eq? (modulo m 5) 0)) (display "FizzBuzz") (newline)(continue  n (+ m 1)) )
    ((eq? (modulo m 3) 0) (display "Fizz" ) (newline) (continue  n (+ m 1)) )
    ((eq? (modulo m 5) 0) (display "Buzz") (newline) (continue  n (+ m 1)) )
     ((<= n m)  (display m)(newline) )
   (else  (display m)(newline) (continue  n (+ m 1)))
    ))

(fizzbuzz 16)
