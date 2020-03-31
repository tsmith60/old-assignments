#lang racket

(define alist '())
(define anotherlist '(a b c))
(cons (car anotherlist) alist)
(cons (car (cdr (cdr anotherlist))) alist)
(display alist)