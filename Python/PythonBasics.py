www.tutorial

#this is a comment
# you should still put the name of your project at the beginning of each file
# as well as your name
#python project 
# Ariel Webster
# to run this program type Python NameOfProgram.py


# We don't have registers anymore nor can we save directly to a memory location 
# but we do have variables which we can load values into

# initialize variables
X = 5
A = 18

X = X + 2

#print out the values of the variables
print "X %d" % X
print "A %d" % A

#switching them is similarly easy
temp = X
X = A
A = temp

print "X %d" % X
print "A %d" % A

#User input is quite simple and intuative 
num1 = input('Enter a number: ')
print('num1 = ', num1) # another way of printing

#if num1 is greater than 5
if num1 > 5:
	print "%d is bigger than 5" % num1
else:
	print "%d is less than 5" % num1
	
#num1 down to blast off	
for num in range(num1, 0, -1):
	print num
	
	
print "Blastoff!"
