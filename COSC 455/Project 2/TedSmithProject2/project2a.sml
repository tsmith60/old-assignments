(* 	COSC 455 - Programming Languages: Implementation and Design 
	Project 2*)
	
(*	Ted Smith III*)
	

(*                                    Test Cases                     Expected Solutions *)
(*                       ------------------------------------        ------------------ *)
val (pTest1, qTest1) = ([1, 1, 1, 1, 0], [1, 0, 1, 1]); 				(*  101001 *)
val (pTest2, qTest2) = ([1, 0, 0, 1, 1, 0, 1], [1, 0, 0, 1, 0]); 		(* 1011111 *)
val (pTest3, qTest3) = ([1, 0, 0, 1, 0, 0, 1], [1, 1, 0, 0, 1]); 		(* 1100010 *)
val (pTest4, qTest4) = ([1, 0, 0, 0, 1, 1, 1], [1, 0, 1, 1, 0]); 		(* 1011101 *)
	
	
(* 	finishBinaryAdd (remainingBits, carryBit)
	bool list * bool * bool list  
	This function does the binary addition when there are uneven lists and still must finish the add with the
	carried bits. *)	
fun finishBinaryAdd(x::xs,false) = x::xs |
	finishBinaryAdd([],true) = [true] |
	finishBinaryAdd(x::xs,true) = if x  then [false]@finishBinaryAdd(xs,true) else [true]@finishBinaryAdd(xs,false);
(* 	getNextCarryBit (pBit, qBit, carryBit)
	bool * bool * bool -> bool  
	This function determines what the next carry bit should be based on current bits. *)	
fun getNextCarryBit(x,y,z) = (x andalso y) orelse(x andalso z) orelse (y andalso z);
(* 	addBits (pBit, qBit, carryBit)
	bool * bool * bool -> bool 
	This function does the binary addition of two boolean lists. *)
	fun addBits(x,y,z) = (z = (x = y));
(* 	doBinaryAddition (pBits, qBits carryBit)
	bool list * bool list * bool -> bool list 
	This function does the binary addition of two boolean lists. Note that the lists may not be equal in length. *)
fun doBinaryAddition (x::xs,y::ys,z) =  [addBits(x,y,z)]@doBinaryAddition(xs,ys,getNextCarryBit(x,y,z))  |
		doBinaryAddition ([],y::ys,z) = finishBinaryAdd(y::ys,z) |
		doBinaryAddition (x::xs,[],z) = finishBinaryAdd(x::xs,z);
(* 	reverseList
	'a list -> 'a list 
	This function takes a list of any type and returns the list in reverse order. *)		
fun   reverseList nil = nil
	| reverseList (first::rest) = reverseList rest @ [first];

(* 	convertIntListToBoolList
	int list -> bool list 
	This function converts a binary integer list into its corresponding boolean list. *)
fun convertIntListToBoolList(x::nil) = if x=1 then [true] else [false] |
	convertIntListToBoolList(x::xs) = if x=1 then [true] @ convertIntListToBoolList(xs) else [false] @ convertIntListToBoolList(xs);
(* 	convertBoolListToIntList
	bool list -> int list 
	This function converts a boolean list into its corresponding binary integer list. *)
fun convertBoolListToIntList(x::nil) = if x then [1] else [0] |
	convertBoolListToIntList(x::xs)= if x then [1] @ convertBoolListToIntList(xs) else [0] @ convertBoolListToIntList(xs);
(* 	binaryAddition
	int list * int list -> int list 
	This is the "main" function to do binary addition. This function should:
		1. Convert the input parameter lists from integers to boolean
		2. Reverse the lists (since binary addition is performed right to left)
		3. Perform the binary addition with the doBinaryAddition function
		4. Reverse the lists (to get back in proper order)
		5. Convert the answer back to binary integer form for output
	Note that the initial carry bit is assumed to be 0 (i.e., false). *)
		
	fun binaryAddition(x::xs,y::ys) = convertBoolListToIntList(reverseList(doBinaryAddition(reverseList(convertIntListToBoolList(x::xs)), reverseList(convertIntListToBoolList(y::ys)),false)));
(* Extra Credit *)


	
 