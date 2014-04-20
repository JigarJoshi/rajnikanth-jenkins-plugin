package org.jenkinsci.plugins.rajnikanth;

import java.util.Random;

/**
 * Created by jigar.joshi on 4/20/14.
 */
public class FactGenerator {
    private static final String[] FACTS = {
            "All arrays Rajnikanth declares are of infinite size, because Rajnikanth knows no bounds.",
            "Rajnikanth doesn't have disk latency because the hard drive knows to hurry the hell up.",
            "Rajnikanth can't test for equality because he has no equal.",
            "Rajnikanth doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().",
            "Rajnikanth's first program was kill -9.",
            "Rajnikanth burst the dot com bubble.",
            "Rajnikanth writes code that optimizes itself.",
            "Rajnikanth can write infinite recursion functions... and have them return.",
            "Rajnikanth can solve the Towers of Hanoi in one move.",
            "The only pattern Rajnikanth knows is God Object.",
            "Rajnikanth finished World of Warcraft.",
            "Project managers never ask Rajnikanth for estimations... ever.",
            "Rajnikanth doesn't use web standards as the web will conform to him.",
            "\"It works on my machine\" always holds true for Rajnikanth.",
            "Whiteboards are white because Rajnikanth scared them that way.",
            "Rajnikanth's beard can type 140 wpm.",
            "Rajnikanth can unit test an entire application with a single assert.",
            "Rajnikanth doesn't bug hunt as that signifies a probability of failure, he goes bug killing.",
            "Rajnikanth's keyboard doesn't have a Ctrl key because nothing controls Rajnikanth.",
            "Rajnikanth doesn't need a debugger, he just stares down the bug until the code confesses.",
            "Rajnikanth can access private methods.",
            "Rajnikanth can instantiate an abstract class.",
            "Rajnikanth doesn't need to know about class factory pattern. He can instantiate interfaces.",
            "The class object inherits from Rajnikanth.",
            "For Rajnikanth, NP-Hard = O(1).",
            "Rajnikanth knows the last digit of PI.",
            "Rajnikanth can divide by zero.",
            "Rajnikanth doesn't get compiler errors, the language changes itself to accommodate Rajnikanth.",
            "The programs that Rajnikanth writes don't have version numbers because he only writes them once. If a user reports a bug or has a feature request they don't live to see the sun set.",
            "Rajnikanth doesn't believe in floating point numbers because they can't be typed on his binary keyboard.",
            "Rajnikanth solved the Travelling Salesman problem in O(1) time.",
            "No statement can catch the RajnikanthException.",
            "Rajnikanth doesn't program with a keyboard. He stares the computer down until it does what he wants.",
            "Rajnikanth doesn't pair program.",
            "Rajnikanth can write multi-threaded applications with a single thread.",
            "There is no Esc key on Rajnikanth' keyboard, because no one escapes Rajnikanth.",
            "Rajnikanth doesn't delete files, he blows them away.",
            "Rajnikanth can binary search unsorted data.",
            "Rajnikanth breaks RSA 128-bit encrypted codes in milliseconds.",
            "Rajnikanth went out of an infinite loop.",
            "Rajnikanth can read all encrypted data, because nothing can hide from Rajnikanth.",
            "Rajnikanth hosting is 101% uptime guaranteed.",
            "When a bug sees Rajnikanth, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.",
            "Rajnikanth rewrote the Google search engine from scratch.",
            "Rajnikanth doesn't need the cloud to scale his applications, he uses his laptop.",
            "Rajnikanth can access the DB from the UI.",
            "Rajnikanth protocol design method has no status, requests or responses, only commands.",
            "Rajnikanth programs occupy 150% of CPU, even when they are not executing.",
            "Rajnikanth can spawn threads that complete before they are started.",
            "Rajnikanth programs do not accept input.",
            "Rajnikanth doesn't need an OS.",
            "Rajnikanth can compile syntax errors.",
            "Rajnikanth compresses his files by doing a flying round house kick to the hard drive.",
            "Rajnikanth doesn't use a computer because a computer does everything slower than Rajnikanth.",
            "You don't disable the Rajnikanth plug-in, it disables you.",
            "Rajnikanth doesn't need a java compiler, he goes straight to .war",
            "Rajnikanth can use GOTO as much as he wants to. Telling him otherwise is considered harmful.",
            "There is nothing regular about Rajnikanth' expressions.",
            "Quantum cryptography does not work on Rajnikanth. When something is being observed by Rajni it stays in the same state until he's finished. ",
            "There is no need to try catching Rajnikanth' exceptions for recovery; every single throw he does is fatal.",
            "Rajnikanth' preferred IDE is hexedit.",
            "Rajinikanth threw Exception to sea, and later it is known as Dead Sea.",
            "Rajinikanth can divide by zero.",
            "When you say “no one is perfect”, Rajinikanth takes this as a personal insult.",
            "Rajnikanth's code doesn't follow a coding convention. It is the coding convention.",
            "When Rajnikanth's code fails to compile the compiler apologises.",
            "Rajnikanth coded his last project entirely in Microsoft Paint, just for the challenge.",
            "Rajnikanth's main course language is brain-f*ck",
            "When Rajnikanth points to null, null quakes in fear.",
            "Rajnikanth has root access to your system.",
            "Rajnikanth took the red pill and the blue pill, and can phase-shift in and out of the Matrix at will.",
            "when Rajnikanth gives a method an argument, the method loses",
            "when Rajnikanth pushes a value onto a stack, it stays pushed",
            "when invoking one of Jon's callbacks, the runtime adds \"please\"",
            "When Rajnikanth invokes System.gc(); garbage collector collects itself",
            "Rajnikanth can throw an exception further than anyone else, and in less time",
            "Rajnikanth doesn't need a debugger, he just stares down the bug until the code confesses",
            "Rajnikanth nce wrote an entire operating system in his sleep",
            "Rajnikanth can stop an infinite loop just by thinking about it",
            "Rajnikanth doesn't use `import;`, He thinks it is a cheating",
            "When Yoda needs advice he calls Rajnikanth",
            "Once rajnikanth hacked NSA just by using nokia 3310"};

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }

}
