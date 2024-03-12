package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        int counter = 0;
        StringBuilder result = new StringBuilder();
        while(counter < personArray.length) {
            Person selectedPerson = personArray[counter];
            result.append(selectedPerson);
            counter++;

            // create a `counter`
            // while `counter` is less than length of array
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            // end loop
        }
            return result.toString();
    }




    public String forLoop() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i];
            result.append(currentPerson);
        }
        return result.toString();
    }
    // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop





    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
            for (Person person : personArray) {
                result.append(person);
            }
                return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
