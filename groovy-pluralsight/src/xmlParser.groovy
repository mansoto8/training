import groovy.xml.XmlSlurper

def file = new File('../resources/test.xml')

def slurper = new XmlSlurper()
def note = slurper.parse(file)

println note.to
println note.from
println note.not.existent
println note.@version

println 'Item list printing'
for (item in note.list.item) {
    println item
}

println 'Item list printing with each'
note.list.item.each {
    println it
}

//------------------------- Writing xml -------- --------------------
println 'Creating xml'

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()

def counter = 5;

def xml = markupBuilder.bind {
    //List will be an xml tag wrapping the content inside
    list {
        mkp.comment('This is an xml comment')
        note.list.item.each { i ->
            subelements(timestamp: new Date()) {
                item(i)
            }
        }
    }
}

def outFile = new File('../resources/test_truncated.xml')
outFile.write(xml.toString())