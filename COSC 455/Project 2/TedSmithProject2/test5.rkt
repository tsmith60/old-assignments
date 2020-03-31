#lang racket



(define third (lambda (x) (caddr x)))
(define fourth (lambda (x) (cadddr x)))
(define fifth (lambda (x) (car(reverse x))))
(define rest (lambda (x) (cdr x)))

(define family '(josh sara erin sandy jon))

(third family)
(fourth family)
(fifth family)
