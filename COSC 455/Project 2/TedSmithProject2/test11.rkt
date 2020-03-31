#lang racket
(define chinese '(ling yi   er san    si   wu  liu  qi    ba   jiu  shi))
(define english '(zero one two three four five six seven eight nine ten))
(define testList '(one two liu  jump wu) )

(define  (translate x)
  (cond
        ((or (eq? x 'ling) (eq? x 'zero) )0 )
     ((or (eq? x 'yi) (eq? x 'one) ) 1) 
   ((or (eq? x 'er) (eq? x 'two)) 2)
     ((or (eq? x 'san) (eq? x 'three)) 3)
      ((or (eq? x 'si) (eq? x 'four)) 4)
      ((or (eq? x 'wu) (eq? x 'five)) 5)
     ((or (eq? x 'liu) (eq? x 'six)) 6)
      ((or (eq? x 'qi) (eq? x 'seven)) 7)
       ((or (eq? x 'ba) (eq? x 'eight)) 8)
     ((or (eq? x 'jiu) (eq? x 'nine)) 9)
      ((or (eq? x 'shi) (eq? x 'ten)) 10)
      (else -1)
    ))
(define (ridBad2 list)
   (filter positive? (map (lambda (x) (translate x)) list))
  
  )
(define addText "Addition: ")
(define sum 0)
(define (showAdd list)
  
     (cond
        ( (and (eq? (car list) null) (eq? (cdr list) null) ))
         ( (and (not(eq? (car list) null)) (eq? (cdr list) null) ) (set! sum (+ sum (car list))) (set! addText (string-append (string-append addText (number->string (car list))) " = ") ) (string-append addText (number->string sum)) (display addText) (display sum)(newline)  )
      ( (not (eq? (car list) null) ) (set! addText (string-append (string-append addText (number->string (car list)))" + ")) (set! sum (+ sum (car list))) (showAdd (cdr list)) )
     
       )
  )


(define prodText "Multiplication: ")
(define prod 1)
(define (showProd list)
  
     (cond
        ( (and (eq? (car list) null) (eq? (cdr list) null) ) )
         ( (and (not(eq? (car list) null)) (eq? (cdr list) null) ) (set! prod (* prod (car list))) (set! prodText (string-append (string-append prodText (number->string (car list))) " = ") ) (string-append prodText (number->string sum)) (display prodText) (display prod)(newline)  )
      ( (not (eq? (car list) null) )  (set! prodText (string-append (string-append prodText (number->string (car list)))" * ")) (set! prod (* prod (car list))) (showProd (cdr list)) )
     
       )
  )
(define (go lis)
  (define transText "Translation: ")

  (set! lis (ridBad2 lis))
  (map (lambda (x) (set! transText (string-append (string-append transText  (number->string x)) " "))) lis)

   (display transText)(newline)
 ( showAdd lis)
  (showProd lis)
 
  )

(go testList)
