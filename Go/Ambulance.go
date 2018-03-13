package main

import (
"fmt"
"time"
"math/rand"
)

/*
four directions
North, south
east, west
light
ambulance

func Light() {
	time.Sleep(1000 * time.Millisecond)
		if northsouth.count > EastWest.count
			ew = 0;
			ns = 1;
		else
			ns = 0;
			ew = 1;
}

func NorthSouth() {
	time.Sleep(100 * time.Millisecond)
	
	if light.ns = 1	
		NorthSouth.count --;
	else
		NorthSouth.count ++;
			
}

func EastWest() {
	time.Sleep(100 * time.Millisecond)
	
	if light.ns = 0	
		EastWest.count --;
	else
		EastWest.count ++;
			
}

func Ambulance () {
	rand.Seed(time.Now().Unix())
	if (rand.Int()%2 == 0)
		NorthSouth.count + 500
		time.Sleep(500 * time.Millisecond)
		NorthSouth.count - 500
	else 
		EastWest.count + 500
		time.Sleep(500 * time.Millisecond)
		EastWest.count - 500
}
*/

//var duration int = 3000

func HalfTime(){
	time.Sleep(1500 * time.Millisecond)
	fmt.Println("HALFTIME!")
}

func Quarter(){
	time.Sleep(700 * time.Millisecond)
	//fmt.Println("QUARTER ",q)
}

func main() {

	NScount = 20
	EWcount = 20
	LightNS = 0
	
	go Light(NScount, EWcount, LightNS) 
	go NorthSouth(NScount, EWcount, LightNS) 
	go EastWest(NScount, EWcount, LightNS) 
	go Ambulance (NScount, EWcount)
	
	Snape := time.Tick(100 * time.Millisecond)
    Ron := time.Tick(300 * time.Millisecond)
	Dumbledore := time.Tick(450 * time.Millisecond)
	Boom :=  time.After(3000 * time.Millisecond)
	
	go HalfTime()
	go Quarter()
	go Quarter()
	
    for {
        select {
        case <- Snape:
            fmt.Println("Snape")
        case <-Ron:
            fmt.Println("Ron Weasly")
		case <- Dumbledore:
			fmt.Println("DUMBLEDORE!")
		case <- Boom:
			fmt.Println("BOOM!")
			return
        default:
            fmt.Println("    .")
            time.Sleep(50 * time.Millisecond)
        }
    }
}