def numbers = 0..9

for (num in numbers) {
    if(isEven(num)) {
        println num
    }
}

/*
Full version
def isEven(def num) {
    return num%2 == 0
}
*/

//Simplified version
def isEven(num) {
    num%2 == 0
}
