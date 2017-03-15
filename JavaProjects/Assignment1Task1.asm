#201337570   Mohammed Jestiniah  Task1 
#i've found many ways to solve this Question
#1-by optaining the ascii code for each letter and apply one condition for both capital and small
#2-by using the same letter, thats include one condition for every letter (capital and small)"very Long!!"
#3-By knowing the type of the letter capital or small and then subtract it from the a Or A and add the letters by their number in the array (i'v figuer it last and couldnt do it)

.data  
input: .asciiz "input.txt"      
buffer: .space 100000
TDC: .asciiz "Total digit count = "
char: .asciiz "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
header : .asciiz "Letter	Count"
ErrMsg : .asciiz "File not found"
CountersList : .word 0:26

#Spaces
NewLine : .asciiz "\n"
Tab : .asciiz "	"

.text
#open file
li   $v0, 13       
la   $a0, input     
li   $a1, 0        
li   $a2, 0
syscall            

#file not found
bltz $v0,ErrorMsg 

move $s0, $v0      

#read the file
li   $v0, 14       
move $a0, $s0      
la   $a1, buffer   
li   $a2, 100000     
syscall            

# Close file 
li   $v0, 16       # system call for close file
move $a0, $s0      # file descriptor to close
syscall            # close file 




li $t2 ,0 #empty the counter 


la $t4 , CountersList #Store the address of the first element 

#LoopLetters 
add $t0,$zero,$t0
LoopLetters:
add $t1,$a1,$t0
lb $t3,0($t1)
beqz $t3,endLoop

#Letters Identification
beq $t3,65,Aa
beq $t3,97,Aa
beq $t3,66,Bb
beq $t3,98,Bb
beq $t3,99,Cc
beq $t3,67,Cc
beq $t3,68,Dd
beq $t3,100,Dd
beq $t3,69,Ee
beq $t3,101,Ee
beq $t3,70,Ff
beq $t3,102,Ff
beq $t3,71,Gg
beq $t3,103,Gg
beq $t3,72,Hh
beq $t3,104,Hh
beq $t3,73,Ii
beq $t3,105,Ii
beq $t3,74,Jj
beq $t3,106,Jj
beq $t3,75,Kk
beq $t3,107,Kk
beq $t3,76,Ll
beq $t3,108,Ll
beq $t3,77,Mm
beq $t3,109,Mm
beq $t3,78,Nn
beq $t3,110,Nn
beq $t3,79,Oo
beq $t3,111,Oo
beq $t3,80,Pp
beq $t3,112,Pp
beq $t3,81,Qq
beq $t3,113,Qq
beq $t3,82,Rr
beq $t3,114,Rr
beq $t3,83,Ss
beq $t3,115,Ss
beq $t3,84,Tt
beq $t3,116,Tt
beq $t3,85,Uu
beq $t3,117,Uu
beq $t3,86,Vv
beq $t3,118,Vv
beq $t3,87,Ww
beq $t3,119,Ww
beq $t3,88,Xx
beq $t3,120,Xx
beq $t3,89,Yy
beq $t3,121,Yy
beq $t3,90,Zz
beq $t3,122,Zz
add $t0,$t0,1
j LoopLetters

#Letters Conditions
Aa:
lb $t5,0($t4)
add $t5,$t5,1
sb $t5,0($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Bb:
lb $t5,4($t4)
add $t5,$t5,1
sb $t5,4($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Cc:
lb $t5,8($t4)
add $t5,$t5,1
sb $t5,8($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Dd:
lb $t5,12($t4)
add $t5,$t5,1
sb $t5,12($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Ee:
lb $t5,16($t4)
add $t5,$t5,1
sb $t5,16($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Ff:
lb $t5,20($t4)
add $t5,$t5,1
sb $t5,20($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Gg:
lb $t5,24($t4)
add $t5,$t5,1
sb $t5,24($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Hh:
lb $t5,28($t4)
add $t5,$t5,1
sb $t5,28($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Ii:
lb $t5,32($t4)
add $t5,$t5,1
sb $t5,32($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Jj:
lb $t5,36($t4)
add $t5,$t5,1
sb $t5,36($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Kk:
lb $t5,40($t4)
add $t5,$t5,1
sb $t5,40($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Ll:
lb $t5,44($t4)
add $t5,$t5,1
sb $t5,44($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Mm:
lb $t5,48($t4)
add $t5,$t5,1
sb $t5,48($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Nn:
lb $t5,52($t4)
add $t5,$t5,1
sb $t5,52($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Oo:
lb $t5,56($t4)
add $t5,$t5,1
sb $t5,56($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Pp:
lb $t5,60($t4)
add $t5,$t5,1
sb $t5,60($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Qq:
lb $t5,64($t4)
add $t5,$t5,1
sb $t5,64($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Rr:
lb $t5,68($t4)
add $t5,$t5,1
sb $t5,68($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Ss:
lb $t5,72($t4)
add $t5,$t5,1
sb $t5,72($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Tt:
lb $t5,76($t4)
add $t5,$t5,1
sb $t5,76($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Uu:
lb $t5,80($t4)
add $t5,$t5,1
sb $t5,80($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Vv:
lb $t5,84($t4)
add $t5,$t5,1
sb $t5,84($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Ww:
lb $t5,88($t4)
add $t5,$t5,1
sb $t5,88($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Xx:
lb $t5,92($t4)
add $t5,$t5,1
sb $t5,92($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Yy:
lb $t5,96($t4)
add $t5,$t5,1
sb $t5,96($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters
Zz:
lb $t5,100($t4)
add $t5,$t5,1
sb $t5,100($t4)
add $t0,$t0,1
add $t2,$t2,1
j LoopLetters


endLoop: 
li $v0,4 #Print the Header
la $a0,header
syscall
li $v0,4
la $a0,NewLine
syscall

la $s0,char


add $t6,$zero,$t6

counterLetterLoop:
#litter print:
lb $t9,($s0)
li $v0 , 11
move $a0,$t9
syscall
add $s0,$s0,1

#Spaces
li $v0,4
la $a0,Tab
syscall


lb $t8,($t4)#display counter for each letter
li $v0,1
beq $t6,26,exit
move $a0,$t8
syscall
add $t4,$t4,4
add $t6,$t6,1
li $v0,4
la $a0,NewLine
syscall
j counterLetterLoop


ErrorMsg:
li $v0,4
la $a0,ErrMsg
syscall 
li $v0,10
syscall 
                                                    
exit:
#total counter
li $v0,4
la $a0,NewLine
syscall
li $v0,4
la $a0,TDC
syscall
li $v0,1
move $a0,$t2
syscall
li $v0,10
syscall 
