package scope_final_and_static_statements.access_modifiers;

/**
 * Created by dev on 19/11/2015.
 */

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// pack1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
