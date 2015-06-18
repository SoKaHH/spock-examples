package de.skoahh.spock.example

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Niels Falk
 */
class DetermineMaxSpec extends Specification {

    def "the maximum of two numbers (empty specification)"() {
        given: "first number is 5, second number is 3"
        when: "the maximum is determined"
        then: "the maximum is 5"
    }







    def "the maximum of two numbers (implementation)"() {
        given: "first number is 5, second number is 3"
        def firstNumber = 5
        def secondNumber = 3

        when: "the maximum is determined"
        def result = determineMaximum(firstNumber, secondNumber)

        then: "the maximum is 5"
        result == 5
    }






    def "the maximum of two numbers (pure dsl scenario)"() {
        given:
        "first number is 5, second number is 3"()

        when:
        'the maximum is determined'()

        then:
        "the maximum is"(4)
    }

    private maximum, firstNumber, secondNumber

    private void 'first number is 5, second number is 3'() {
        firstNumber = 5
        secondNumber = 3
    }

    private void 'the maximum is determined'() {
        maximum = determineMaximum(firstNumber, secondNumber)
    }

    private boolean "the maximum is"(expected) {
        assert maximum == expected
        true
    }







    def "the maximum of two numbers (short)"() {
        expect: // expect is synonym for then
        determineMaximum(5, 3) == 5
    }







    def "the maximum of two numbers (decision table)"() {
        expect:
        determineMaximum(first, second) == max

        where:
        first | second || max
        3     | 5      || 5
        10    | 7      || 10
    }






    @Unroll
    def "the maximum of two numbers (unroll)"() {
        expect:
        determineMaximum(first, second) == max

        where:
        first | second || max
        3     | 5      || 5
        10    | 7      || 10
    }






    @Unroll
    def "the maximum of #first and #second is #max (unroll + var name)"() {
        expect:
        determineMaximum(first, second) == max

        where:
        first | second || max
        3     | 5      || 5
        10    | 7      || 10
    }










    def determineMaximum(int first, int second) {
        // not yet implemented
    }
}
