from functions import circumference, area

print("Hi, welcom to Circle program\n")

x = float(input("Give me the radius of the circle: "))

while True:
    print("1 --> Calculate the circumference of circle\n2 --> Calculate the area of circle\n3 --> exit")
    z = int(input("your choice: "))
    
    if z == 1:
        circumference(x)
    elif z == 2:
        area(x)
    elif z == 3:
        break
    else:
        print("Error! Please select one of the following three options")

