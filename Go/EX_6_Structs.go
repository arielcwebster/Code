package main

import "fmt"

type Human struct{
	name string
}

type Android struct{
	Human
	modelName string
}

type Circle struct{
	radius int
	//roll(radius) 
	}

func (c *Circle) roll (r int) int{
    for r > 0  {
       fmt.Println("Rollin Rollin Rollin")
	   r = r-1
	}
	return r
}
	
func main() {	
	
	//a variety of ways to init a struct
	var d Circle
	c:= new(Circle)
	b:= Circle {radius:2}
	a:= Circle{5}
	//Note the roll method is referenced through
	//the instance of the object
	fmt.Println(a.roll(3), b.roll(7), c, d.roll(7))
	
	var person Human
	person.name = "Ryan"
	
	var betterPerson Android
	betterPerson.name = "Ryan 2.0"
	betterPerson.modelName = "Acura"
	
	fmt.Println(person)
	fmt.Println(betterPerson)
	
	
	
	
	
	
	
}