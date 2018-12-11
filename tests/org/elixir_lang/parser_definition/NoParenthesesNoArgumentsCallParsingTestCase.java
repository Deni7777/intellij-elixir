package org.elixir_lang.parser_definition;

/**
 * Created by luke.imhoff on 9/17/14.
 */
public class NoParenthesesNoArgumentsCallParsingTestCase extends ParsingTestCase {

    /*
     *
     * Vary Qualifier
     *
     */

    public void testAtOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly(false);
    }

    /*
     * matchedAtNonNumericLeftOperand
     */

    public void testCaptureLeftOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly(false);
    }

    public void testUnaryLeftOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly(false);
    }

    public void testAtLeftOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly(false);
    }

    /*
     * matchedOperandExpression
     */

    public void testVariableDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    /*
     * accessExpression
     */

    public void testAtNumericOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly(false);
    }

    /* underscore is a special case of identifier because _ is also a decimal separator, so this checks that _ as an
       identifier is favored. */
    public void testAtNumericOperationDotUnderscore() {
        assertParsedAndQuotedCorrectly();
    }

    public void testCaptureNumericOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnaryNumericOperationDotIdentifier() {
        assertParsedAndQuotedCorrectly(false);
    }

    public void testListDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testSigilDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testAtomKeywordDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testAtomDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testAliasDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    /*
     * numeric
     */

    public void testCharTokenDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testBinaryWholeNumberDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testDecimalFloatDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testDecimalWholeNumberDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testOctalWholeNumberDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnknownBaseWholeNumberDotIdentifier() {
        assertParsedAndQuotedAroundError();
    }

    /*
     * binaryString
     */

    public void testStringLineDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testStringHeredocDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    /*
     * listString
     */

    public void testCharListLineDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    public void testCharListHeredocDotIdentifier() {
        assertParsedAndQuotedCorrectly();
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/no_parentheses_no_arguments_call_parsing_test_case";
    }
}
