package restServices

@Grapes(
    @Grab(
        group='org.codehaus.groovy.modules.http-builder',
        module='joda-time',
        version='0.6'
    )
)
import groovyx.net.http.RESTClient

def forecastApi = new RESTClient('https://api.forecast.io/')
