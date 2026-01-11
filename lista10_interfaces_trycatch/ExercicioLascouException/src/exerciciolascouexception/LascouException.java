package exerciciolascouexception;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author Arthur Coutinho
 */
public class LascouException extends Exception {

    /**
     * Creates a new instance of <code>LascouException</code> without detail
     * message.
     */
    public LascouException() {
    }

    /**
     * Constructs an instance of <code>LascouException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LascouException(String msg) {
        super(msg);
    }
}
