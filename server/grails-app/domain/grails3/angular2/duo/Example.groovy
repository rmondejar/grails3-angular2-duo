package grails3.angular2.duo

import grails.rest.Resource

@Resource(uri='/examples')
class Example {
    String title
    int num
}
