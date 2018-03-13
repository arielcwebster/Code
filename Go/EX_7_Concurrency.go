package main

import (
"fmt"
"time"
)

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