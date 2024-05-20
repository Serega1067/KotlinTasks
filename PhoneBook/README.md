# Task.
## The phone book.
Write a program that processes commands entered by the user into  
the console:
* exit
* help
* add <Name> phone <Phone number>
* add <Name> email <Email address>
After executing command, except for the exit command, the program  
waits for the next command.  
Name - is any word.  
If a command with a phone number is entered, you need to check that  
the specified phone can start with +, followed by only numbers.  
If the entered number meets this condition, we display it on the  
screen along with the name using a string template.  
Otherwise, we display an error message.  
For the email command, we do the same thing, but with a different  
template - for simplicity, the address must contain three sequences  
of letters separated by @ and a dot.
