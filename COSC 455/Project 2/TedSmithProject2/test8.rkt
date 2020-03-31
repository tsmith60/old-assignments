#lang racket
(define mylist '(102 140 33 67 120 98 200))
(define (hundreds list)
(filter (lambda(x) (> x 100)) list))

(hundreds mylist)