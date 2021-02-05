def numbers = 1..10

for(num in numbers) {
    println num
}

def range = 'a'..'g'

for(letter in range) {
    println letter
}

enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def weekDays = DAYS.MON..DAYS.FRI

for(weekDay in weekDays) {
    println weekDay
}

println "Extents: "
println weekDays.from
println weekDays.to