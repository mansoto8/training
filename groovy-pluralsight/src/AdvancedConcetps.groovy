import groovy.xml.XmlSlurper

// --------------------------- GROOVY EXTENSION METHODS -------------------------

def file = new File('../resources/test.xml')

def slurper = new XmlSlurper()
def note = slurper.parse(file)

// -------------------------- dump method --------------------------------
println 'Beginning dump'
println note.to
//Shows metadata of the object
println note.to.dump()

//------------------------------------- inspect method --------------------------
println 'Beginning inspect...'
//Must be implemented by the developer, by default returns the toString()
println note.to.inspect()

println 'Example with extension method'
//With method
note.with {
  println to
  println from
  println heading
  //@ accessed attributes cannot be directly accessed
  println attributes()['version']
}

// ------------------------ Groovy truthfulness ------------------------

//!null = true and !!null = false
/*
instead of
  if(variable == null)
  better:
  if(!variable)
 */

// -------------------------- adding functionality with categories --------------------

println 'Testing categories'

@Grab(group='joda-time', module='joda-time', version='2.10.9')
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class DateTimeCategory {
  def static String createPrintableTime(dateTime) {
    def format = DateTimeFormat.forPattern('MM/dd/yyyy')
    //Using better implicit return statement
    //return dateTime.toString(format)
    dateTime.toString(format)
  }
}

def printableTime = new DateTime();

println 'Via static method'
println DateTimeCategory.createPrintableTime(printableTime)

println 'Using category'
use(DateTimeCategory) {
  printableTime = new DateTime();
  println printableTime.createPrintableTime()
}




