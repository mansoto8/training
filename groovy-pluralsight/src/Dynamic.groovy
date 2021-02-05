def cat = "meow"
def one = 1

println cat
println cat.getClass()

println one
println one.getClass()

// The following failes at compile
//Integer two = "adf"

def two = 2
println two.getClass()
//This will fail when running
//println two.toUpperCase()

two = "two"
println two.getClass()
println two.toUpperCase()
