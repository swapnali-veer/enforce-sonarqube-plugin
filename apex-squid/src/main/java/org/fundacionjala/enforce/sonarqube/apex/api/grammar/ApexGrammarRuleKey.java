/*
 * The MIT License
 *
 * Copyright 2016 Fundacion Jala.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.fundacionjala.enforce.sonarqube.apex.api.grammar;

import org.sonar.sslr.grammar.GrammarRuleKey;

/**
 * Contains enum all the rules used in the grammar.
 */
public enum ApexGrammarRuleKey implements GrammarRuleKey {

    ACCESSOR,
    ACCESSOR_DECLARATION,
    ACCESSOR_DECLARATIONS,
    ACCESSOR_BODY,
    ADDITIVE_EXPRESSION,
    ALLOCATION_EXPRESSION,
    ALLOWED_KEYWORDS_AS_IDENTIFIER,
    ALLOWED_KEYWORDS_AS_IDENTIFIER_FOR_METHODS,
    AND_EXPRESSION,
    ANNOTATION,
    APEX_GRAMMAR,
    ARGUMENTS,
    ARGUMENTS_LIST,
    ARRAY_DIMS_AND_INITS,
    ARRAY_INITIALIZER,
    ASSIGNMENT_OPERATOR,
    BLOCK,
    BLOCK_STATEMENT,
    BOOLEAN_LITERAL,
    BRACKETS,
    BREAK_STATEMENT,
    CAST_EXPRESSION,
    CLASS_OR_INTERFACE_BODY,
    CLASS_OR_INTERFACE_DECLARATION,
    CLASS_OR_INTERFACE_MEMBER,
    CLASS_OR_INTERFACE_TYPE,
    CONDITIONAL_AND_EXPRESSION,
    CONDITIONAL_EXPRESSION,
    CONDITIONAL_OR_EXPRESSION,
    CONSTRUCTOR_DECLARATION,
    COMPOUND_STATEMENT_EXPRESSION,
    CONTINUE_STATEMENT,
    COLLECTIONS_TYPE,
    DECIMAL_EXPONENT_NUMBER,
    DECIMAL_FLOATING_POINT_LITERAL,
    DECIMAL_LITERAL,
    DML_MERGE,
    DML_OPERATION,
    DML_OPERATIONS,
    DML_UPSERT,
    DO_STATEMENT,
    EQUAL,
    FIELD_DECLARATION,
    FOR_STATEMENT,
    ENUM_DECLARATION,
    ENUM_BODY,
    EMPTY_STATEMENT,
    EQUALITY_EXPRESSION,
    EXPLICIT_CONSTRUCTOR_INVOCATION,
    EXPRESSION,
    EXTENDS_LIST,
    FLOATING_DECIMAL,
    FLOATING_POINT_LITERAL_NUMBER,
    FOR_EACH_LOOP,
    FOR_INIT,
    FOR_LOOP,
    FORMAL_PARAMETERS,
    FORMAL_PARAMETER,
    GENERIC_TYPE,
    GET_SHARING_RULES,
    HEX_LITERAL,
    HEXADECIMAL_FLOATING_POINT_LITERAL,
    IF_STATEMENT,
    IMPLEMENTS_LIST,
    EXCLUSIVE_OR_EXPRESSION,
    INCLUSIVE_OR_EXPRESSION,
    INIT_IDENTIFIER,
    INVOKE_EXPRESSION,
    INITIALIZER,
    INITIALIZER_BLOCK,
    INITIALIZER_BLOCK_MEMBER,
    INITIALIZER_BLOCK_STATEMENT,
    INSTANCE_OF_EXPRESSION,
    INTEGER_LITERAL_NUMBER,
    LITERAL,
    LOCAL_VARIABLE_DECLARATION,
    MAP_VALUES,
    MODIFIERS,
    METHOD_DECLARATION,
    METHOD_IDENTIFIER,
    MULTIPLICATIVE_EXPRESSION,
    NAME,
    NULL_LITERAL,
    OCTAL_LITERAL,
    POST_FIX_EXPRESSION,
    PRE_DECREMENT_EXPRESSION,
    PRE_INCREMENT_EXPRESSION,
    PRIMARY_EXPRESSION,
    PRIMARY_PREFIX,
    PRIMARY_SUFFIX,
    PROPERTY_DECLARATION,
    REFERENCE_TYPE,
    RELATIONAL_EXPRESSION,
    RESULT_TYPE,
    SHIFT_EXPRESSION,
    SIMPLE_TYPE,
    RETURN_STATEMENT,
    SPECIAL_KEYWORDS_AS_IDENTIFIER,
    STATEMENT,
    STATEMENT_EXPRESSION,
    STRING_LITERAL_STRING,
    THROW_STATEMENT,
    TRY_STATEMENT,
    TYPE,
    TYPE_CLASS,
    TYPE_DECLARATION,
    UNARY_EXPRESSION,
    UNARY_EXPRESSION_NOT_PLUS_MINUS,
    VARIABLE_DECLARATOR,
    VARIABLE_INITIALIZER,
    WHILE_STATEMENT;
}
