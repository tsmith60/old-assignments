#lang racket
(define  (collatz n)
  (cond
     ((= n 1) (display n) (newline))
    ((even? n) (display n) (newline) (collatz (/ n 2)   ))
   ((odd? n) (display n) (newline) (collatz(+ (* 3 n) 1)))
    ))
(collatz 5)