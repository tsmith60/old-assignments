#lang racket

(define alist'())
(define anotherlist '(a b c))
(set! alist(cons (car anotherlist) alist))
;(set! alist(cons (car (cdr anotherlist)) alist))
(set! alist (cons 'c  alist))
(display alist)
 (display (reverse alist))