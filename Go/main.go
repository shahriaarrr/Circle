package main

import (
	"fmt"
	"math"
)

func main() {
	const PI float64 = 3.14
	var x float64
	var y int

	fmt.Println("welcom to Circle program")

	fmt.Print("Give me the radius of the circle: ")
	fmt.Scanln(&x)

	fmt.Println("1 --> Calculate the circumference of circle\n2 --> Calculate the area of circle")
	fmt.Print("your choice: ")
	fmt.Scanln(&y)

	if y == 1 {
		x *= x
		x *= PI
		fmt.Println(x)
	} else if y == 2 {
		x = math.Pow(x, 2)
		x *= PI
		fmt.Println(x)
	}
}
