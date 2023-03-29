package main.java.code.Scrollbars.src;

import blobs.controller.*;
import blobs.model.*;
import blobs.view.*;

/**
 * This example shows how to add scrollbars around anything, and how to then adapt them when the
 * dimensions of the underlying component change
 *
 * This program is adding circular blobs to the screen. Use the "index-finger" mouse button to click
 * anywhere on the white portion of the screen to add a circle centered at that point and random
 * radius and color.
 https://course.ccs.neu.edu/cs3500f16/lec_17_notes.html
 */
public class InteractiveScrollbars {

  public static void main(String[] args) {


    IBlobModel model = new BlobModel(300);


    IBlobController controller = new BlobController(model);

    //add blobs through the controller so that it can ensure the contrainst of being in
    //+ve x and +y space
    controller.addBlob(50, 50, 50);
    controller.addBlob(200, 200, 60);
    controller.addBlob(150, 50, 100);
    IBlobView view = new BlobView(model.getMax().x, model.getMax().y, controller);
    controller.setView(view);

  }

}
