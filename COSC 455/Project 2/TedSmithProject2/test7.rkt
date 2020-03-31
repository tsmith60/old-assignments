#lang racket

(define list '(1 2 3 4 5))

(define  (sqrlst alist)
  (map (lambda (x) (* x x)) alist))

(sqrlst list)
