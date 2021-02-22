package es.javiergarciaescobedo.ejemploslayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    StackPane paneRoot = new StackPane();
    
    StackPane pane1 = new StackPane();
    StackPane pane2 = new StackPane();
    StackPane pane3 = new StackPane();
    StackPane pane4 = new StackPane();
    StackPane pane5 = new StackPane();
            
    GridPane gridPane = new GridPane();
    BorderPane borderPane = new BorderPane();
    HBox hBox = new HBox();
    VBox vBox = new VBox();
    StackPane stackPane = new StackPane();
    FlowPane flowPane = new FlowPane();
    AnchorPane anchorPane = new AnchorPane();
    TilePane tilePane = new TilePane();
            
    @Override
    public void start(Stage stage) {
        
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        this.rellenarPaneles();
                
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()) {
                case DIGIT0:
                    paneRoot.getChildren().clear();
                    break;
                case DIGIT1:                    
                    stage.setTitle("GridPane");
                    rellenarGridPane();
                    break;
                case DIGIT2:
                    stage.setTitle("BorderPane");
                    rellenarBorderPane();
                    break;
                case DIGIT3:
                    stage.setTitle("HBox");
                    rellenarHBox();
                    break;
                case DIGIT4:
                    stage.setTitle("VBox");
                    rellenarVBox();
                    break;
                case DIGIT5:
                    stage.setTitle("StackPane");
                    rellenarStackPane();
                    break;
                case DIGIT6:
                    stage.setTitle("FlowPane");
                    rellenarFlowPane();
                    break;
                case DIGIT7:
                    stage.setTitle("AnchorPane");
                    rellenarAnchorPane();
                    break;
                case DIGIT8:
                    stage.setTitle("TilePane");
                    rellenarTilePane();
                    break;
            }
        });
    }

    private void rellenarPaneles() {
        pane1.setStyle("-fx-border-color: red; -fx-border-insets: 2px; -fx-border-width:2px");
        pane1.getChildren().add(new Label("Zona 1"));
        
        pane2.setStyle("-fx-border-color: green; -fx-border-insets: 2px; -fx-border-width:2px");
        pane2.getChildren().add(new Label("Zona 2"));

        pane3.setStyle("-fx-border-color: blue; -fx-border-insets: 2px; -fx-border-width:2px");
        pane3.getChildren().add(new Label("Zona 3"));
        
        pane4.setStyle("-fx-border-color: orange; -fx-border-insets: 2px; -fx-border-width:2px");
        pane4.getChildren().add(new Label("Zona 4"));
        
        pane5.setStyle("-fx-border-color: purple; -fx-border-insets: 2px; -fx-border-width:2px");
        pane5.getChildren().add(new Label("Zona 5"));
    }
        
    private void rellenarGridPane() {
        gridPane.add(pane1, 0, 0);
        gridPane.add(pane2, 1, 0);
        gridPane.add(pane3, 0, 1);
        gridPane.add(pane4, 1, 1);  
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(gridPane);
    }
    
    private void rellenarBorderPane() {
        borderPane.setCenter(pane1);
        borderPane.setTop(pane2);
        borderPane.setRight(pane3);
        borderPane.setBottom(pane4);
        borderPane.setLeft(pane5);        
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(borderPane);
    }
    
    private void rellenarHBox() {
        hBox.getChildren().add(pane1);
        hBox.getChildren().add(pane2);
        hBox.getChildren().add(pane3);
        hBox.getChildren().add(pane4);
        hBox.getChildren().add(pane5);
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(hBox);        
    }
    
    private void rellenarVBox() {
        vBox.getChildren().add(pane1);
        vBox.getChildren().add(pane2);
        vBox.getChildren().add(pane3);
        vBox.getChildren().add(pane4);
        vBox.getChildren().add(pane5);
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(vBox);        
    }
    
    private void rellenarStackPane() {
        stackPane.getChildren().add(pane1);
        stackPane.getChildren().add(pane2);
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(stackPane);        
    }
    
    private void rellenarFlowPane() {
        flowPane.getChildren().add(pane1);
        flowPane.getChildren().add(pane2);
        flowPane.getChildren().add(pane3);
        flowPane.getChildren().add(pane4);
        flowPane.getChildren().add(pane5);
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(flowPane);        
    }
    
    private void rellenarAnchorPane() {
        anchorPane.getChildren().add(pane1);
        anchorPane.getChildren().add(pane2);
        anchorPane.getChildren().add(pane3);
        anchorPane.getChildren().add(pane4);
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(anchorPane);     
        AnchorPane.setBottomAnchor(pane1, 10.0);
        AnchorPane.setTopAnchor(pane2, 10.0);
        AnchorPane.setRightAnchor(pane3, 10.0);
        AnchorPane.setLeftAnchor(pane4, 10.0);
    }
    
    private void rellenarTilePane() {
        tilePane.getChildren().add(pane1);
        tilePane.getChildren().add(pane2);
        tilePane.getChildren().add(pane3);
        tilePane.getChildren().add(pane4);
        tilePane.getChildren().add(pane5);
        paneRoot.getChildren().clear();
        paneRoot.getChildren().add(tilePane);    
        tilePane.setPrefTileWidth(200);
    }
    
    
    public static void main(String[] args) {
        launch();
    }

}