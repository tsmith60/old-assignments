#lang racket

(define list '(#t #t #f #t #f))

(define (convert alist)
  (map (lambda (x) (if (eq? x #T) 1 0)) alist))

(convert list)

(define (addit lis)
  (define sum 0)
  (map (lambda (x) (set! sum (+ sum x))) lis)
  sum
  )

(define (truecount lis)
  (addit
   (convert lis))
  )

(truecount list)
