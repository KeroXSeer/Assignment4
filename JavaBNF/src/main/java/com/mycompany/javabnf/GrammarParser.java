/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javabnf;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

/**
 *
 * @author Jvuon
 * Jimmy Vuong
 * Programming Languages / Assignment #4
 */
@BuildParseTree
public class GrammarParser extends BaseParser<Object>{
     Rule fullName()
    {
        return Sequence(First(), space(), Last());
    }

    Rule First()
    {
        return Sequence(CapitalLetter(), LowercaseLetter());
    }

    Rule Last()
    {

        return Sequence(CapitalLetter(), LowercaseLetter());
    }

    Rule CapitalLetter()
    {
        return CharRange('A', 'Z');
    }

    Rule LowercaseLetter()
    {
        return OneOrMore(CharRange('a', 'z'));
    }

    Rule space()
    {
        return String(" ");
    }
    
}
