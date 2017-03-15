#201337570   Mohammed Jestiniah  Task2 
.data 
Matrix_Size : .asciiz "Enter the square matrix size > 1\n"
Elements_Prompt : .asciiz "\nEnter the elements row by row\n"
Buffer : .space 10000
OP1 : .asciiz "\n1: Display a specific row"
OP2 : .asciiz "\n2: Display a specific column"
OP3 : .asciiz "\n3: Display the main diagonal"
OP4 : .asciiz "\n4: Exit the program\n"
Err_msg : .asciiz "\nPlease Enter a correct option\n"
Prompt_op : .asciiz "\nPlease Choose an option\n"
Prompt_Row : .asciiz "\nPlease Enter a Row Number\n"
Prompt_Col : .asciiz "\nPlease Enter a Col Number\n"
New_line : .asciiz "\n"

.text
LoopSize : #a loop for ReEntering the size if it was less than 2
la $a0 , Matrix_Size 
li $v0 , 4
syscall 

li $v0 , 5
syscall  

move $t0 , $v0 #matrix size
mul $t1 , $t0 , 2 #Maximum number of characters to read including spaces
blt $t0 , 2 , LoopSize  #branch if size < 2

#allocate location in the heap 
mul $a0, $t0, $t0
li  $v0, 9
syscall
move $s0,$v0   # save array address in $s0

li $t6 , 0       #number of  raw counter
move $s1, $s0    #save the address
Row_loop: beq  $t6 ,$t0 , exit
la $a0 , Elements_Prompt 
li $v0 , 4
syscall 

la $a0 , Buffer  # address of input buffer 
move $a1 , $t1   # maximum number of characters to read
li $v0 , 8     
syscall
la $t2 , Buffer  # address of user inputs
li $t5 , 0       #number of element in a raw counter

L1:	beq	$t5, $t0, Inc	# loop until Counter Reached
	lb	$t4, 0($t2)	# load  byte into $t2
	sb	$t4, 0($s1)	# store byte into target
	addiu	$t2, $t2, 2	# increment source pointer
	addiu	$s1, $s1, 1	# increment target pointer
	addiu   $t5, $t5, 1     # increment Counter
	j L1
Inc :	
addiu   $t6 , $t6, 1            # increment Row Counter
j Row_loop
exit:

#########################################END of Storing and Allocation Part############################################

MENU_LOOP:
la $a0 , OP1 
li $v0 , 4
syscall         #Display option 1

la $a0 , OP2 
li $v0 , 4
syscall 	#Display option 2

la $a0 , OP3 
li $v0 , 4
syscall 	#Display option 3

la $a0 , OP4 
li $v0 , 4
syscall 	#Display option 4

la $a0 , Prompt_op  #Display prompt to choose
li $v0 , 4
syscall  

li $v0 , 5
syscall 


#Validate correct input
blt $v0 , 1 , Err_Msg  #branch if option < 1  
bgt $v0 , 4 , Err_Msg  #branch if option > 4 
beq $v0 , 1 , Option_1 #branch if option = 1
beq $v0 , 2 , Option_2 #branch if option = 2
beq $v0 , 3 , Option_3 #branch if option = 3 
beq $v0 , 4 , Option_4 #branch if option = 4




Option_1:
la $a0 , Prompt_Row  #Display prompt to choose Row 
li $v0 , 4
syscall  
li $v0 , 5
syscall 
bge $v0 , $t0 , Err_Msg

li $s3 , 0
move $s2 , $s0
#i×COLS
mul $t7 , $v0 , $t0
#i×COLS + j
add $s4 , $t7 , $s3
add $s2 , $s2 , $s4
loop : beq $s3 , $t0 ,  MENU_LOOP #if counter = matrix size means that row ended
lb $a0 , 0($s2)
li $v0 , 11
syscall
li $a0 , 32
li $v0 , 11
syscall
add $s3 , $s3 , 1 # Col Counter increment 
add $s2 , $s2 , 1 # array increment

j loop 

Option_2:
la $a0 , Prompt_Col #Display prompt to choose Col
li $v0 , 4
syscall  
li $v0 , 5
syscall 
bge $v0 , $t0 , Err_Msg

li $s3 , 0
move $s5 , $s0
#i×COLS
mul $t7 , $s3 , $t0
#i×COLS + j
add $s4 , $t7 , $v0
add $s5 , $s5 , $s4
loop2 : beq $s3 , $t0 ,  MENU_LOOP #if counter = matrix size means that row ended
lb $a0 , 0($s5)
li $v0 , 11
syscall
la $a0 , New_line
li $v0 , 4
syscall
add $s3 , $s3 , 1 # row Counter increment 
add $s5 , $s5 , $t0 # array increment

j loop2

Option_3:

li $s3 , 0 
li $s7 , 0
move $s5 , $s0
#i×COLS
mul $t7 , $s3 , $t0
#i×COLS + j
add $s4 , $t7 , $s3
add $s5 , $s5 , $s4
loop3 : beq $s3 , $t0 ,  MENU_LOOP #if counter = matrix size means that row ended
lb $a0 , 0($s5)
li $v0 , 11
syscall
la $a0 , New_line
li $v0 , 4
syscall
add $s3 , $s3 , 1 # row Counter increment 
add $s5 , $s5 , $t0 # array increment
add $s5 , $s5 , 1
j loop3

Option_4:
li $v0 , 10
syscall

Err_Msg:               #Error massage appear if the option was wrong
la $a0 , Err_msg 
li $v0 , 4
syscall 
j MENU_LOOP
