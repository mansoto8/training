// https://mvnrepository.com/artifact/joda-time/joda-time
/*
General import
@Grapes(
    @Grab(group='joda-time', module='joda-time', version='2.10.9')
)
*/

//Specify dependency for import
@Grab(group='joda-time', module='joda-time', version='2.10.9')
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

def printableTime = new DateTime(new Date().toTimestamp())

def format = DateTimeFormat.forPattern('MM/dd/yyyy - hh:mm aa')
println printableTime.toString(format)

//Cache is stored in ~/.groovy/grape
//grape list -> list the dependencies
//grape resolve -> Check dependencies fo dependencies. Ideal for troubleshooting