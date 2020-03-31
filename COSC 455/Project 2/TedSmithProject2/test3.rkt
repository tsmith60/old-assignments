#lang racket



(define alist '(a b c))
(display "Before car call\n")
(display alist)

(display "\nAfter car call\n")
(car  alist)
(display alist)



(display "\nBefore cdr call\n")
(display alist)

(display "\nAfter cdr call\n")
(cdr  alist)
(display alist)