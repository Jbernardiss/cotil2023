
console.log("blue")

let currentState = 0

function changeColor(currentState) {
    
    if(currentState === 0) {
        currentState = 1
        document.body.style.backgroundColor = "blue"
        console.log("blue")
    } else if(currentState === 1) {
        currentState = 0
        document.body.style.backgroundColor = "red"
        console.log("red")
    }
}


while(true) {
    setTimeout(changeColor, 3000)
}
