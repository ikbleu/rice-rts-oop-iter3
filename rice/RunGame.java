/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//test by msavoury
/**
 *
 * @author spock
 */
package rice;

import rice.controller.Controller;
import rice.model.Model;
import rice.view.View;

public class RunGame {

    public static void main(String args[]){
        Model model = new Model();
        Controller controller = new Controller();
        View view = new View(args[0].equals("true"));
        controller.registerModel(model);
        controller.registerView(view);
        controller.start();
        while(true){
        }
    }

}
