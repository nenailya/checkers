package sample;


import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.GridPane;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static sample.smth.*;


public class Controller {
    @FXML
    GridPane gridPane;
    @FXML
    ImageView cell1;

    public void cell1() { fooForEachCell(0, 1);updateUI(); }
    public void cell2() { fooForEachCell(0, 3);updateUI(); }
    public void cell3() { fooForEachCell(0, 5);updateUI(); }
    public void cell4() { fooForEachCell(0, 7);updateUI(); }
    public void cell5() { fooForEachCell(1, 0);updateUI(); }
    public void cell6() { fooForEachCell(1, 2);updateUI(); }
    public void cell7() { fooForEachCell(1, 4);updateUI(); }
    public void cell8() { fooForEachCell(1, 6);updateUI(); }
    public void cell9() { fooForEachCell(2, 1);updateUI(); }
    public void cell10() { fooForEachCell(2, 3);updateUI(); }
    public void cell11() { fooForEachCell(2, 5);updateUI(); }
    public void cell12() { fooForEachCell(2, 7);updateUI(); }
    public void cell13() { fooForEachCell(3, 0);updateUI(); }
    public void cell14() { fooForEachCell(3, 2);updateUI(); }
    public void cell15() { fooForEachCell(3, 4);updateUI(); }
    public void cell16() { fooForEachCell(3, 6);updateUI(); }
    public void cell17() { fooForEachCell(4, 1);updateUI(); }
    public void cell18() { fooForEachCell(4, 3);updateUI(); }
    public void cell19() { fooForEachCell(4, 5);updateUI(); }
    public void cell20() { fooForEachCell(4, 7);updateUI(); }
    public void cell21() { fooForEachCell(5, 0);updateUI(); }
    public void cell22() { fooForEachCell(5, 2);updateUI(); }
    public void cell23() { fooForEachCell(5, 4);updateUI(); }
    public void cell24() { fooForEachCell(5, 6);updateUI(); }
    public void cell25() { fooForEachCell(6, 1);updateUI(); }
    public void cell26() { fooForEachCell(6, 3);updateUI(); }
    public void cell27() { fooForEachCell(6, 5);updateUI(); }
    public void cell28() { fooForEachCell(6, 7);updateUI(); }
    public void cell29() { fooForEachCell(7, 0);updateUI(); }
    public void cell30() { fooForEachCell(7, 2);updateUI(); }
    public void cell31() { fooForEachCell(7, 4);updateUI(); }
    public void cell32() { fooForEachCell(7, 6);updateUI(); }

    public void updateUI() {
       for(Node n : gridPane.getChildren()){
           ImageView img = (ImageView) n;
           img.setImage(images.get(smth.array[GridPane.getRowIndex(n)][GridPane.getColumnIndex(n)]));
        }
    }

    public Controller() {
        try {
            images.put(0, new Image(new FileInputStream("src/sample/images/0.png")));
            images.put(1, new Image(new FileInputStream("src/sample/images/1.png")));
            images.put(2, new Image(new FileInputStream("src/sample/images/2.png")));
            images.put(10, new Image(new FileInputStream("src/sample/images/10.png")));
            images.put(11, new Image(new FileInputStream("src/sample/images/11.png")));
            images.put(12, new Image(new FileInputStream("src/sample/images/12.png")));
            images.put(81, new Image(new FileInputStream("src/sample/images/81.png")));
            images.put(82, new Image(new FileInputStream("src/sample/images/82.png")));
            images.put(811, new Image(new FileInputStream("src/sample/images/811.png")));
            images.put(812, new Image(new FileInputStream("src/sample/images/812.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Map<Integer, Image> images = new HashMap<>();

}


