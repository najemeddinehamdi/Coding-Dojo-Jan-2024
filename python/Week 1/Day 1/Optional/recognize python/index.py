# variable declaration
num1 = 42
num2 = 2.3
boolean = True
string = 'Hello World'
pizza_toppings = ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives']
person = {'name': 'John', 'location': 'Salt Lake', 'age': 37, 'is_balding': False}
fruit = ('blueberry', 'strawberry', 'banana')

# log statement
print(type(fruit))
print(pizza_toppings[1])
pizza_toppings.append('Mushrooms')
print(person['name'])
person['name'] = 'George'
person['eye_color'] = 'blue'
print(fruit[2])

# type check
print(type(fruit))

# length check
if len(string) < 5:
    print("It's a short word!")
elif len(string) > 15:
    print("It's a long word!")
else:
    print("Just right!")

# single line comment
# This is a single line comment.

# multiline comment
"""
This is a
multiline comment.
"""

# Data Types
# Primitive
# Boolean, Numbers, Strings

# Composite
# List
# initialize
my_list = [1, 2, 3, 4, 5]
# access value
print(my_list[0])
# change value
my_list[0] = 10
# add value
my_list.append(6)
# delete value
my_list.pop(2)

# Tuples
# initialize
my_tuple = (1, 2, 3, 4, 5)
# access value
print(my_tuple[0])
# change value (Tuples are immutable)
# add value (Not applicable for tuples as they are immutable)
# delete value (Not applicable for tuples as they are immutable)

# Dictionary
# initialize
my_dict = {'a': 1, 'b': 2, 'c': 3}
# access value
print(my_dict['a'])
# change value
my_dict['a'] = 10
# add value
my_dict['d'] = 4
# delete value
del my_dict['b']

# conditional
# if, else if
num = 10
if num > 10:
    print("Greater than 10")
elif num == 10:
    print("Equal to 10")
else:
    print("Less than 10")

# for loop
# start, stop, increment
for i in range(0, 10, 2):
    print(i)
# break
for i in range(5):
    if i == 3:
        break
    print(i)
# continue
for i in range(5):
    if i == 3:
        continue
    print(i)
# sequence
for item in ['a', 'b', 'c']:
    print(item)

# while loop
# start, stop, increment
i = 0
while i < 5:
    print(i)
    i += 1

# function
# parameter, argument, return
def add_numbers(x, y):
    return x + y

result = add_numbers(3, 5)
print(result)

# Bonus: Errors
# NameError: name <variable name> is not defined
# num3 is not defined
# print(num3)

