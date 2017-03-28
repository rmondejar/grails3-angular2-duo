package grails3.angular2.duo

class BootStrap {

    def init = { servletContext ->
        10.times {
            new Example(title: "Example #${it+1}", num: it+1)
                    .save()
        }
    }

    def destroy = {
    }
}
