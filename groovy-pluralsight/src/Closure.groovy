def Closure = {
    println "In a closure"
    println new Date()
}

for( i in 1..3) {
    Closure()
    sleep(1000)
}

println "In the each method"
(1..3).each {
    Closure()
}

println "In the each method - implicit closure"
(1..3).each {
    println "In a closure $it"
}

println "In the each method - override name of it variable"
(1..3).each { i ->
    println "In a closure $i"
}

println "In the each method - filter even numbers"
(1..10).findAll({it%2==0}).each {
    println "In a closure $it"
}

