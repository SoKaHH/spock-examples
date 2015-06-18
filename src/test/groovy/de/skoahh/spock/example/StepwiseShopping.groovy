package de.skoahh.spock.example

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

/**
 * @author Niels Falk
 */
@Stepwise
class StepwiseShopping extends Specification{

    def 'new user adds a product to cart'() {
        given: 'an unknown user opens the page'
        when: 'he ads a guitar to his cart'
        then: 'cart with 1 product is displayed in the header'
        and: 'price of the cart equals guitar price'
    }

    def 'checkout requires login'() {
        when: 'the unknown user tries clicks the checkout button'
        then: 'the login/registration dialog is shown'
        //try false here
    }

    def 'registration logs in'() {
        when: 'the user fills the signup form'
        and: 'hits the submit button'
        then: 'he is logged in'
    }








    @Shared
    String context


    void setup() {
        println "Base.setup"
    }

    void cleanup() {
        println "Base.cleanup"
    }

    void setupSpec() {
        println "Base.setupSpec"
        context = "created context"
    }

    void cleanupSpec() {
        println "Base.cleanupSpec"
        context = null
    }
}
