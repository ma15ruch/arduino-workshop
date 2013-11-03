import time
import serial
cm = serial.Serial("/dev/tty.usbmodem1421", 9600)
print "Initializing the coffee maker."
time.sleep(3)
print "Coffee maker initialized."

brewing = False
strong = False

while True:
	command = raw_input("Command: ")
	if command == "brew coffee" and not brewing:
		cm.write('b')
		brewing = True
	elif command == "stop brewing coffee" and brewing:
		cm.write('b')
		brewing = False
	elif command == "make coffee stronger" and not strong:
		cm.write('c')
		strong = True
	elif command == "make coffee weaker" and  strong:
		cm.write('c')
		strong = False
	else:
		print "You didn't enter a valid command."
